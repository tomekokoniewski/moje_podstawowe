package pl.tok.beginer;

import javax.print.attribute.standard.MediaSize;

public class Podrzedna extends Nadrzedna implements Interface {

    public static void test() {
        Podrzedna driver1 = new Podrzedna(); //obiekt klasy podrzędnej
        Nadrzedna driver3 = new Nadrzedna(); //obiekt klasy nadrzednej
        Nadrzedna driver2 = new Podrzedna(); //POLIMORFIZM obiekt klasy podrzędnej typu klasy nadrzędnej
        //można tak zrobić bo podrzędna dziedziczy po nadrzędnej
        //
        System.out.println(driver1.getName());
        System.out.println(driver2.getName());
        System.out.println(driver3.getName());
    }
    @Override                               //klasa podrzędna implementuje także Interfejs, stąd musi
    public Integer getWiek() {              //nadpisywać jego metody
        return 10;
    }
    public static void polimorfizm(){
        Podrzedna driver4 = new Podrzedna();
        Interface driver5 = new Podrzedna(); //POLOMORFIZM obiekt klasy podrzędnej typu interfejsu

    }


}
