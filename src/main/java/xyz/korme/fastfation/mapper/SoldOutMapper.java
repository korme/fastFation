package xyz.korme.fastfation.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import xyz.korme.fastfation.model.OrderInsert;
import xyz.korme.fastfation.model.SmallClothes;
import xyz.korme.fastfation.model.SoldOutRequset;

import java.util.List;

@Mapper
@Component(value = "SoldOutMapper")
public interface SoldOutMapper {
    @Select("select img,clothesName,quantity from soldout LEFT JOIN clothes on " +
            "soldout.clothesId=clothes.clothesId and soldout.clothesId=#{clothesId}")
    List<SoldOutRequset> selectSoldList(@Param("clothesId") Integer clothesId);
    @Insert("insert into soldout(orderId,clothesId,quantity) value(#{orderId},#{s.idProduct},#{s.quantity})")
    void insertSold(@Param("s")SmallClothes s,@Param("orderId")int orderId);
}
