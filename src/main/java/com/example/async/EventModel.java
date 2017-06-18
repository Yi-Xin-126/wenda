package com.example.async;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YiXin on 2017/3/14.
 */
public class EventModel {
    private EventType type;
    private int actionId;
    private int entityType;
    private int entityId;
    private int entityOwnderId;


    private Map<String, String> exts = new HashMap<String, String>();

    public EventModel() {

    }

    public EventModel setExt(String key, String value) {
        exts.put(key, value);
        return this;
    }

    public String getExt(String key) {
        return exts.get(key);
    }

    public EventType getType() {
        return type;
    }

    public EventModel setType(EventType type) {
        this.type = type;
        return this;
    }

    public int getActionId() {
        return actionId;
    }

    public EventModel setActionId(int actionId) {
        this.actionId = actionId;
        return this;
    }

    public int getEntityType() {
        return entityType;
    }

    public EventModel setEntityType(int entityType) {
        this.entityType = entityType;
        return this;
    }

    public int getEntityId() {
        return entityId;
    }

    public EventModel setEntityId(int entityId) {
        this.entityId = entityId;
        return this;
    }

    public int getEntityOwnderId() {
        return entityOwnderId;
    }

    public EventModel setEntityOwnderId(int entityOwnderId) {
        this.entityOwnderId = entityOwnderId;
        return this;
    }

    public Map<String, String> getExts() {
        return exts;
    }

    public EventModel setExts(Map<String, String> exts) {
        this.exts = exts;
        return this;
    }

    public EventModel(EventType type) {
        this.type = type;
    }
}
