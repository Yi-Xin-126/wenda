package com.example.async;

import java.util.List;

/**
 * Created by YiXin on 2017/3/14.
 */
public interface EventHandler {
    void doHandler(EventModel model);
    List<EventType> getSupportEventTypes();
}
