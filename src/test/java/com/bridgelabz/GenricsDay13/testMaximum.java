package com.bridgelabz.GenricsDay13;

import org.junit.Assert;
import org.junit.Test;

public class testMaximum{
		@Test
		public void testInteger(){
			
			Maximum object=new Maximum();
			int actual=object.getmaximum(499, 200, 340);
			Assert.assertEquals(499,actual ,0);
		}

}
/**
		in this case the junit is sucess values is matched 
	*/
