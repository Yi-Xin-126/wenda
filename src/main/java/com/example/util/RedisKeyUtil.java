package com.example.util;

/**
 * Created by YiXin on 2017/3/14.
 */
public class RedisKeyUtil {
    private static String SPILT = ":";
    private static String BIZ_LIKE = "LIKE";
    private static String BIZ_DISLIKE = "DISLIKE";

    public static String getLikeKey(int entityType, int entityId) {
        return BIZ_LIKE + SPILT + String.valueOf(entityType) + SPILT + String.valueOf(entityId);
    }

    public static String getDisLikeKey(int entityType, int entityId) {
        return BIZ_DISLIKE + SPILT + String.valueOf(entityType) + SPILT + String.valueOf(entityId);
    }
}
