package xyz.korme.fastfation.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import xyz.korme.fastfation.model.Order;

import java.util.List;

@Mapper
@Component(value ="Order")
public interface OrderMapper {
    @Insert("insert into orders(openid,measureId,orderStatue,orderPrice,clothesId,quantity,createTime) " +
            "value(#{o.openid},#{o.measureId},#{o.orderStatue},#{o.orderPrice}," +
            "#{o.clothesId},#{o.quantity},#{o.createTime})")
    void insertOrder(@Param("o") Order o);
    @Select("select * from orders where openid =#{openid} and orderStatue=0")
    List<Order> selectOrderList(@Param("openid")String openid);
}
