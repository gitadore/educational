package com.kaiserandi;

public class Regelwerk {

	private String verb;

	public Regelwerk(String verb) {
		super();
		this.verb = verb;
	}
	
	public String getInfinitiv(){
			return new WandlerRegelmaessig().infinitiv(verb);
	}
	
}
