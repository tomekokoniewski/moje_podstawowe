package pl.tok.beginer;

public abstract class KlasaAbstr {              //deklaracja klasy abstrakcyjnej, musi byc dodane "abstract" jeżeli choc jedna metoda
                                                // jest abstrakcyjna
    private String name;

    public void setName(String s) {             //metoda - setter
        name = s;
    }
    public String getName() {
        return name + " " + getPosition();      //metoda - getter
    }

    //------------------------------------------
    public abstract String getPosition();       //metoda abstrakcyjna - nie ma ciała (nawiasów klamrowych),
                                                // musi byc nadpisana w klasie dziedziczącej.
                                                //przez istnienie metody abstrakcyjnej, cała klasa musi miec w deklaracji "abstract"
    //------------------------------------------
}
