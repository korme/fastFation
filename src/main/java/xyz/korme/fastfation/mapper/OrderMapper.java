package xyz.korme.fastfation.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import xyz.korme.fastfation.model.Order;

import java.util.List;

@Mapper
@Component(value ="orderMapper")
public interface OrderMapper {
    @Insert("insert into orders(openid,measureId,orderStatue,orderPrice,createTime,addressId) " +
            "value(#{o.openid},#{o.measureId},#{o.orderStatue},#{o.orderPrice},#{o.createTime},#{o.addressId})")
    @Options(useGeneratedKeys=true, keyProperty="o.orderId")
    void insertOrder(@Param("o") Order o);
    @Select("select * from orders where openid =#{openid} and orderStatue=0")
    List<Order> selectOrderList(@Param("openid")String openid);
}
