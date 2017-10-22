package pl.tok.beginer;

public class KonstrHerm {
    private String adres;                                    //klasy z zenatrz nie mają dostępu do pola sdres

    public void setAdres(String ulica, String nrDomu) {     //klasy z zewnątrz dodstarczają danych do ustawienia
        this.adres = ulica + " " + nrDomu;                  //pola adres, ale nad ustawieniem dbają setery
    }

    public String getAdres() {                              //klasy z zewnątrz mogą pobrać ustawione pole adres
        return adres;                                       //za pomocą gettera
    }
}
