package com.dong.converte.support;


public interface EnumSupport {

	<T extends Enum<T>> T valueOf(Class<T> enumType,
            String name);
}
