package xyz.korme.fastfation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.korme.fastfation.common.response.RespCode;
import xyz.korme.fastfation.common.response.ResponseEntity;
import xyz.korme.fastfation.mapper.ClothesMapper;
import xyz.korme.fastfation.model.Clothes;

import java.util.List;

@RestController
public class ClothesController {
    @Autowired
    ClothesMapper clothesMapper;
    @RequestMapping("/clothesList")
    public ResponseEntity findClothesList(short category){
        List<Clothes> result=clothesMapper.selectClothesList(category);
        return new ResponseEntity(RespCode.SUCCESS,result);
    }

}
