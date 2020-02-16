/**
 * 
 */
package com.aboubakar;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Aboubakar
 *
 */
public class Samsung {
	
	@Autowired
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}


	public void configure()
	{
		System.out.println("Settings configuration parametters .....");
		cpu.process();
	}

}
