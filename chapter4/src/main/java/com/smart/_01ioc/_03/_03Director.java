package com.smart._01ioc._03;

import com.smart._01ioc.GeLi;
import com.smart._01ioc.LiuDeHua;

public class _03Director {
   public void direct(){
	   _03MoAttack moAttack = new _03MoAttack();
	   GeLi geLi = new LiuDeHua();
	   moAttack.setGeli(geLi);
	   moAttack.cityGateAsk();
   }
}
