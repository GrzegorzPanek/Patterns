package edu.grcy.patterns.creational.singleton;

//W odroznieniu od EagerSingletona mamy lazy czyli inicjowanie przy pierwszym uzyciu

public class LazySingleton {
private static LazySingleton instance;

	private LazySingleton(){
		System.out.println("Lazy Singleton initialization");
	}

	public static LazySingleton getInstance(){
//	przy pierwszym wywolaniu getInstance() nastąpi utworzenie obiektu przez konstruktor
		if (instance == null){
			/**
			 * Lazy Single nie powinien byc uzywany w aplikacjach wielowatkowych bo
			 * kilka wątków może utworzyć odrębne instancje klasy, dlatego ze odpalaja sie w roznym czasie i kolejnosci
			 * Nie moze zakladac lazy singletona jesli mamy aplikacje wielowatkwoa. Nie nadaje sie poniewaz
			 * utworzona moze zostac drugi obiekt klasy.
			 *
			 * Oszczedzamy troche na zasobach. Eager oznacza tworzymy tak czy inaczej. Lazy tworzymy tylko przy starcie.
			 *
			 * Jesli mamy podejrzenie ze czegos uzyjemy to lepszy jest eager jesli wiemy ze nie uzyemy to lepszu jest lazy
			 * Jesli ammy duzy obiekt i mamy watpliwosci czy zostanie uzyty to tworzymy lazy.
			 *
			 * Bardzo fajnym przykladem jest baza danych. Zeby nie zapychac pamieci Ram czsto wykorzystywana jest praktyka Lazy, czyli
			 * wyciaganie danych wtedy kiedy sa potrzebne.
			 */
			instance = new LazySingleton();
		}
		return instance;
	}

}
