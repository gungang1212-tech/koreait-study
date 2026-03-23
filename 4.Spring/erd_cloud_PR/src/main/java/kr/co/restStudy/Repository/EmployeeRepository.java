//	검색기능 보류함 


package kr.co.restStudy.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import kr.co.restStudy.Entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long>{
	// 필터링 및 검색기능 (보류)
	/*
	 * 
	@Query("Select e FROM EmployeeEntity e"
			
			)
	Page<EmployeeEntity> findEmployeeByFilters();

	 * */
	
	//부서 목록 조회 (보류)
	

}	





