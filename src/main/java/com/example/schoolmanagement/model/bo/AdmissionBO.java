/**
 * 
 */
package com.example.schoolmanagement.model.bo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author laxma
 *
 */
@Entity
@Table(name="Admission")
public class AdmissionBO {
	@Id
	@Column(name ="id")
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	@Column(name ="studentname")
	private String studentName;
	@Column(name="fathername")
	private String fatherName;
	@Column(name="studentaddress")
	private String studentAddress;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String State;
	@Column(name="studentphno")
	private String studentPhNo;
	@Column(name="dateofjoining")
	private Date dateOfJoining;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getStudentPhNo() {
		return studentPhNo;
	}
	public void setStudentPhNo(String studentPhNo) {
		this.studentPhNo = studentPhNo;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
}
