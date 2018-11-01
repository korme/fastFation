package xyz.korme.fastfation.controller;

import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.korme.fastfation.common.response.RespCode;
import xyz.korme.fastfation.common.response.ResponseEntity;
import xyz.korme.fastfation.mapper.HomepageMapper;
import xyz.korme.fastfation.model.Homepage;

import java.util.List;


@RestController
public class HomepageController {
    @Autowired
    HomepageMapper homepageMapper;
    @RequestMapping(value="/homepage")
    public ResponseEntity getHomepage(){
        List<Homepage> result= homepageMapper.getHomepage();
        return new ResponseEntity(RespCode.SUCCESS,result);
    }
}
