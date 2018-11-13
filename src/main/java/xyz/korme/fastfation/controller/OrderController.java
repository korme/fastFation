package xyz.korme.fastfation.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.korme.fastfation.common.response.RespCode;
import xyz.korme.fastfation.common.response.ResponseEntity;
import xyz.korme.fastfation.mapper.ClothesMapper;
import xyz.korme.fastfation.mapper.OrderMapper;
import xyz.korme.fastfation.mapper.SoldOutMapper;
import xyz.korme.fastfation.model.*;
import xyz.korme.fastfation.service.PriceToString.PriceToString;
import xyz.korme.fastfation.service.timeUtil.TimeUtil;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    TimeUtil timeUtil;
    @Autowired
    SoldOutMapper soldOutMapper;
    @Autowired
    ClothesMapper clothesMapper;
    @Autowired
    PriceToString priceToString;
    @RequestMapping(value = "/insertOrder")
    public ResponseEntity insertOrder(@RequestBody String oo){
        OrderInsert o=JSONObject.parseObject(oo,OrderInsert.class);
        Integer sum=0;
        for(SmallClothes i:o.getProductList()){
            sum=sum+clothesMapper.findClothesPrice(i.getIdProduct())*i.getQuantity();
        }
        Order order=new Order(o.getOpenid(),o.getMeasureId(),(short)0,sum,timeUtil.getNowTime(),null);
        orderMapper.insertOrder(order);
        int oid=order.getOrderId();
        for(SmallClothes i:o.getProductList()){
            soldOutMapper.insertSold(i,order.getOrderId());
        }
        return new ResponseEntity(RespCode.SUCCESS);
    }
    @RequestMapping(value = "/orderList")
    public ResponseEntity findOrderList(String openid){
        List<Order> temp =orderMapper.selectOrderList(openid);
        List<OrderRequset> result=new ArrayList();
        for(Order i:temp){
            Integer orderid=i.getOrderId();
            List<SoldOutRequset> tmp=soldOutMapper.selectSoldList(orderid);
            OrderRequset orderRequset=new OrderRequset(i.getCreateTime(),i.getOrderStatue(),
                    i.getOrderId(),tmp,priceToString.priceToString(i.getOrderPrice()));
            result.add(orderRequset);
        }
        return new ResponseEntity(RespCode.SUCCESS,result);
    }
}
