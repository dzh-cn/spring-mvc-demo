package com.dong.demo.enums;

import com.dong.demo.model.EnumModel;

public enum TypeEnum implements EnumModel<Integer> {

	V(1, "有效"), U(0, "无效");
	private TypeEnum(int x, String y) {
		this.code = x;
		this.desc = y;
	}

	private Integer code;
	private String desc;

	public Integer getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
}
