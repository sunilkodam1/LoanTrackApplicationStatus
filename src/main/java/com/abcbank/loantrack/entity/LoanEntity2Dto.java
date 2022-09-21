/**
 * 
 */
package com.abcbank.loantrack.entity;

import lombok.Builder;


/**
 * @author kosunil
 *
 */
@Builder
public class LoanEntity2Dto {
	
	private Long applicatonid;
	private String firstName;
	private String lastName;
	private String email;
	private Long salary;
	private Long phone;
	private String address;
	private Long aadhar;
	private String pan;
	private String status;
	private String remark;
	
	
	public LoanEntity2Dto() {
		super();
	}
	public LoanEntity2Dto(Long applicatonid, String firstName, String lastName, String email, Long salary, Long phone,
			String address, Long aadhar, String pan, String status, String remark) {
		super();
		this.applicatonid = applicatonid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
		this.phone = phone;
		this.address = address;
		this.aadhar = aadhar;
		this.pan = pan;
		this.status = status;
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "LoanEntity2Dto [applicatonid=" + applicatonid + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", salary=" + salary + ", phone=" + phone + ", address=" + address + ", aadhar="
				+ aadhar + ", pan=" + pan + ", status=" + status + ", remark=" + remark + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Long getApplicatonid() {
		return applicatonid;
	}
	public void setApplicatonid(Long applicatonid) {
		this.applicatonid = applicatonid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getAadhar() {
		return aadhar;
	}
	public void setAadhar(Long aadhar) {
		this.aadhar = aadhar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
	
	