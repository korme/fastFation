package xyz.korme.fastfation.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import xyz.korme.fastfation.model.User;

@Mapper
@Component(value = "userMapper")
public interface UserMapper {
    @Insert("insert into user(nickname,openid,sessionKey,createTime) " +
            "values(#{user.nickname},#{user.openid},#{user.sessionKey},#{user.createTime})")
    void insertUserData(@Param("user") User user);

    @Select("select count(*) from user where openid=#{openid}")
    int existOpenid(@Param("openid")String openid);
}
