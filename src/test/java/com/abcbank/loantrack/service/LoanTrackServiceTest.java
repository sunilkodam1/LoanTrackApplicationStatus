
package com.abcbank.loantrack.service;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.abcbank.loantrack.converstionsdto.Mapper;
import com.abcbank.loantrack.entity.LoanEntity2Dto;
import com.abcbank.loantrack.entity.LoanTrackModel;
import com.abcbank.loantrack.respository.LoanTrackRepository;
import com.abcbank.loantrack.serviceimpl.LoanTrackServiceImpl;

/**
 * @author kosunil
 *
 */

@ExtendWith(MockitoExtension.class)
public class LoanTrackServiceTest {
 
	@Mock
 private LoanTrackRepository loantrackrepo;

   @InjectMocks
		    private LoanTrackServiceImpl loanApplicationServiceImpl;
		   
        @Spy
        private Mapper mapper;
  		   
		   
		   @Test
			public void testgetStatusById() {
		
			   LoanTrackModel loanTrack = new LoanTrackModel(1l,"sunil", "kodam", "kodam@gam", 12l, 33333l,"ko", 333l, "dff", "avgd", "hbsd");
				
			   
			   Mockito.when(loantrackrepo.findById(Mockito.any())).thenReturn(Optional.of(loanTrack));
			   LoanEntity2Dto loanTrack1 = loanApplicationServiceImpl.getStatusById(1l);
			   
			 // LoanTrackModel loan2=mapper.toEntity(loanTrack1);
			   
			   
		        assertEquals(loanTrack1.getApplicatonid(), loanTrack.getApplicatonid());
		        
		        

  



	}
}
