package com.kaiserandi;

public class WandlerRegelmaessig implements IWandler {

	@Override
	public String infinitiv(String verb) {
		if(verb.endsWith("ete")){
			return verb.substring(0, verb.length() - 3) + "en";
		}else if(verb.endsWith("st") || verb.endsWith("en") || verb.endsWith("te")){
			return verb.substring(0, verb.length() - 2) + "en";
		}else {
			if(verb.startsWith("ge")){
				return verb.substring(2, verb.length() - 1) + "en";
			}else{
				return verb.substring(0, verb.length() - 1) + "en";
			}
		}
	}

}
