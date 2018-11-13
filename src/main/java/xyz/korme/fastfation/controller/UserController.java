package xyz.korme.fastfation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.korme.fastfation.common.response.RespCode;
import xyz.korme.fastfation.common.response.ResponseEntity;
import xyz.korme.fastfation.mapper.UserMapper;
import xyz.korme.fastfation.model.RequestUser;
import xyz.korme.fastfation.model.User;
import xyz.korme.fastfation.service.timeUtil.TimeUtil;
import xyz.korme.fastfation.service.wxapi.WxApi;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    //mapper注入
    @Autowired
    UserMapper userMapper;

    //时间工具类注入
    @Autowired
    TimeUtil timeUtil;

    //微信官方接口处理
    @Autowired
    WxApi wxApi;

    @Transactional
    @RequestMapping(value = "/login")
    public ResponseEntity insertUser(RequestUser data) {
        //获取用户openid

        //String openid = wxApi.getOpenid(data.getCode());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("init");//设置日期格式
        System.out.println(df.format(new Date()));
        String openid = wxApi.getOpenid(data.getCode());
        if (openid == null || openid == "") {
            System.out.println("错了错了错了错了错了错了错了错了");
        }
        System.out.println(openid);
        //做查询操作 看是否重复
        if (userMapper.existOpenid(openid) != 0) {
           /* Map result = new HashMap();
            User user=userMapper.existOpenid(openid);
            result.put("userid",user.getUserid());
            result.put("nickname",user.getNickname());
            result.put("openid",openid);*/
            return new ResponseEntity(RespCode.SUCCESS, openid);
        }
        User user;

        //拟合要插入的数据
        try {
            user = new User(data.getNickname(), openid, null, timeUtil.getNowTime());
        } catch (NumberFormatException e) {
            System.out.println("数字格式错误");
            return new ResponseEntity(RespCode.WARN);
        }


        userMapper.insertUserData(user);

       /* Map result = new HashMap();
        result.put("userid",user.getUserid());
        result.put("nickname",user.getNickname());
        result.put("openid",openid);*/


        return new ResponseEntity(RespCode.SUCCESS, openid);
    }

    @RequestMapping("/test")
    public String test() {
        return "running";
    }
}
