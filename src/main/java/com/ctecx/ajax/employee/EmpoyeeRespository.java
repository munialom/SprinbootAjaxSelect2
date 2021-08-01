package com.ctecx.ajax.employee;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface EmpoyeeRespository extends CrudRepository<Employee, Integer> {
	
	@Query(value="SELECT * FROM employee where emp_name like %:keyword%" ,nativeQuery=true)
	List<Employee> search(@Param("keyword") String keyword);

}
