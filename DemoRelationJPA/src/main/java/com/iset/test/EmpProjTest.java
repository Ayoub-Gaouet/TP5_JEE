package com.iset.test;

import com.iset.entities.Employee;
import com.iset.dao.DepartmentDao;
import com.iset.dao.EmployeeDao;
import com.iset.entities.Department;;

public class EmpProjTest {

	public static void main(String[] args) {
		DepartmentDao deptDao = new DepartmentDao(); 
		EmployeeDao empDao = new EmployeeDao();
		
		
		Department dep1 = new Department();
		dep1.setDname("Information Technology");
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setName("ayoub gaouet");
		e1.setDept(dep1);
		
		e2.setName("ahmed gaouet");
		e2.setDept(dep1);
		
        //persister l'objet dep1
		deptDao.ajouter(dep1);
		
		//persister les objets e1 et e2
		empDao.ajouter(e1);
		empDao.ajouter(e2);
		
		
		
		//affihcer la liste des employ�s du d�partement dep1
		Department d =new Department();
		d=deptDao.Consulter(d, 1);
		for (Employee e: d.getEmps())
			System.out.println(e.getName());

	}

}
