package com.tuyufeng.test;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.tuyufeng.common.utils.DateUtil;
import com.tuyufeng.common.utils.RandomUitl;
import com.tuyufeng.common.utils.StringUtil;
import com.tuyufeng.entity.Person;


public class StringUtilTest {
	
	  @Test public void testHasLength() { }
	 
	  @Test public void testHasText() { }
	  
	  @Test public void testRandomChineseString() {
	  
	  String string = StringUtil.randomChineseString(400);
	  System.out.println(string.length()); }
	  
	  @Test public void testGenerateChineseName() { // String string =
	  StringUtil.generateChineseName(); // System.out.println(string);
	  StringUtil.hasLength(null, "abc");
	  
	  }
	 
	  @Test public void testPerson() { Calendar c = Calendar.getInstance();
	  c.set(2010, 0, 1);
	  
	  for (int i = 0; i < 10000; i++) { Person person = new
	  Person(StringUtil.generateChineseName(), RandomUitl.random(1, 120),
	  
	  StringUtil.randomChineseString(140), DateUtil.randomDate(c.getTime()));
	  
	  System.out.println(person); }
	 
	 }
	  
	  @Test public void testDateUtil(){ Calendar c = Calendar.getInstance();
	  c.set(2010, 0, 1);
	  
	  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	  
	 
	 
	  for(int i=0;i<1000;i++) { Date date = DateUtil.randomDate(c.getTime());
	  System.out.println(df.format(date)); }
	  
	 }
	 
}
