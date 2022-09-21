/**
 * 
 */
package com.abcbank.loantrack.repository;


import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.abcbank.loantrack.entity.LoanTrackModel;
import com.abcbank.loantrack.respository.LoanTrackRepository;

/**
 * @author kosunil
 *
 */

@DataJpaTest

class LoanTrackRepoTest {
	
	
	
	@Autowired
	private LoanTrackRepository loantrackrepo;
	
	@Test
	@Order(1)
	void loanTrackRepoTest() {
	LoanTrackModel	loanTrack = new LoanTrackModel(1l,"sunil", "kodam", "kodam@gam", 12l, 33333l,"ko", 333l, "dff", "avgd", "hbsd");
	    
	loantrackrepo.save(loanTrack);
	Optional<LoanTrackModel> loanTrack1=loantrackrepo.findById(1l);
	
	Assertions.assertThat(loanTrack1.get().getApplicatonid()).isEqualTo(1l);
	
	
	}
	
	

}
