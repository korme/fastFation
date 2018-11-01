package xyz.korme.fastfation.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import xyz.korme.fastfation.model.Homepage;

import java.util.List;

@Mapper
@Component(value = "Homepage")
public  interface HomepageMapper {
    @Select("select * from homepage")
    public List<Homepage> getHomepage();
}
