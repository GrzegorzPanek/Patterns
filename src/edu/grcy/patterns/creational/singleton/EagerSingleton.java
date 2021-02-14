package edu.grcy.patterns.creational.singleton;

//Eager oznacza utwrzenie od razu
public class EagerSingleton {
//	prywante pole klasy EagerSingleton - od razu inicjownae
	private static final EagerSingleton INSTANCE = new EagerSingleton();
	private String otherField;

//	Prywatny konsytukyot - czyli z zewnatrz sie do niego nie dostaniemy. nie utworzymy nowego biektu
//	Chyba ze refleksja

	private EagerSingleton(){
		System.out.println("Eager singleton initialisation");
		otherField = "aaa";
	}

//	pubiczna metoda wystawiajaca utworzone wczesniej pole
	public static EagerSingleton getInstance(){
		System.out.println("Get instance");
		return INSTANCE;
	}

	public String getOtherField() {
		return otherField;
	}
}
