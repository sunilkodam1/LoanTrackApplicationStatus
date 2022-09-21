/**
 * 
 */
package com.abcbank.loantrack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.loantrack.communication.LoanTrackClient;
import com.abcbank.loantrack.entity.LoanEntity2Dto;
import com.abcbank.loantrack.service.LoanTrackService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author kosunil
 *
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/bank")
@Api(" Loan Tracking Status Application")
public class LoanTrackController {

	@Autowired
	private LoanTrackService loanTrackServiceImpl;

	/**
	 * returns the loan status by Id
	 * 
	 * @return status returns by id
	 *
	 */
	
	@ApiResponses(value= { @ApiResponse(code=201, message="Resource Got"),
	@ApiResponse(code=500,message = "server error")})
	@ApiOperation("By Using Id you can check the application Status")
	@GetMapping(value = "/{id}")
	public ResponseEntity<LoanEntity2Dto> getStatusById(@PathVariable("id") Long id) {
		LoanEntity2Dto laonTrack = loanTrackServiceImpl.getStatusById(id);
		return new ResponseEntity<>(laonTrack, HttpStatus.OK);
	}
	


}
