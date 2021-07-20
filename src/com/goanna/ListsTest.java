package com.goanna;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListsTest {

	List<Employee> empList;

	
	@BeforeEach
	void Initialize() {
		/*
		 * Creating instances of the objects we need to test which are 
		 * i. Lists
		 * ii. Employees
		 */
		Employee emp1 = new Employee(1, "Bob", 22);
		Employee emp2 = new Employee(2, "John", 42);
		Employee emp3 = new Employee(3, "Nathan", 24);
		Employee emp4 = new Employee(4, "done", 36);
		Employee emp5 = new Employee(5, "true", 60);

		this.empList = new ArrayList<>(10);

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

	}

	@Test
	void testEmployeeAgeGreaterThan60() {
		
		/* 
		 * Since our over60 method can return either null or an actual employee,
		 * we need to test for both instances or rather both cases.
		 */
		
		// Testing for null, we can call the over60 method, and assertNull with its value
		// Calling the over60 method will initially return null
		// This is because the initial empList does not have an employee with age greater than 60 
		assertNull(Lists.over60(empList));
		
		/* 
		 * To test the other case when this method returns an actual employee,
		 * we need to first of all create and add an employee to our list 
		 *
		 */
		Employee emp6 = new Employee(6, "johnson", 65);
		empList.add(emp6);
		
		// we can call the over60 method again with the updated empList,
		// this should now return an employee value and not null
		Employee johnson = Lists.over60(empList);
		
		// we can make an assertion with the employee age to confirm if indeed it is greater than 60
		
		assertEquals(65, johnson.getAge());
		
		
		
	}

	@Test
	void testRemoveEmployeeById() {
		/*
		 * To test that a value has been removed from a list, 
		 * there are numerous ways to attempt this, we can remove a value from the list,
		 * compare the new list size with our expected list size
		 */
		Lists.removeById(empList, 4);
		assertEquals(4, empList.size());
		
		
		
	}
	
	@Test
	void testEmployeeAgeModulud() {
		/*
		 * Since the ageModulus method returns two possible values (true or false), we need to test both cases
		 * we can simple create a list that should return true and then call our method with this list as parameter
		 * we can them store the result of our method call in a variable and make our assertion 
		 */
		boolean value = Lists.ageModulus(empList);
		assertTrue(value);
		
		/* 
		 * To test for false, we need to create a new list that properly meets the criteria for returning false
		 * ALL values must not be divisible by 2 in order for our method to return false
		 * A simple approach is to create a new list that matches this criteria and repeat the steps above on line 90 
		 */
		Employee emp1 = new Employee(1, "Bob", 23);
		Employee emp2 = new Employee(2, "John", 43);
		List<Employee> newList = new ArrayList<>();
		newList.add(emp1);
		newList.add(emp2);
		
		boolean newValue = Lists.ageModulus(newList);
		
		assertFalse(newValue);
		
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}