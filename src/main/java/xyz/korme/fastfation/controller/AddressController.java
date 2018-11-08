package xyz.korme.fastfation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.korme.fastfation.common.response.RespCode;
import xyz.korme.fastfation.common.response.ResponseEntity;
import xyz.korme.fastfation.mapper.AddressMapper;
import xyz.korme.fastfation.model.Address;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressMapper addressMapper;
    @RequestMapping(value = "/addressList")
    public ResponseEntity addressList(String openid){
        List<Address> result=addressMapper.selectUserAddress(openid);
        return new ResponseEntity(RespCode.SUCCESS,result);
    }
    @RequestMapping(value = "/addressSingle")
    public ResponseEntity addressSingle(Integer addressId){
        Address result=addressMapper.selectSingeleAddress(addressId);
        return new ResponseEntity(RespCode.SUCCESS,result);
    }
    @RequestMapping(value = "/insertAddress")
    public ResponseEntity addressSingle(Address address){
        addressMapper.insertAddress(address);
        return new ResponseEntity(RespCode.SUCCESS);
    }

}
