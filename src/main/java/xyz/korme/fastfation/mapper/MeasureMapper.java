package xyz.korme.fastfation.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import xyz.korme.fastfation.model.MeasureInfo;

import java.util.List;

@Mapper
@Component(value ="measureInfo")
public interface MeasureMapper {
    @Insert("insert into measureinfo (openid,sizeName,weight,height,bust,neck," +
            "sleeve,waist,trousers,notes,types,timeAdd) value(#{m.openid},#{m.sizeName},#{m.weight},#{m.height}," +
            "#{m.bust},#{m.neck},#{m.sleeve},#{m.waist},#{m.trousers},#{m.notes},#{m.types},#{m.timeAdd})")
    void insetMeasureInfo(@Param("m") MeasureInfo m);

    @Select("select * from measureinfo where measureId=#{measureId}")
    MeasureInfo selectMeausereinfoSingle(@Param("measureId")Integer measureId);

    @Select("select * from measureinfo where openid=#{openid}")
    List<MeasureInfo> selectMeausereinfoList(@Param("openid")String openid);
}
