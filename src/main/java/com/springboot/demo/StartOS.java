package com.springboot.demo;

import org.junit.Test;

public class StartOS {
	
	//启动程序的方式1：main方法
	public static void main(String[] args) {
		System.out.println("StartOS.main()");
	}
	//启动程序的方式2：单元测试
	@Test
	public void demo() {
		System.out.println("StartOS.demo()");
	}
	//启动程序的方式3：
	/*public static void main(String[] args) {
		Main.main(args);
	}*/
	
}
