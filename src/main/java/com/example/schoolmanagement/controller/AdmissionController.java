/**
 * 
 */
package com.example.schoolmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.schoolmanagement.model.dto.AdmissionDTO;
import com.example.schoolmanagement.service.AdmissionService;

/**
 * @author laxma
 *
 */
@RestController
@RequestMapping
public class AdmissionController {
	
	@Autowired
	private AdmissionService admissionService;
	
   @PostMapping("/admissionSave")
   public AdmissionDTO admissionSave(@RequestBody AdmissionDTO admissiondetails ) {
	   System.out.println("StudentName..."+admissiondetails.getStudentName());
		System.out.println("FatherName"+admissiondetails.getFatherName());
		System.out.println("StudentAddress"+admissiondetails.getStudentAddress());
		System.out.println("Date of joining"+admissiondetails.getDateOfJoining());
	   return admissionService.admissionSave(admissiondetails);
   }
   @GetMapping("/getAdmissionDetails")
   public List<AdmissionDTO> getAdmissionDetails( ){
	   return admissionService.getadmission();
   }
}
