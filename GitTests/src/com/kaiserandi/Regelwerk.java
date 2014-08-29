package com.kaiserandi;

public class Regelwerk {

	private String verb;

	public Regelwerk(String verb) {
		super();
		this.verb = verb;
	}
	
	public String getInfinitiv(){
		if(istRegelmaessigesVerb()){
			return new WandlerRegelmaessig().infinitiv(verb);
		}else{
			return verb + " kann ich nicht verarbeiten... :-(";
		}
	}
	
	private boolean istRegelmaessigesVerb(){
		if(verb.endsWith("e") ||verb.endsWith("en")||verb.endsWith("st")||verb.endsWith("t")){
			return true;
		}else{
			return false;
		}
	}
	
}
