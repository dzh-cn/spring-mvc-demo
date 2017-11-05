package com.dong.demo.vo;

import com.dong.demo.enums.TypeEnum;

public class DemoVO {

	public DemoVO() {
	}

	public DemoVO(String name, Integer age, TypeEnum type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}

	private String name;
	private Integer age;
	private TypeEnum type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

}
