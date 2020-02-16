/**
 * 
 */
package com.aboubakar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Aboubakar
 *
 */

@Configuration
public class AppConfig {

	@Bean 							//We spcifiy that this method should  return a bean
	public Samsung getPhone() {
		return new Samsung();
	}
	
	@Bean 
	public MobileProcessor getProcessor() {
		return new Snapdragon();
	}
}
