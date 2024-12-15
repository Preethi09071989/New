package com.sampleprgm;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class Expected_Exceptions {
  @Test(timeOut = 2000, expectedExceptions = ThreadTimeoutException.class)
  public void name() throws InterruptedException
 {
	  Thread.sleep(2000);
	  System.out.println("This method has to be executed after 3 sec");
  }
}
