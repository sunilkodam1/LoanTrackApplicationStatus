/**
 * 
 */
package com.abcbank.loantrack.communication;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.abcbank.loantrack.entity.LoanEntity2Dto;

/**
 * @author kosunil
 *
 */
@FeignClient(url="http://localhost:8088/bank/10",name="LOANTRACKSTATUS")
public interface LoanTrackClient {

	@GetMapping(value = "/{id}")
	public ResponseEntity<LoanEntity2Dto> getStatusById(@PathVariable("id") Long id);
}
