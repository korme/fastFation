package xyz.korme.fastfation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.korme.fastfation.common.response.RespCode;
import xyz.korme.fastfation.common.response.ResponseEntity;
import xyz.korme.fastfation.mapper.ClothesMapper;
import xyz.korme.fastfation.model.Clothes;
import xyz.korme.fastfation.model.ClothesDetail;
import xyz.korme.fastfation.model.ClothesDetailRes;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClothesController {
    @Autowired
    ClothesMapper clothesMapper;
    @RequestMapping("/clothesList")
    public ResponseEntity findClothesList(short cateid){
        List<Clothes> result=clothesMapper.selectClothesList(cateid);
        for(Clothes i:result){
            i.setPrice(i.getShowPrice());
        }
        return new ResponseEntity(RespCode.SUCCESS,result);
    }

    @RequestMapping("/couthesDetail")
    private ResponseEntity findClothesDetail(Integer idProduct){
        ClothesDetail temp=clothesMapper.selectClothesDetail(idProduct);
        List<String> img=new ArrayList();
        List<String> detailImg=new ArrayList();
        String tempString=temp.getImg0();
        if(tempString!=""&&tempString!=null)
            img.add(tempString);
        tempString=temp.getImg1();
        if(tempString!=""&&tempString!=null)
            img.add(tempString);
        tempString=temp.getImg2();
        if(tempString!=""&&tempString!=null)
            img.add(tempString);
        tempString=temp.getShowImg0();
        if(tempString!=""&&tempString!=null)
            detailImg.add(tempString);
        tempString=temp.getShowImg1();
        if(tempString!=""&&tempString!=null)
            detailImg.add(tempString);
        tempString=temp.getShowImg2();
        if(tempString!=""&&tempString!=null)
            detailImg.add(tempString);
        ClothesDetailRes result=new ClothesDetailRes(temp.getClothesName(),img,temp.getShowPrice(),temp.getDetailText(),detailImg);
        return new ResponseEntity(RespCode.SUCCESS,result);
    }


}
