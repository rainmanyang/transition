package com.hxcy.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations="classpath*:applicationContext.xml") 
@ActiveProfiles("production")
public class SpringTxTestCase extends
		AbstractTransactionalJUnit4SpringContextTests {

}