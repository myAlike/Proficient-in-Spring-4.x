package com.smart._01ioc._03;

import com.smart._01ioc.GeLi;

public class _03MoAttack {
	private GeLi geli;

	public void setGeli(GeLi geli) {
		this.geli = geli;		
	}
	
	public void cityGateAsk() {
		geli.responseAsk("墨者革离");
	}
}