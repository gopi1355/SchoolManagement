/**
 * 
 */
package com.example.schoolmanagement.utill;

import org.springframework.stereotype.Component;

import com.example.schoolmanagement.model.bo.AdmissionBO;
import com.example.schoolmanagement.model.dto.AdmissionDTO;

/**
 * @author laxma
 *
 */
@Component
public class AdmissionUtill {
   public AdmissionBO ConvertAdmissionDtoToAdmissionbo(AdmissionDTO admissiondto) {
	   AdmissionBO adbo=new AdmissionBO();
	   adbo.setId(admissiondto.getId());
	   adbo.setStudentName(admissiondto.getStudentName());
	   adbo.setFatherName(admissiondto.getFatherName());
	   adbo.setStudentAddress(admissiondto.getStudentAddress());
	   adbo.setCity(admissiondto.getCity());
	   adbo.setState(admissiondto.getState());
	   adbo.setStudentPhNo(admissiondto.getStudentPhNo());
	   adbo.setDateOfJoining(admissiondto.getDateOfJoining());
	   return adbo;
   }
   public AdmissionDTO ConvertAdmissionBoToAdmissionDto(AdmissionBO admissionbo) {
	   AdmissionDTO addto=new AdmissionDTO();
	   addto.setId(admissionbo.getId());
	   addto.setStudentName(admissionbo.getStudentName());
	   addto.setFatherName(admissionbo.getFatherName());
	   addto.setStudentAddress(admissionbo.getStudentAddress());
	   addto.setCity(admissionbo.getCity());
	   addto.setState(admissionbo.getState());
	   addto.setStudentPhNo(admissionbo.getStudentPhNo());
	   addto.setDateOfJoining(admissionbo.getDateOfJoining());
	   return addto;
   }
}
