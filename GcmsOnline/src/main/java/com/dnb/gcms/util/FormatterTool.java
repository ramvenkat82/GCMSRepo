package com.dnb.gcms.util;

import java.text.DecimalFormat;

public class FormatterTool {
	
	static final String FORMAT_DECIMAL_TO_STRING = "############0.##############;-############0.##############";
	private static final DecimalFormat DECIMAL_TO_STRING_FORMATTER = new DecimalFormat(FORMAT_DECIMAL_TO_STRING);
	
	/* This method is designed to emulate the toString() method on the Double class,
	    except that it will handle large values.  The toString() method on the Double
	    class displays large values in scientific notation
	  */
	 public String formatDecimalToString(Number object) {
	     return DECIMAL_TO_STRING_FORMATTER.format(object);
	 }
	
}
