package cn.itrip.controller;

import cn.itrip.dao.itripUser.ItripUserMapper;
import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author: Star
 * @create: 2021-10-11 18:24
 */
@Controller
public class Test1 {

    @Resource
    ItripUserMapper user;

    @RequestMapping(value = "/json", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public Object list(int pid) throws Exception{

        System.out.println(pid);

        return JSONArray.toJSON(user.getItripUserById(new Long(pid)));
    }


}