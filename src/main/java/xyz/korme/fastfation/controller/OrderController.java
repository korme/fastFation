package xyz.korme.fastfation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.korme.fastfation.common.response.RespCode;
import xyz.korme.fastfation.common.response.ResponseEntity;
import xyz.korme.fastfation.mapper.OrderMapper;
import xyz.korme.fastfation.model.Order;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderMapper orderMapper;
    @RequestMapping(value = "/insertOrder")
    private ResponseEntity insertOrder(Order order){
        orderMapper.insertOrder(order);
        return new ResponseEntity(RespCode.SUCCESS);
    }
    @RequestMapping(value = "/orderList")
    private ResponseEntity findorderList(String openid){
        List<Order> result =orderMapper.selectOrderList(openid);
        return new ResponseEntity(RespCode.SUCCESS,result);
    }
}
