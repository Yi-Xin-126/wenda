package com.example;

import com.example.dao.QuestionDAO;
import com.example.dao.UserDAO;
import com.example.model.EntityType;
import com.example.model.Question;
import com.example.model.User;
import com.example.service.FollowService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;
import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
//@Sql("/init-schema.sql")
public class InitDatabaseTests {

//	@Autowired
//	UserDAO userDAO;
//	@Autowired
//	QuestionDAO questionDAO;
//	@Autowired
//	FollowService followService;
//
//	@Testo
//	public void initDatabase() {
//		Random random = new Random();
//		for (int i = 0; i < 11; i++) {
//			User user = new User();
//			user.setHeadUrl(String.format("http://images.nowcoder.com/head/%dt.png",random.nextInt(1000)));
//			user.setName(String.format("USER[%d]",i));
//			user.setPassword("");
//			user.setSalt("");
//			userDAO.addUser(user);
//			user.setPassword("xx");
//			userDAO.updatePassword(user);
//			//互相关注
//			for (int j = 1; j < i; j++) {
//				followService.follow(j, EntityType.ENTITY_USER, i);
//			}
//
//			Question question = new Question();
//			question.setCommentCount(i);
//			Date date = new Date();
//			date.setTime(date.getTime() + 1000*3600*i);
//			question.setCreatedDate(date);
//			question.setUserId(i + 1);
//			question.setTitle(String.format("TITLE[%d]", i));
//			question.setContent(String.format("waowaoawo Content[%d]", i));
//			questionDAO.addQuestion(question);
//
//		}
//
//
//	}

}
