/**
 * 
 */
package com.example.schoolmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.schoolmanagement.model.dto.AdmissionDTO;

/**
 * @author laxma
 *
 */
@Service
public interface AdmissionService {

	 AdmissionDTO admissionSave(AdmissionDTO admissiondetails) ;

	List<AdmissionDTO> getadmission();
		
		
	
}
