package xyz.korme.fastfation.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import xyz.korme.fastfation.model.Address;

import java.util.List;

@Mapper
@Component(value = "AddressMapper")
public interface AddressMapper {
    @Insert("insert into address(openid,recName,phoneNumber,address,remarks) " +
            "values(#{a.openid},#{a.recName},#{a.phoneNumber},#{a.address},#{a.remarks})")
    void insertAddress(@Param("a")Address a);
    @Select("select * from address where openid=#{openid}")
    List<Address> selectUserAddress(@Param("openid")String openid);
    @Select("select * from address where addressId=#{addressId}")
    Address selectSingeleAddress(@Param("addressId")Integer addressId);
}
