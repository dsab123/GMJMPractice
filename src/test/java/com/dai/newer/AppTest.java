package com.dai.newer;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.hamcrest.core.IsEqual.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNot.*;
import static org.mockito.Mockito.*;

import junitparams.JUnitParamsRunner;
import junitparams.*;

@RunWith(JUnitParamsRunner.class)
public class AppTest {

	@Test
	public void testConstructor_vanilla_assertPasses() {
		App a = new App();
		
		assertThat(a, is(equalTo(a)));
	}

	@Test
	public void testConstructor_vanilla_checkAge() {
		App a = new App();
		
		final int NEW_AGE = 10;
		
		a.setAge(NEW_AGE);
		
		assertThat(a.getAge(), is(equalTo(NEW_AGE)));
	}
	
	@Test
	public void testConstructor_vanilla_mockedApp() {
		App b = mock(App.class);
		
		assertTrue(b instanceof App);
	}
	
	@Test
	public void reverse_SanityTest_StringNotEqualToReversedString() {
		String basicString = "hello";
		
		String reversedString = App.reverse(basicString);
		
		assertThat(reversedString, is(not(equalTo(basicString))));
	}
	
	@Test
	@Parameters({"aba", "abba", "racecar"})
	public void reverse_Palendromes_AreInvertible(String input) {
		String reversedInput = App.reverse(input);
		
		assertThat(input, is(equalTo(reversedInput)));
	}
	
	@Test
	@Parameters({"abbab", "foodoop", "barkreb"})
	public void reverse_AlmostPalendromes_ShouldNotPass(String input) {
		String reversedInput = App.reverse(input);
		
		assertThat(input, is(not(equalTo(reversedInput))));
	}
	
	@Test
	public void reverse_NullInput_ShouldReturnEmptyString() {
		String empty = "";
		
		String reversedEmpty = App.reverse(empty);
		
		assertThat(empty, is(equalTo(reversedEmpty)));
	}
	
	@Test(expected = Exception.class)
	public void reverse_OneCharInput_ThrowsException() {
		String oneChar = "a";
		
		String reversedOneChar = App.reverse(oneChar);
	}
	
}
