package xyz.korme.fastfation.service.wxapi;

import org.springframework.stereotype.Service;

@Service
public interface WxApi {
    String getOpenid(String code);
}