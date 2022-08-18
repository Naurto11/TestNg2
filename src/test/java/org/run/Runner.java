package org.run;

import java.io.IOException;

import org.base.BaseClass;
import org.com.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner extends BaseClass {
	
	@BeforeClass
	
	private void browserLaunch() {
		
		launchBrowser();
		maxBrowser();
		
		System.out.println(driver.getCurrentUrl());

	}
	@AfterClass
	
	private void browserClose() {

		closebrowser();
		
		
	}

	
	@BeforeMethod
	
	public void startsTime() {
		
		passUrl("https://www.instagram.com/?hl=en");

	}
	
	@AfterMethod
	
	public void endsTime() throws InterruptedException {
		
		Thread.sleep(7000);
		
	

	}
	@Test
	
	private void tc1() throws IOException {
		
		LoginPojo l=new LoginPojo();
		toInput(l.getTextuser(), excelRead(1, 2));
		toInput(l.getTxtpass(), excelRead(3, 0));
		getValue(l.getTextuser());
		getValue(l.getTxtpass());
	//	System.out.println("my excel"+l.getTxtpass());
		btnClick(l.getPresbtn());
		
		

	
	}
	@Test
	private void tc2() throws IOException {
		
		LoginPojo l1=new LoginPojo();
		toInput(l1.getTextuser(), excelRead(2, 1));
		toInput(l1.getTxtpass(), excelRead(3, 4));
		getValue(l1.getTextuser());
		getValue(l1.getTxtpass());
		
		
		btnClick(l1.getPresbtn());

	}
	@Test
	private void tc3() throws IOException {
		LoginPojo l2=new LoginPojo();
		toInput(l2.getTextuser(), excelRead(5, 1));
		toInput(l2.getTxtpass(), excelRead(3, 0));
		getValue(l2.getTextuser());
		getValue(l2.getTxtpass());

	}
	@Test
	private void tc4() throws IOException {
		LoginPojo l3=new LoginPojo();
		toInput(l3.getTextuser(), excelRead(8, 3));
		toInput(l3.getTxtpass(), excelRead(1, 4));
		getValue(l3.getTextuser());
		getValue(l3.getTxtpass());

	}
	private void tc5() throws IOException {

		LoginPojo l4=new LoginPojo();
		toInput(l4.getTextuser(), excelRead(3, 2));
		toInput(l4.getTxtpass(), excelRead(0, 1));
		getValue(l4.getTextuser());
		getValue(l4.getTxtpass());
	}	
}
