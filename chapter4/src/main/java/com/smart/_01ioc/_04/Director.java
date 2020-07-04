package com.smart._01ioc._04;

import com.smart._01ioc.GeLi;
import com.smart._01ioc.LiuDeHua;
import com.smart._01ioc.MoAttack;

public class Director {
   public void direct(){
	   GeLi geli = new LiuDeHua();
	   com.smart._01ioc.MoAttack moAttack = new MoAttack();
	   moAttack.injectGeli(geli);
	   moAttack.cityGateAsk();
   }
}
