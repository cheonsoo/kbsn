package com.kbsn.restapi.dao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.kbsn.restapi.dao.USERDao;
import com.kbsn.restapi.data.USER;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring/application-config.xml"})
public class USERDaoTest {
	
	@Autowired
	private USERDao userDao;
	
	@Test
	public void getUser() {
		USER user = userDao.getUser(1);
		Assert.isInstanceOf(USER.class, user);
	}

}
