package com.example.async.handler;

import com.alibaba.fastjson.JSONObject;
import com.example.async.EventHandler;
import com.example.async.EventModel;
import com.example.async.EventType;
import com.example.model.*;
import com.example.service.FeedService;
import com.example.service.MessageService;
import com.example.service.QuestionService;
import com.example.service.UserService;
import com.example.util.WendaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.print.DocFlavor;
import java.util.*;

/**
 * Created by YiXin on 2017/3/14.
 */
@Component
public class FeedHandler implements EventHandler {
    @Autowired
    MessageService messageService;

    @Autowired
    QuestionService questionService;

    @Autowired
    UserService userService;

    @Autowired
    FeedService feedService;

    private String buildFeedData(EventModel model) {
        Map<String, String> map = new HashMap<String, String>();
        User actor = userService.getUser(model.getActionId());
        if (actor == null) {
            return null;
        }
        map.put("userId", String.valueOf(actor.getId()));
        map.put("userHead", actor.getHeadUrl());
        map.put("userName", actor.getName());

        if (model.getType() == EventType.COMMENT ||
                (model.getType() == EventType.FOLLOW && model.getEntityType() == EntityType.ENTITY_QUESTION)) {
            Question question = questionService.getById(model.getEntityId());
            if (question == null) {
                return null;
            }
            map.put("questionId", String.valueOf(question.getId()));
            map.put("questionTitle", question.getTitle());
            return JSONObject.toJSONString(map);
        }
        return null;

    }

    @Override
    public void doHandler(EventModel model) {
        Feed feed = new Feed();
        feed.setCreatedDate(new Date());
        feed.setUserId(model.getActionId());
        feed.setType(model.getType().getValue());
        feed.setData(buildFeedData(model));
        if (feed.getData() == null) {
            return;
        }
        feedService.addFeed(feed);
    }

    @Override
    public List<EventType> getSupportEventTypes() {
        return Arrays.asList(new EventType[]{EventType.COMMENT, EventType.FOLLOW});
    }
}
