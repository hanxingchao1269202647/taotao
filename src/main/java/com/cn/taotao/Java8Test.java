package com.cn.taotao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Java8Test {

	public static void main(String[] args) {
		List<String> names1 = new ArrayList<String>();
		names1.add("Google ");
		names1.add("Runoob ");
		names1.add("Taobao ");
		names1.add("Baidu ");
		names1.add("Sina ");

		List<String> names2 = new ArrayList<String>();
		names2.add("Google ");
		names2.add("Runoob ");
		names2.add("Taobao ");
		names2.add("Baidu ");
		names2.add("Sina ");

		Java8Test tester = new Java8Test();
		System.out.println("ʹ�� Java 7 �﷨: ");

		tester.sortUsingJava7(names1);
		System.out.println(names1);
		System.out.println("ʹ�� Java 8 �﷨: ");

		tester.sortUsingJava8(names2);
		System.out.println(names2);

	}

	private void sort(List<String> names) {
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}

		});
	}

	private void so8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}

	// ʹ�� java 7 ����
	private void sortUsingJava7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
	}

	// ʹ�� java 8 ����
	private void sortUsingJava8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}

}
