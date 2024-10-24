package com.example.study.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.study.Repository.ImageTabRepository;
import com.example.study.domain.ImageTab;

@Service
public class ImageTabService {
	
	@Autowired
	ImageTabRepository imageTabRepository;
	
	public ArrayList<ImageTab> List(Long studyKey, Long seriesKey) {
		return imageTabRepository.findByIdStudyKeyAndIdSeriesKeyOrderByIdImageKey(studyKey, seriesKey);
		
	}

}
