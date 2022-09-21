/*
 * package com.abcbank.loantrack.feignService;
 *//**
	* 
	*/
/*
 * 
 * package com.abcbank.loantrack.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.abcbank.loantrack.communication.LoanTrackClient;
 * 
 *//**
	 * @author kosunil
	 *
	 *//*
		 * @RestController public class LOanTrackClientController {
		 * 
		 * @Autowired private LoanTrackClient loanTrackClient;
		 * 
		 * @GetMapping(value="/calu/{companyname}/{qunatity}")
		 *  public
		 * ResponseEntity<String> calulate (@PathVariable("companyname") String
		 * companyname,
		 * 
		 * @PathVariable("qunatity") String qunatity) { Double totalprica=null;
		 * ResponseEntity<Double> resEntity=loanTrackClient.getStockPRice(companyname);
		 * 
		 * int statuscode=resEntity.getStatusCodeValue().value(); if(statuscode==200) {
		 * Double compnayStockPrice=resEntity.getBody();
		 * totalprica=qunatity*companyStockprice; String response="TOTAL PRICE ::"
		 * +totalprica; return new
		 * ResponseEntity<String>("Company not found",HttpStatus.BAD_REQUEST); } }
		 * 
		 * }
		 * 
		 * }
		 */