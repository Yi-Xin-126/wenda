package com.example.service;

import org.springframework.stereotype.Service;

/**
 * Created by YiXin on 2017/2/9.
 */
@Service
public class WendaService {
    public String getMessage(int userId) {
        return "Hello Message:" + String.valueOf(userId);
    }
}
