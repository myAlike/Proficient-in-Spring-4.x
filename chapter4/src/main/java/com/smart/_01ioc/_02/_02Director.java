package com.smart._01ioc._02;

import com.smart._01ioc.GeLi;
import com.smart._01ioc.LiuDeHua;
import com.smart._01ioc.MoAttack;

public class _02Director {
   public void direct(){
	   GeLi geli = new LiuDeHua();
	   _02MoAttack moAttack = new _02MoAttack(geli);
	   moAttack.cityGateAsk();
   }
}
