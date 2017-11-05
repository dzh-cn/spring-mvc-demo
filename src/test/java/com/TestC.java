package com;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dong.meat.MeatFacade;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:dubbo-facade.xml")
public class TestC {

	@Autowired
	MeatFacade meatFacade;

	Logger log = Logger.getLogger(TestC.class);
	@Test
	public void main() {
		log.warn(meatFacade.getMeat().getDesc());
	}
}
