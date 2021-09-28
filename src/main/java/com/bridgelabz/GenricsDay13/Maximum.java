package com.bridgelabz.GenricsDay13;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Maximum <E extends Comparable> {
	E value1, value2, value3;

	private  final static Logger Log= LogManager.getLogger(Maximum.class);

	public static Integer getmaximum(Integer value1, Integer value2, Integer value3) 
	{
		Integer max = value1;
		if (value2.compareTo(value1) > 0 && value2.compareTo(value3) > 0)

			max = value2;
		else if (value3.compareTo(value2) > 0 && value3.compareTo(value1) > 0)
			max = value3;
		Log.info(max);

		return max;
	}
	//to find maximum float value
	public static Float getmaximum1(Float value1, Float value2, Float value3) 

	{
		Float max = value1;
		if (value2.compareTo(value1) > 0 && value2.compareTo(value3) > 0)
			max = value2;
		else if (value3.compareTo(value2) > 0 && value3.compareTo(value1) > 0)
			max = value3;
		Log.info(max);
		return max;
	}
	public  static String getmaximum2(String value1, String value2, String value3) {
		String max = value1;
		if (value2.compareTo(value1) > 0 && value2.compareTo(value3) > 0)
			max = value2;
		else if (value3.compareTo(value2) > 0 && value3.compareTo(value1) > 0)
			max = value3;
		Log.info(max);
		return max;
	}
	public Maximum(E value1, E value2, E value3) {
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}

	public E testMaximum() {
		E testMax = testMaximum(value1, value2, value3);
		return testMax;
	}
	public static <E extends Comparable> E testMaximum(E value1, E value2, E value3) {
		E max = value1;
		if (value2.compareTo(value1) > 0 && value2.compareTo(value3) > 0)
			max = value2;
		else if (value3.compareTo(value2) > 0 && value3.compareTo(value1) > 0)
			max = value3;
		toPrint(value1, value2, value3, max);
		return max;
	}

	private static <E> void toPrint(E value1, E value2, E value3, E max) {
		System.out.println("Max of "+value1+" , "+value2+" , "+value3+" is: "+max);
	}
	//more than three parameters


	public static <E extends Comparable> E testMaximum(E... values) {
		E max = values[0];
		for( E element : values){
			if(element.compareTo(max)>0){
				max = element;
			}
		}
		toPrint(max,values);
		return max;
	}

	private static <E> void toPrint(E max, E... values) {
		for(E element : values){
			Log.info("\t"+element);
		}
		Log.info(" :max is: "+max);
	}
}
