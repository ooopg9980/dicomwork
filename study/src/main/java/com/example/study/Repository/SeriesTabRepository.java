package com.example.study.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.study.domain.SeriesTab;
import com.example.study.domain.SeriesTabId;

@Repository
public interface SeriesTabRepository extends JpaRepository<SeriesTab, SeriesTabId> {

	ArrayList<SeriesTab> findAllByIdStudyKey(Long studyKey);
}
