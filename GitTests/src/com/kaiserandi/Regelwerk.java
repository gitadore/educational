package com.kaiserandi;

public class Regelwerk {

	private String verb;
	private IWandler wandler;

	public Regelwerk(String verb) {
		super();
		this.verb = verb;
	}
	
	public Regelwerk(String verb, IWandler wandler) {
		super();
		this.verb = verb;
		this.wandler = wandler;
	}
	
	public String getInfinitiv(){
		if(wandler == null)
			return new WandlerRegelmaessig().infinitiv(verb);
		else
			return wandler.infinitiv(verb);
	}
	
}
