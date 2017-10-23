package pl.tok.beginer;

public class KlasaDoDziedziczenia {
    private String name;
    int age;
    String jakikolor;

    public KlasaDoDziedziczenia(String kolor){ //4. konstruktor KDD przypisujący do pola kolorOczu wartosc paramertu otrzymanego z
                                                // KDD
        jakikolor=kolor;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}


