package pl.tok.beginer;

public interface Interface {
    final String kraj = "PL";       //interfejs może zawierac tylko stałe, wiec w deklaracji i inicjacji
    String kontynent = "Europa";    //można pominąć "final"

    public abstract String getName();   //metoda która musi być nadpisana w klasie implementującej
    Integer getWiek();                   // interfejs - "public" i "abstract" można pominąc
}
