package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class IndexController {
    @RequestMapping(path = {"/","/index"})
    @ResponseBody
    public String index(){

        return "welcome";
    }

    @RequestMapping(path = {"/profile/{groupId}/{userId}"})
    @ResponseBody
    public String profile(@PathVariable("userId") int userId,
                          @PathVariable("groupId") String groupId,
                          @RequestParam(value = "type",defaultValue="1") int type,
                          @RequestParam(value = "key",defaultValue="65") String key)
    {
        return String.format("Profile page of %s / %d,t: %d,k:%s",groupId,userId,type,key);
    }

    @RequestMapping(path = {"/vm"},method = {RequestMethod.GET})
    public String templae(){
        return "home";
    }
}
