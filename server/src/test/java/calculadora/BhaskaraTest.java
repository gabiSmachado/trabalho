package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import calculadora.CalculandoBhaskara;

public class BhaskaraTest {
	private  CalculandoBhaskara cal;
	
	@Before
	public void before() {
		cal = new  CalculandoBhaskara();
	}
	
	@Test
	public void deltaTest() {
		cal.setA("2");
		cal.setB("14");
		cal.setC("7");
		assertThat(cal.getDelta(), is(140.0));	
	}

	
	@Test
	public void raizPositivaTest() {
		cal.setA("2");
		cal.setB("14");
		cal.setC("7");
		assertThat("-0.5419601084501919", containsString(cal.getRaizPositiva()));	
		}
	
	
	@Test
	public void raizNegativaTest() {
		cal.setA("2");
		cal.setB("14");
		cal.setC("7");
		assertThat("-6.458039891549808", containsString(cal.getRaizNegativa()));	
	}
	
	@Test
	public void deltaTest2() {
		cal.setA("2");
		cal.setB("4");
		cal.setC("6");
		assertThat(cal.getDelta(), is(-32.0));	
	}
	
	/*@Test
	public void falhaDeltaNegativoTest() {
		cal.setA("2");
		cal.setB("14");
		cal.setC("7");
		assertThat("Delta negativo", containsString(cal.getRaizNegativa()));	
	}*/
	
	@Test
	public void deltaNegativoTest() {
		cal.setA("2");
		cal.setB("4");
		cal.setC("6");
		assertThat("Delta negativo", containsString(cal.getRaizNegativa()));	
	}
}
