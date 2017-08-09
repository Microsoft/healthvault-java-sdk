package com.microsoft.healthvault.types;

import java.util.Calendar;

public class Millisecond extends ConstrainedInt {

	public Millisecond() {
		this(Calendar.getInstance().get(Calendar.MILLISECOND));
	}

	public Millisecond(int value) {
		min = 0;
		max = 999;
		setValue(value);
	}
}