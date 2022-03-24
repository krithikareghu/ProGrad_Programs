package assignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnitConverterTest {
	
	@Test
	public void checkKmToCmConversion() {
		
		UnitConverter unitConverter=new UnitConverter();
		
		double kilometer=0.001;
		double centimeter=unitConverter.convertKilometerToCentimeter(kilometer);
		
	    assertEquals(100,(int) centimeter);
	}
	
	@Test
	public void checkMeterToCmConversion() {
		
		UnitConverter unitConverter=new UnitConverter();
		
		double meter=1;
		double centimeter=unitConverter.convertMeterToCentimeter(meter);
		
	    assertEquals(100,(int) centimeter);
	}
	
	
	@Test
	public void checkKgToGramConversion() {
		UnitConverter unitConverter=new UnitConverter();
		
		double kilogram=0.1;
		double gram=unitConverter.convertKilogramToGram(kilogram);
		
	    assertEquals(100,(int)gram);	
	}
	
	@Test
	public void checkCelsiusToFahrenheitConversion() {
		UnitConverter unitConverter=new UnitConverter();
		
		double celsius=0;
		double fahrenheit=unitConverter.convertCelsiusToFahrenheit(celsius);
		
	    assertEquals(32,(int)fahrenheit);	
	}
	
	@Test
	public void checkGramToGram() {
		
		int gram=1;
	    assertEquals(1,gram);	
	}
	@Test
	public void checkCentimeterToCentimeter() {
	
		int centimeter=1;
	    assertEquals(1,centimeter);	
	}
	
	@Test
	public void checkKelvinToCelsiusConversion() {
		UnitConverter unitConverter=new UnitConverter();
		
		double kelvin=0;
		double celsius=unitConverter.convertKelvinToCelsius(kelvin);
		
	    assertEquals(-273,(int)celsius);	
	}
	
	
	@Test
	public void checkKmToCmExpression() {
		
		UnitConverter unitConverter=new UnitConverter();
		
		double kilometer=1;
	    double centimeter=unitConverter.convertKilometerToCentimeter(kilometer);
	    
	    double evaluateExpression=centimeter+200;
	    assertEquals(100200,(int) evaluateExpression, kilometer);
		
	}
	@Test
	public void checkMeterToCmExpression() {
		
		UnitConverter unitConverter=new UnitConverter();
		
		double meter=1;
		double centimeter=unitConverter.convertMeterToCentimeter(meter);
		
		double evaluateExpression=2000-centimeter;
		assertEquals(1900, (int)evaluateExpression);
	}
	@Test
	public void checkCmToMeterExpression() {
		
		UnitConverter unitConverter=new UnitConverter();
		
		double  centimeterValue1=50;
		double meterValue1=unitConverter.convertCentimeterToMeter(centimeterValue1);
		
		double evaluateExpression1=1-meterValue1;
		assertEquals(0.5, (float)evaluateExpression1, evaluateExpression1);

		double centimeterValue2=100;
		double meterValue2=unitConverter.convertCentimeterToMeter(centimeterValue2);
		
		double evaluateExpression2=1+meterValue2;
		assertEquals(2, (float)evaluateExpression2, evaluateExpression2);	
	}
	
	@Test
	public void checkKgToGramExpression() {
		
		UnitConverter unitConverter=new UnitConverter();
		
		double  kilogram=1;
		double gram=unitConverter.convertKilogramToGram(kilogram);
		
		double evaluateExpression=10+gram;
		assertEquals(1010, (int)evaluateExpression, evaluateExpression);
	}
	
	@Test
	public void checkGramToKgExpression() {
		
		UnitConverter unitConverter=new UnitConverter();
		
		double  gram=500;
		double kilogram=unitConverter.convertGramToKilogram(gram);
		
		double evaluateExpression=1.5-kilogram;
		assertEquals(1, (int)evaluateExpression, evaluateExpression);

	
	}    	    	    
}


