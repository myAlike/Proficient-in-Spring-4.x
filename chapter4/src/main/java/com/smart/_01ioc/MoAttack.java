package com.smart._01ioc;

import com.smart._01ioc._04.ActorArrangable;

public class MoAttack implements ActorArrangable {
	private GeLi geli;

	public void injectGeli(GeLi geli) {
		this.geli = geli;		
	}
	
	public void cityGateAsk() {
		geli.responseAsk("墨者革离");
	}
}