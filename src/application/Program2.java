package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		// TEST 1
		System.out.println("===== TEST 1: department findById =====");
		Department department = departmentDao.findById(4);
		System.out.println(department);

		// TEST 2
		System.out.println("===== TEST 2: department findAll =====");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}

	}
}