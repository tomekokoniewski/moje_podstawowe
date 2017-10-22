package pl.tok.beginer;

class Konstr {                         //dostęp za pomocą modyfikatora default - w ramach tego samego pakietu

    public String name;                //deklarujemy pole (zmienną) klasy
    public final String lang;          //możemy także zadeklarowac stałą klasy
    public int i;
    public boolean czy;

    public Konstr(String text) {       //konstruktor to specjalna metoda o takiej samej nazwie jak klasa
        // konstruktor jak każda metoda może miec parametry

        this.name = text;                   //konstruktory służą głównie do inicjalizacji pól klasy
        this.lang = text.substring(0, 5);    //lub stałych klasy

        System.out.println(name);
    }

    public Konstr(int i, String s1) {    //konstruktory można przeładowac (utworzyc kilka o takiej samej nazwie z innymi typami parametrów)
        this.i = i;
        this.name = s1;
        lang = "";
    }

    public Konstr(int i) {               //konstruktory można przeładowac (utworzyc kilka o takiej samej nazwie z innymi typami parametrów)
        this (i,"Nieznany");        //spod konstruktora można wywoływac inny konstruktor - tu wywołuję ten powyzej
    }

    //------- Gettery i Settery ----------------------------------------------------------------------------------------
    // w konstruktorach w celach hermetyzacji (zabronienia bezpośredniego dostępu do pól z innych klas) stosuje się metody
    // ustawiające pola (Settery) i pobierające z nich dane (Gettery)
    // nazwy getterów zaczynamy od getNazwapola, chyba że jest typu boolean - wówczas isNazwapola

    public String getName(){ //getter pobierający pole "name"
        return name;
    }
    public boolean isCzy() { //getter pobierający pole "czy"
        return czy;
    }

    public void setName(String name){   //setter ustawiający pole "name"
        this.name = name;
    }

    public void setCzy(boolean czy) {   //setter ustawiający pole "czy"
        this.czy = czy;
    }


}
