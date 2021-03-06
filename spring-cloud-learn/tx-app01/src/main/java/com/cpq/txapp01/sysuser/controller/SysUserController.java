package com.cpq.txapp01.sysuser.controller;

import com.alibaba.fastjson.JSONObject;
import com.cpq.txapp01.sysuser.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/sys/user")
public class SysUserController {

    @Autowired
    SysUserService sysUserService;

    @PostMapping("/add")
    public JSONObject add(HttpServletRequest request, @RequestBody JSONObject jsonObject) throws Exception{

        sysUserService.add();

        JSONObject json = new JSONObject();
        json.put("code", 0);

        return json;
    }

    @PostMapping("/app001/app002/demo1/demo2")
    public JSONObject app01app02demo1demo2(HttpServletRequest request, @RequestBody JSONObject jsonObject) throws Exception{
        sysUserService.app01app02demo1demo2();
        JSONObject json = new JSONObject();
        json.put("code", 0);

        return json;
    }

    @PostMapping("/restsave")
    public JSONObject restsave(HttpServletRequest request, @RequestBody JSONObject jsonObject) throws Exception{
        sysUserService.restsave();
        JSONObject json = new JSONObject();
        json.put("code", 0);

        return json;
    }

}
