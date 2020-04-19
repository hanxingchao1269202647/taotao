package com.cn.taotao;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;


public class A {
	public static void main(String[] args) {
		Long a = Calendar.getInstance().getTimeInMillis();
		System.out.println(a);
		Long b = new Date().getTime();
		System.out.println(b);

		LocalDate localDate = LocalDate.now();
		Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
		System.out.println(timestamp.getTime());
	}

}
