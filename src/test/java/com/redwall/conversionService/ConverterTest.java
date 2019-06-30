package com.redwall.conversionService;

import org.junit.Test;
import org.springframework.core.convert.support.DefaultConversionService;

import java.util.Date;

public class ConverterTest {
    @Test
    public void testString2DateConverter(){
        DefaultConversionService conversionService = new DefaultConversionService();
        conversionService.addConverter(new String2DateConverter());

        String dateStr = "2019-06-15 11:49:50";
        Date daate = conversionService.convert(dateStr, Date.class);
        System.out.println(daate);


    }
}
