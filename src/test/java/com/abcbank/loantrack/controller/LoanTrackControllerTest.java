/**
 * 
 */
package com.abcbank.loantrack.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.abcbank.loantrack.entity.LoanEntity2Dto;
import com.abcbank.loantrack.service.LoanTrackService;
import com.abcbank.loantrack.serviceimpl.LoanTrackServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author kosunil
 *
 */

@WebMvcTest(LoanTrackController.class)
public class LoanTrackControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private LoanTrackServiceImpl loanTrackServiceImpl;
	
	  @Autowired
	   private ObjectMapper objectMapper;
	
	@Autowired
	private LoanTrackService  loanService;
	
		
	@Test
	public void testGetById() throws Exception {
		LoanEntity2Dto loanTrack = new LoanEntity2Dto(1l,"sunil", "kodam", "kodam@gam", 12l, 33333l,"ko", 333l, "dff", "avgd", "hbsd");
		Mockito.when(loanTrackServiceImpl.getStatusById(Mockito.any())).thenReturn(loanTrack);
		mockMvc.perform(get("/bank/1").contentType(MediaType.APPLICATION_JSON)
		        .content(objectMapper.writeValueAsString(loanTrack))).andExpect(status().isOk()).andDo(print());
	}
}

