package org.run;

import java.io.IOException;

import org.base.BaseClass;
import org.pojo.Pojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner2 extends BaseClass {

	@BeforeClass
	private void browserLaunch() {

		launchBrowser();
		maxBrowser();
	}

	@AfterClass
	private void browserClose() {
		closebrowser();

	}

	@BeforeMethod
	public void startstime() {
		passUrl("https://en-gb.facebook.com/");

	}

	@AfterMethod
	public void endsTime() throws InterruptedException {

		Thread.sleep(3000);

	}

	@Test
	private void tc1() throws InterruptedException, IOException {

		//method1
		
		
//		String [] username= {"    ", "suresh", "dinesh@1234gmail.com", "sureshsatz2000@gmail.com"};
//		String [] password= {"@#$%", "dinesh", " suresh@123  ", "9384646016"};
//	Pojo p=new Pojo();
//	
//	for (int i = 0; i <= username.length -1; i++) {
//		
//		toInput(p.getTxtuser(), username[i]);
//		toInput(p.getTxtpass(), password[i]);
//		
//		btnClick(p.getClkbtn());
//		Thread.sleep(3000);
//		driver.navigate().back();
//		
////		System.out.println(username[i]);
////		System.out.println(password[i]);
////		
////
		String[] username = { excelRead(1, 0), excelRead(2, 0),excelRead(3, 0),excelRead(4, 2)};
		String[] password = { excelRead(1, 3),excelRead(2, 3),excelRead(3, 3),excelRead(4, 3) };
	
		Pojo p = new Pojo();

		System.out.println("length of username"+username.length);
		System.out.println("length of the password"+password.length);
		for (int i = 0; i <= username.length - 1; i++) {

			toInput(p.getTxtuser(), username[i]);
			toInput(p.getTxtpass(), password[i]);

			btnClick(p.getClkbtn());
			Thread.sleep(3000);
			driver.navigate().back();

			System.out.println(username[i]);
			System.out.println(password[i]);

	}

	}
	
}
	
