package com.example.study.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.study.domain.ImageTabId;
import com.example.study.domain.ImageTab;

@Repository
public interface ImageTabRepository extends JpaRepository<ImageTab, ImageTabId>{
	
	ArrayList<ImageTab> findByIdStudyKeyAndIdSeriesKeyOrderByIdImageKey(Long studyKey, Long seriesKey);
	
	ArrayList<ImageTab> findByIdStudyKeyOrderByIdSeriesKeyAscIdImageKeyAsc(Long studyKey);


}
