/**
 * 
 */
package com.abcbank.loantrack.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kosunil
 *
 */

@Configuration
public class MapperModelconf {
	
	@Bean
	public ModelMapper modelMapper() {
	return new ModelMapper();
	}

}
