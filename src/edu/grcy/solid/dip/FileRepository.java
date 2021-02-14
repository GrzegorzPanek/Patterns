package edu.grcy.solid.dip;
// dependency jest najbardziej intyicyjna. Pytanie na rozmowe ktora z tych zasad jest najwazniejsza
//
// Mozna uznac ze depemdemcu bo bez wlozenia czegos brak. Ale gdzie czlowiek tak racja inna trzeba umiec donbrze wytlumaczyc.
//Nie ma jednej zlej odpowiedzi na to pytani, zla nbedzie openClose, dobra poniewaz gdyz bo itd. Wystarczy uargumentowac swoja odpowiedz.
//
// ogolna klasa ktora zapisuje i kasuje zadania
//
//Jezeli chodzi o solid to 95% rozmow kwalifkacyjynch jest odnosnie tych wzorcow. Kawalek kodu zeby zrobic go czystym
//
public class FileRepository {
    public void saveTask(String filename) {
        System.out.println("Saving to file " + filename);
    }

    public void deleteTask(String filename) {
        System.out.println("Deleting from file " + filename);
    }
}
