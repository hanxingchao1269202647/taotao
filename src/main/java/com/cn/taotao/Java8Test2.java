package com.cn.taotao;

import java.util.Arrays;
import java.util.List;


public class Java8Test2 {

	public static void main(String[] args) {
		new Thread(() -> System.out.println("In Java8, Lambda expression rocks !!")).start();

		List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		features.forEach(e -> System.out.println(e));
	}

}
