/**
 * 
 */
package com.abcbank.loantrack.converstionsdto;

import org.springframework.stereotype.Component;

import com.abcbank.loantrack.entity.LoanEntity2Dto;
import com.abcbank.loantrack.entity.LoanTrackModel;

/**
 * @author kosunil
 *
 */
@Component
public class Mapper {
	
	




	   /**
	     * Converting Entity to Dto object
	     *
	     * @param entity
	     * @return
	     */
	    public LoanEntity2Dto toDto(LoanTrackModel entity) {
	    	LoanEntity2Dto dto = new LoanEntity2Dto();
	        dto.setAddress(entity.getAddress());
	        dto.setApplicatonid(entity.getApplicatonid());
	        dto.setAadhar(entity.getAadhar());
	        dto.setEmail(entity.getEmail());
	        dto.setFirstName(entity.getFirstName());
	        dto.setLastName(entity.getLastName());
	        dto.setPhone(entity.getPhone());
	        dto.setSalary(entity.getSalary());
	        dto.setPan(entity.getPan());
	        dto.setStatus(entity.getStatus());
	        dto.setRemark(entity.getRemark());



	       return dto;
	    }



	   /**
	     * Converts Dto to Entity
	     *
	     * @param LoanApplicationDto
	     * @return LoanApplication
	     */
	    public LoanTrackModel toEntity(LoanEntity2Dto dto) {
	    	LoanTrackModel entity = new LoanTrackModel();
	    	entity.setAddress(dto.getAddress());
	    	entity.setApplicatonid(dto.getApplicatonid());
	        entity.setAadhar(dto.getAadhar());
	        entity.setEmail(dto.getEmail());
	        entity.setFirstName(dto.getFirstName());
	        entity.setLastName(dto.getLastName());
	        entity.setPhone(dto.getPhone());
	        entity.setSalary(dto.getSalary());
	        entity.setPan(dto.getPan());
	        entity.setStatus(dto.getStatus());
	        entity.setRemark(dto.getRemark());



	       return entity;
	    }
	}
