package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DoorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testGet_DoorY() {
	    Door instance = new Door();
	    int expResult = 1;
	    instance.set_DoorY(1);
	    int result = instance.get_DoorY();
	    assertEquals(expResult, result);
	}

	@Test
	public void testSet_DoorY() {
	    int _DoorY = 1;
	    Door instance = new Door();
	    instance.set_DoorY(_DoorY);
	   
	    assertEquals(instance.get_DoorY(), _DoorY);
	}

}
