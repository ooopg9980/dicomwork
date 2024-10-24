package com.example.study.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.study.Repository.SeriesTabRepository;
import com.example.study.domain.SeriesTab;

@Service
public class SeriesTabService {
	
	@Autowired
	SeriesTabRepository seriesTabRepository;
	
	public ArrayList<SeriesTab> seriesList (Long studyKey) {
		return seriesTabRepository.findAllByIdStudyKey(studyKey);
	}

}
