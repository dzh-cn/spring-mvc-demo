package com.dong.converte.converter;

import org.springframework.core.convert.converter.Converter;

import com.dong.demo.enums.TypeEnum;

public class StringToEnumConverter implements Converter<String, TypeEnum> {

	public TypeEnum convert(String source) {
		return TypeEnum.valueOf("");
	}

}
