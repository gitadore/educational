package com.kaiserandi;


public class WandlerRegelmaessig implements IWandler {

	public static String[] endungenListe = new String[]{"test", "st", "te", "tet", "t", "ten", "n", "nd"};
	
	@Override
	public String infinitiv(String verb) {
		for (String endung : endungenListe) {
			if(verb.endsWith(endung)){
				//endung entfernen
				verb = verb.substring(0, verb.length()-endung.length());
				//evtl. führendes "ge" entfernen
				if(verb.startsWith("ge")){
					verb  = verb.substring(2, verb.length());
				}
				break;
			}
		}
		// ä durch a ersetzen?
		verb = verb.replace('ä', 'a');
		// bei endung auf ln nichts anhängen
		if(verb.endsWith("ln")){
			return verb;
		}
		// bei endung auf e, r nur n anhängen
		else if(verb.endsWith("e") || verb.endsWith("r")){
			return verb + "n";
		}else{
			return verb + "en";
		}
	}

}
