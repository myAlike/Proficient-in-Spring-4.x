package com.smart._01ioc._02;

import com.smart._01ioc.GeLi;

public class _02MoAttack {
	private GeLi geli;

	public _02MoAttack(GeLi geli) {
		this.geli = geli;		
	}
	
	public void cityGateAsk() {
		geli.responseAsk("墨者革离");
	}
}