package com.sapient.trg.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PersonTest {
	
	private Person person = null;
	
	@BeforeEach
	void setUp() throws Exception {
		person = new Person(1, "Ravi", "kumar", LocalDate.of(1990, 10, 10), 9279995452L);
	}

	@AfterEach
	void tearDown() throws Exception {
		person = null;
	}
	@Disabled
	@Test
	void testAllArgConstructor() {
		Person person = new Person(1,null,null,null,null);
		assertThrows(IllegalArgumentException.class, () -> person.getFirstName());
	}

	@Test
	void testForValidGetPersonId() {
		assertEquals(1,person.getPersonId());
	}
	
	@Test
	void testForInvalidGetPersonId() {
		assertNotEquals(2,person.getPersonId());
	}

	@Test
	void testSetPersonId() {
		person.setPersonId(2);
		assertEquals(2,person.getPersonId());
	}

	@Test
	void testGetFirstName() {
		assertEquals("Ravi", person.getFirstName());
	}

	
	@Test
	void testSetFirstName() {
		person.setFirstName("Steve");
		assertEquals("Steve", person.getFirstName());
	}

	@Disabled
	@Test
	void testGetLastName() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testSetLastName() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testGetTime() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testSetTime() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testGetMobile() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testSetMobile() {
		fail("Not yet implemented");
	}

}
