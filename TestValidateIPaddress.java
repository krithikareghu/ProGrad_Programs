package assignment;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestValidateIPaddress {

	ValidateIPaddress objIPaddress=new ValidateIPaddress();
	
	@Test
	public void testValidateIpv4Address1() {			
			assertTrue(objIPaddress.ValidateIpv4Address("1.1.1.1"));
	}
	@Test
	public void testValidateIpv4Address2() {
		assertFalse(objIPaddress.ValidateIpv4Address("255.255.255.255"));
	}
	
	@Test
	public void testValidateIpv4Address3() {
		assertFalse(objIPaddress.ValidateIpv4Address("a.b.c.d"));
	}
	@Test
	public void testValidateIpv4Address4() {
		assertFalse(objIPaddress.ValidateIpv4Address("0.0.0.0.0"));
	}
	

}
