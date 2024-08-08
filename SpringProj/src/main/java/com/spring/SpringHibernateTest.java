package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-hibernate.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("emp");
		
//		 Employee emp = new Employee(); emp.setEmpId(101); emp.setEmpName("Ramu");
//		 emp.setEmpSalary(6000); dao.saveEmployee(emp);
		 
		dao.updateEmployee(101,8000);
		// dao.deleteEmployee(101);
		List<Employee> empList = dao.listEmployees();
		for (Employee emp1 : empList)
			System.out.println(emp1);
	}

}
