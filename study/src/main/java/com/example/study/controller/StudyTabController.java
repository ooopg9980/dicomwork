package com.example.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.study.domain.StudyTab;
import com.example.study.service.StudyTabService;

@Controller
public class StudyTabController {

	@Autowired
	StudyTabService studyTabService;
	
	@GetMapping("/StudyTabList")
	public String list(Model model) {
		List<StudyTab> study = studyTabService.list();
		model.addAttribute("study",study);
		return "Study/StudyList";
		
	}
	
	 @GetMapping("/search")
	    public String search(@RequestParam(value = "pid") String pid,
	                         @RequestParam(value = "pname") String pname,
	                         @RequestParam(value = "reportStatus") Long reportStatus,
	                         @RequestParam(value = "modality") String modality,
	                         Model model) {

	        List<StudyTab> study = studyTabService.searchStudyTab(pid, pname, reportStatus, modality);
	        model.addAttribute("study", study);
	        return "Study/StudyList";
	 }
}
