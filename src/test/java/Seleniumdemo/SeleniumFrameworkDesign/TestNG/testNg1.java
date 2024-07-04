package Seleniumdemo.SeleniumFrameworkDesign.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class testNg1 {
	@Parameters({"url"})
	@Test
	public void Demo(String urlname){
	System.out.println(urlname);
	}

@Test(groups={"smoke"})
public void Demo(){
System.out.println("smoke");
}
	@Test(enabled=false)
	public void Demofdfd(){
	System.out.println("enabled");

}
	@Test(timeOut=5000)
	public void Demofdflld(){
	System.out.println("timeOut");

}
	
	@Test(dependsOnMethods={"Demo"})
	public void Demorere(){
	System.out.println("hello1 smoke testing");

}
@BeforeMethod
	public void Demoee(){
	System.out.println("BeforeMethod");

}
	@AfterTest
	public void Demo2(){
		System.out.println("AfterTest");
		
}
	@BeforeSuite
	public void Demo3(){
		System.out.println("beforesuite");
	}
		@BeforeTest
		public void Demo5(){
	System.out.println("Beforetest");
		}
}