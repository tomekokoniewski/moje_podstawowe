package pl.tok.beginer;

import java.math.BigDecimal;

public class KlasaAbstrDziedziczaca extends KlasaAbstr {

    private BigDecimal bonus;

    @Override                       //muszę nadpisać metode getPosition w KlasaAbstr z której dziedziczę
    public String getPosition() {
        return "(kierowca)";
    }

    public static void test() {
        KlasaAbstrDziedziczaca driver = new KlasaAbstrDziedziczaca();
        driver.setName("Jan");
        System.out.println(driver.getName()); // Jan (kierowca)
    }
}