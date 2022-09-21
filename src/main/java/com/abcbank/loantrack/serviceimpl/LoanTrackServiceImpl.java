/**
 * 
 */
package com.abcbank.loantrack.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.loantrack.converstionsdto.Mapper;

import com.abcbank.loantrack.entity.LoanEntity2Dto;
import com.abcbank.loantrack.entity.LoanTrackModel;
import com.abcbank.loantrack.exception.ApplicationIdException1;
import com.abcbank.loantrack.respository.LoanTrackRepository;
import com.abcbank.loantrack.service.LoanTrackService;

/**
 * @author kosunil
 *
 */
@Service
public class LoanTrackServiceImpl implements LoanTrackService {

	@Autowired
	private LoanTrackRepository loantrackrepo;

	@Autowired
	private Mapper mapper;

	@Override
	public LoanEntity2Dto getStatusById(Long applicatonid) {
		Optional<LoanTrackModel> loanTrack = loantrackrepo.findById(applicatonid);
		if (loanTrack.isPresent()) {
			return mapper.toDto(loanTrack.get());
		} else {

			throw new ApplicationIdException1("Application Id Not Found");

		}
	}
}
