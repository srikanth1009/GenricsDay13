package com.bridgelabz.GenricsDay13;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Maximum {
	private  final static Logger Log= LogManager.getLogger(Maximum.class);

	public Integer getmaximum(Integer value1, Integer value2, Integer value3) 
	{
		Integer max = value1;
		if (value2.compareTo(value1) > 0 && value2.compareTo(value3) > 0)

			max = value2;
		else if (value3.compareTo(value2) > 0 && value3.compareTo(value1) > 0)
			max = value3;
		Log.info(max);

		return max;
	}
}
