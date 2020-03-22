package BoraTech;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void addition() {
	  
	 int result = 5+5;
	 int expectedResult = 10;
	 Assert.assertEquals(result, expectedResult);
	  
  }
  
  @Test
  public void subtraction() {
	  
	 int result = 15-5;
	 int expectedResult = 10;
	 Assert.assertEquals(result, expectedResult);
	  
  }
  @Test
  public void multiply() {
	  
	 int result = 10*5;
	 int expectedResult = 50;
	 Assert.assertEquals(result, expectedResult);
	  
	 
  }
  @Test
  public void division() {
	  
	 int result = 15 / 5;
	 int expectedResult = 3;
	 Assert.assertEquals(result, expectedResult);
	  
  }
}
