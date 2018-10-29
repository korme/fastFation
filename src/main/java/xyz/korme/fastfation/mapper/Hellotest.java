package xyz.korme.fastfation.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "hellotest")
public interface Hellotest {
    @Select("select openid from address where addressid = #{addressid}")
    public String hel(@Param("addressid")int addressid);
}
