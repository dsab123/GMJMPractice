package com.dai.newer;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.hamcrest.core.IsEqual.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNot.*;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.mockito.Mockito.*;
import junitparams.*;

@RunWith(JUnitParamsRunner.class)
public class FahrenheitCelciusConverterTest {

	@Test
	public void shouldConvertCelciusToFahrenheit() {
		assertEquals(32, FahrenheitCelciusConverter.toFahrenheit(0));
		assertEquals(98, FahrenheitCelciusConverter.toFahrenheit(37));
		assertEquals(212, FahrenheitCelciusConverter.toFahrenheit(100));
	}

	@Test
	public void shouldConvertFahrenheittoCelcius() { 
		assertEquals(32, FahrenheitCelciusConverter.toCelcius(0));
		assertEquals(98, FahrenheitCelciusConverter.toCelcius(37));
		assertEquals(212, FahrenheitCelciusConverter.toCelcius(100));
	}

	@Parameters({"32, 0", "98, 37", "212, 100"})
	@Test
	public void shouldConvertCelciusToFahrenheit(int result, int deg) {
		assertEquals(result, FahrenheitCelciusConverter.toFahrenheit(deg));
	}

	@Parameters({"32, 0", "98, 37", "212, 100"})
	@Test
	public void shouldConvertFahrenheitToCelcius(int result, int deg) {
		assertEquals(result, FahrenheitCelciusConverter.toCelcius(deg));
	}

}
