package assignment;

public class UnitConverter {

	    double convertMeterToCentimeter(double metervalue) {
		
		double centimeter=metervalue*100;	
		return centimeter;
		
	    }
		double convertCentimeterToMeter(double centimeterValue) {
			 
			double meter=centimeterValue/100;	
			return meter;
			}

		double convertKelvinToCelsius(double kelvinValue) {
			
			double celsius=kelvinValue-273;	
			return celsius;
			}	 

		double convertCentimeterToKilometer(double centimeterValue) {
			
			double kilometer=centimeterValue*0.00001;	
			return kilometer;
			}

		double convertKilometerToCentimeter(double kilometerValue) {
			double centimeter=kilometerValue*100000;	
			return centimeter;
			}

		double convertGramToKilogram(double gramValue) {
			double kilogram=gramValue*0.001;	
			return kilogram;	
			}

		double convertKilogramToGram(double kilogramValue) {
			double gram=kilogramValue*1000;	
			return gram;	
			}

		double convertCelsiusToFahrenheit(double celsiusValue) {
			double fahrenheit=celsiusValue* (9 / 5) + 32;	
			return fahrenheit;
            }
		
		
		
		
		
		
//		double todecimal(int integerNumber)
//		{
//			double decimalNumber=integerNumber;
//			return decimalNumber;
//		}
}
