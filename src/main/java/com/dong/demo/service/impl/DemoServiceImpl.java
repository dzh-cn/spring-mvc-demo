package com.dong.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.dong.demo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	public static Map<Long, Object> data = new HashMap<Long, Object>();

	public void doAction() {
		StringBuilder sb = new StringBuilder();
		for(int i =1; i<10000; i++) {
			sb.append(i);
		}
//		System.out.println(sb);
	}
}
