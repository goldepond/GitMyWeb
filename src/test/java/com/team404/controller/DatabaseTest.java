package com.team404.controller;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/DB-context.xml")
public class DatabaseTest {
	@Autowired
	private DataSource dataSource;
	@Test
	public void test() {
		System.out.println("hellow");
		try {
			Connection conn = dataSource.getConnection();
			System.out.println("3333333333333" + conn);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
