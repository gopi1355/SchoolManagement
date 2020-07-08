/**
 * 
 */
package com.example.schoolmanagement.model.dto;

import java.io.Serializable;
import java.sql.Date;


/**
 * @author laxma
 *
 */
public class AdmissionDTO implements Serializable {
	private Integer Id;
	private String studentName;
	private String fatherName;
	private String studentAddress;
	private String city;
	private String State;
	private String studentPhNo;
	private Date dateOfJoining;

	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentPhNo() {
		return studentPhNo;
	}
	public void setStudentPhNo(String studentPhNo) {
		this.studentPhNo = studentPhNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	
}
