package xyz.korme.fastfation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.korme.fastfation.common.response.RespCode;
import xyz.korme.fastfation.common.response.ResponseEntity;
import xyz.korme.fastfation.mapper.MeasureMapper;
import xyz.korme.fastfation.model.MeasureInfo;

import java.util.List;

@RestController
public class MeasureController {
    @Autowired
    MeasureMapper measureMapper;

    @RequestMapping(value = "/insertMeasureInfo")
    public ResponseEntity insertMeasureInfo(MeasureInfo measureInfo){
        measureMapper.insetMeasureInfo(measureInfo);
        return new ResponseEntity(RespCode.SUCCESS);
    }
    @RequestMapping(value = "/MeasureInfoSingle")
    public ResponseEntity MeasureInfoSingle(Integer measureId){
        MeasureInfo result=measureMapper.selectMeausereinfoSingle(measureId);
        return new ResponseEntity(RespCode.SUCCESS,result);
    }
    @RequestMapping(value = "/MeasureInfoList")
    public ResponseEntity MeasureInfoList(String openid){
        List<MeasureInfo> result=measureMapper.selectMeausereinfoList(openid);
        return new ResponseEntity(RespCode.SUCCESS,result);
    }


}
