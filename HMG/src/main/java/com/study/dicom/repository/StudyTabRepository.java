package com.study.dicom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.study.dicom.domain.StudyTab;

@Repository
public interface StudyTabRepository extends JpaRepository<StudyTab,Long>{

	List<StudyTab> findAllByOrderByStudyKeyDesc(); // 전체조회 부분

	 @Query("SELECT s FROM STUDYTAB s WHERE "
	            + "(:pid IS NULL OR s.pid LIKE %:pid%) "
	            + "AND (:pname IS NULL OR s.pname LIKE %:pname%) "
	            + "AND (:reportStatus = 0 OR s.reportStatus = :reportStatus) "
	            + "AND (:modality IS NULL OR s.modality = :modality)")
	 
	 // JPQL 쿼리문 (JPA쿼리문) : 이걸 안 쓰면 밑에있는 메서드로시작해서 계속 if문 써야함
	 // 왜? ) 환자 아이디나 환자 이름을 하나만 쓸 수도 있고,이름을 썼을 때에도 '강감찬' 말고 '강'만 쓸 수 있기때문에 조건이 많아져서
	 // Query를 써서 한번에 코드를 짬
	 
	 List<StudyTab> findStudyTabsByCriteria(@Param("pid") String pid,
	                                           @Param("pname") String pname,
	                                           @Param("reportStatus") Long reportStatus,
	                                           @Param("modality") String modality);
}