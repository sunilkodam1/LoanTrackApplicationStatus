/**
 * 
 */
package com.abcbank.loantrack.service;

import com.abcbank.loantrack.entity.LoanEntity2Dto;

/**
 * @author kosunil
 *
 */

public interface LoanTrackService {

	LoanEntity2Dto getStatusById(Long applicatonId);

}
