package com.jits.core;

import com.thirdParty.calibration.MailScale;

class ScaleAdapter implements Weighable {

	@Override
	public double weigh(Object o) {
		
		return Math.ceil(new MailScale().calculateWeight(o));
	}

}
