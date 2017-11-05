package com.dong.meat;

import org.apache.log4j.Logger;

public class MeatServer implements MeatFacade {
	Logger log = Logger.getLogger(MeatFacade.class);
	public Meat getMeat() {
		Meat m = new Meat();
		m.setDesc("NOW: " + System.currentTimeMillis());
		log.info("go go go !!!");
		return m;
	}
}
