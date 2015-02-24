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

import java.util.HashMap;

public class HashMapTest {

	final static int DUMMY_KEY = 0;
	final static int DUMMY_AGE = 10;
	
	public HashMap<Integer, App> createAppHashMap() {
		HashMap<Integer, App> map = new HashMap<Integer, App>();
		
		return map;
	}
	
	@Test
	public void HashMapTest_RetrieveInsertedElement_CanRetrieve() {
		// Arrange
		HashMap<Integer, App> map = createAppHashMap();
		
		// Act
		map.put(DUMMY_KEY, new App());
		App a = map.get(0);
		
		// Assert
		assertThat(a, instanceOf(App.class));
	}
	
	@Test
	public void HashMapTest_AddingEntryWithSameKeyOverwritesOldEntry_ReturnsTrue() {
		HashMap<Integer, App> map = createAppHashMap();
		
		App tenYearOld = new App();
		tenYearOld.setAge(DUMMY_AGE);
		map.put(DUMMY_KEY, tenYearOld);
		
		App defaultYearOld = new App();
		map.put(DUMMY_KEY, defaultYearOld);
		
		
		App retrievedApp = map.get(DUMMY_KEY);
		int retrievedAge = retrievedApp.getAge();
		
		assertThat(retrievedAge, is(equalTo(App.DEFAULT_AGE)));
	}	
	
	@Test
	public void HashMapTest_ClearFunctionality_ReturnsTrue() {
		HashMap<Integer, App> map = createAppHashMap();
		
		map.put(DUMMY_KEY, new App());
		map.put(DUMMY_KEY + 1, new App());
		map.put(DUMMY_KEY + 2, new App());
		
		map.clear();
		
		int numElements = map.size();
		
		assertEquals(numElements, 0);
	}
	
	@Test
	public void HashMapTest_NullKey_CanBeUsed() {
		HashMap<Integer, App> map = createAppHashMap();
		
		map.put(null, new App());
		
		App a = map.get(null);
		
		assertTrue(a != null);
	}
	
}


