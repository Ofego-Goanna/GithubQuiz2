package com.goanna;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListsTest {

	List<Employee> empList;
	Employee emp1;
	Employee emp2;
	Employee emp3;
	Employee emp4;
	Employee emp5;
	
	@BeforeEach
	void Initialize() {
		 emp1 = new Employee(1, "Mohit", 22);
		 emp2 = new Employee(2, "Rahul", 42);
		 emp3 = new Employee(3, "Shyam", 24);
		 emp4 = new Employee(4, "Mohit", 36);
		 emp5 = new Employee(5, "Swaraj", 60);

		empList = new ArrayList<>(10);

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		

	}

	@Test
	void test__over60() {

		assertEquals(null, Lists.over60(empList));

		assertEquals(5, empList.size());

		List<Employee> empList1 = new ArrayList<>();

		Employee emp6 = new Employee(6, "Sam", 75);
		empList1.add(emp6);

		assertEquals(emp6, Lists.over60(empList1));

	}

	@Test
	void test__remove_by_id() {

		assertEquals(5, empList.size());

		empList.remove(4);

		assertEquals(empList, Lists.removeById(empList, 4));

	}

	@Test
	void test__age_modulus() {

		assertEquals(5, empList.size());

		assertEquals(0, empList.get(1).age % 2);

		assertEquals(true, Lists.ageModulus(empList));

		List<Employee> empList1 = new ArrayList<>();

		Employee emp6 = new Employee(6, "Sam", 57);
		empList1.add(emp6);

		assertEquals(1, empList1.size());

		assertEquals(false, Lists.ageModulus(empList1));

	}

	@Test
	void test__listPlay() {

		List<Employee> empList1 = empList;
		empList1.remove(4);

		Lists.listPlay(empList);

		assertEquals(empList1.size(), empList.size());

	}

	@Test
	void test__Employee_class() {

		assertEquals("Employee{id=2, name='Rahul', age=42}", empList.get(1).toString());
		assertEquals("Rahul", empList.get(1).getName());
		assertEquals(2, empList.get(1).getId());
		assertEquals(42, empList.get(1).getAge());

		empList.get(1).setName("Zak");
		empList.get(1).setAge(40);
		empList.get(1).setId(6);

		assertEquals("Zak", empList.get(1).getName());
		assertEquals(6, empList.get(1).getId());
		assertEquals(40, empList.get(1).getAge());
		
		assertEquals(1, emp1.getId());
		assertEquals(22, emp1.getAge());
		assertEquals("Mohit", emp1.getName());
		
		emp1.setId(9);
		emp1.setAge(26);
		emp1.setName("Mario");
		
		assertEquals(9, emp1.getId());
		assertEquals(26, emp1.getAge());
		assertEquals("Mario", emp1.getName());
		

	}

}
