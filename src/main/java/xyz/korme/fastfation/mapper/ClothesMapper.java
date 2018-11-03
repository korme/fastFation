package xyz.korme.fastfation.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import xyz.korme.fastfation.model.Clothes;
import xyz.korme.fastfation.model.ClothesDetail;

import java.util.List;

@Mapper
@Component(value = "ClouthesMapper")
public interface ClothesMapper {

    @Select("select clothesId,clothesName,img,showPrice from clothes where category=#{category}")
    List<Clothes> selectClothesList(@Param("category")short category);

    @Select("select * from clothes where clothesId=#{clothesId} ")
    ClothesDetail selectClothesDetail(@Param("clothesId") Integer clothesId);

}
