package pl.tok.beginer;

public class KlasaNiezmienna {
    private boolean czyNowy;

    //nie ma settera - konstruktor odpowiada za ustawienie wartości pola
    public KlasaNiezmienna(boolean czyNowy) {
        this.czyNowy = czyNowy;
    }

    //geter do pobierania wartości pola
    public boolean isCzyNowy(){
        return czyNowy;
    }

}
