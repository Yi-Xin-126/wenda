package com.example.async;

import com.alibaba.fastjson.JSONObject;
import com.example.util.JedisApater;
import com.example.util.RedisKeyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by YiXin on 2017/3/14.
 */
@Service
public class EventProducer {
    @Autowired
    JedisApater jedisApater;

    public boolean fireEvent(EventModel eventModel) {
        try {
            String json = JSONObject.toJSONString(eventModel);
            String key = RedisKeyUtil.getEventQueueKey();
            jedisApater.lpush(key, json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
