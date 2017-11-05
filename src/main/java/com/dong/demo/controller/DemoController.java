package com.dong.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dong.demo.enums.TypeEnum;
import com.dong.demo.service.DemoService;
import com.dong.demo.vo.DemoVO;

@Controller
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	protected DemoService demoService;

	@RequestMapping("/getDemo.do")
	@ResponseBody
	public Object getDemo(String name) {
		System.out.println(name);
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 10000; i++) {
			sb.append(i);
		}
		return new DemoVO("董智华", 30, TypeEnum.V);
	}

	@RequestMapping("/getDemo1.do")
	@ResponseBody
	public Object getDemo1() {
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < 10000; i++) {
			sb.append(i);
		}
		return new DemoVO("董智华", 30, TypeEnum.U);
	}

	@RequestMapping("/getDemo2.do")
	@ResponseBody
	public Object getDemo2() {
		String sb = "";
		for (int i = 1; i < 10000; i++) {
			sb += i;
		}
		return new DemoVO("董智华" + sb, 30, TypeEnum.U);
	}
}
