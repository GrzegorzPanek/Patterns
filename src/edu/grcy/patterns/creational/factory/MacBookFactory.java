package edu.grcy.patterns.creational.factory;

public class MacBookFactory {

	public static MacBook getMacBook (String type, String memory, String disc, int screenSize){

//		Fabryka jest ok jesli mamy stala, niezmienna liczbe klas
//		dla ktorych bedziemy tworzyc obiekty. Lista typow bedzie niezmienna badz bardzo rzadko zmieniana.
//		Kiedy mamy zmienna liczbe typow korzystamy z abstract factory

		if("Air".equalsIgnoreCase(type))
			return new MacBookAir(memory, disc, screenSize);
		else if("Pro".equalsIgnoreCase(type))
			return new MacBookPro(memory, disc, screenSize);
//		else if(...) .. - powoduje zlamanie instrukcji tego, zamiast dolozuyc nowy obiekt dokladamy cos czego nie powinnismy
//				bywa ze jest to koneiczne, ale zasady solida sa po to anby unikac anty patternow jesli to jest mozliwe.
//				Najpierw zastanawiamy sie czy dany podtyp a poziej piszemy kod. Dla obiektow ktore czesto maja zmieniana liste obiektow
//				tez jest rozwaizanie.

		return null;
	}
}

