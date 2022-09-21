/**
 * 
 */
/*
 * 
 * 
 * package com.abcbank.loantrack.feignService;
 * 
 *//**
	 * @author kosunil
	 *
	 *//*
		 * public class FeignClientService { add webflux depedency tomact jasper
		 * devtools
		 * 
		 * 
		 * 
		 * 
		 * public String getToatalStock(String companyname , Interger quantity) { String
		 * REST_ENDPOINT="http://localhiost//bank";
		 * 
		 * WebClient webClient = WebClient.create();
		 * 
		 * String response = webClient.get() // .uri(url,from,to)
		 * .uri(REST_ENDPOINT,companyName,quantity) .retrieve()
		 * .bodyToMono(String.class) .block();
		 * 
		 * System.out.println(response);
		 * 
		 * System.out.println("**************Sync :: Rest Call End****************");
		 * inject StockService service;to controller
		 * 
		 * WebClient to send Async Request ------------------------------- public void
		 * invokeRestApiAsync(String from, String to) { String url =
		 * "https://tekleads-ce-api.cfapps.io/getCurrencyExchangeCost/from/{from}/to/{to}";
		 * 
		 * WebClient webClient = WebClient.create();
		 * 
		 * 
		 * 
		 * ASYNC :webClient.get() .uri(url,from,to) .retrieve()
		 * .bodyToMono(CurrencyResponse.class) .subscribe(MyClient::handleResponse);
		 * 
		 * 
		 * write one controller fro this
		 * 
		 * 
		 * public static void handleResponse(CurrencyResponse response) {
		 * System.out.println(response); //push response to apache kafka } }
		 */