package com.example.util;

/**
 * Created by YiXin on 2017/3/14.
 */
public class RedisKeyUtil {
    private static String SPILT = ":";
    private static String BIZ_LIKE = "LIKE";
    private static String BIZ_DISLIKE = "DISLIKE";
    private static String BIZ_EVENTQUEUE = "EVENT_QUEUE";

    //粉丝
    private static String BIZ_FOLLOWER = "FOLLOWER";
    //关注对象
    private static String BIZ_FOLLOWEE = "FOLLOWEE";
    private static String BIZ_TIMELINE = "TIMELINE";

    public static String getLikeKey(int entityType, int entityId) {
        return BIZ_LIKE + SPILT + String.valueOf(entityType) + SPILT + String.valueOf(entityId);
    }

    public static String getDisLikeKey(int entityType, int entityId) {
        return BIZ_DISLIKE + SPILT + String.valueOf(entityType) + SPILT + String.valueOf(entityId);
    }

    public static String getEventQueueKey() {
        return BIZ_EVENTQUEUE;
    }

    public static String getFollowerKey(int entityType, int entityId) {
        return BIZ_FOLLOWER + SPILT + String.valueOf(entityType) + SPILT + String.valueOf(entityId);
    }

    public static String getTimelineKey(int userId) {
        return BIZ_TIMELINE + SPILT + String.valueOf(userId);
    }

    public static String getFolloweeKey(int userId, int entityType) {
        return BIZ_FOLLOWEE + SPILT + String.valueOf(userId) + SPILT + String.valueOf(entityType);
    }
}
