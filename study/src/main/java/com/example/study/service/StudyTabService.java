package com.example.study.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.study.Repository.StudyTabRepository;
import com.example.study.domain.StudyTab;

@Service
public class StudyTabService {
	ArrayList<StudyTab> list = new ArrayList<StudyTab>();
	
	@Autowired
	StudyTabRepository studyTabRepository;

	public List<StudyTab> list() {
		return studyTabRepository.findAllByOrderByStudyKeyDesc();
	}	
	
	public List<StudyTab> searchStudyTab(String pid, String pname, Long reportStatus, String modality) {
        return studyTabRepository.findStudyTabsByCriteria(pid, pname, reportStatus, modality);
    }

	
}