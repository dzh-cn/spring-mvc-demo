package com.dong.converte;

import org.springframework.core.convert.support.DefaultConversionService;

import com.dong.converte.converter.StringToEnumConverter;

public class ConversionServiceImpl extends DefaultConversionService {

	public void init() {
		super.addConverter(String.class, Enum.class, new StringToEnumConverter());
	}
}
