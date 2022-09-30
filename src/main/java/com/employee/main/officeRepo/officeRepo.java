package com.employee.main.officeRepo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.employee.main.modelEntity.ncr;
@Repository
public interface officeRepo extends JpaRepository<ncr,Integer>{
	
	@Query(value = "select * from ncr", nativeQuery = true)
	List<ncr> selectAll();
	
	@Query(value = "select * from ncr where id= ?1", nativeQuery = true )
	ncr selectOne(int id);
	

}
