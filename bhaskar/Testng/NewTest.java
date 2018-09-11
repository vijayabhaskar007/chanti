package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=2)
  public void f() {
	  int a=10;
	  int b=20;
	  int c=a+b;
	  Assert.assertEquals(c, 30);
	  
  }
  @Test(priority=1)
  public void VerifyButton() {
	  int a=10;
	  int b-20;
	  int c=a+b;
	  Assert.assertEquals(c, 40);
  }
  @Test(enabled=false)
  public void VerifyB() {
	  System.out.println("testb method");
  }
  @Test(priority=2)
  public void VerifyC() {
	  System.out.println("testc method");
  }
}.
