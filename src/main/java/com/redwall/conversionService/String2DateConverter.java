package com.redwall.conversionService;


import org.apache.commons.lang3.time.DateUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;

/**
 * 定义转换器
 */
@Component
public class String2DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String arg) {
        try {
            return DateUtils.parseDate(arg, new String[]{"yyyy-MM-dd HH:mm:ss"});
        } catch (ParseException e) {
            return null;
        }
    }
}
