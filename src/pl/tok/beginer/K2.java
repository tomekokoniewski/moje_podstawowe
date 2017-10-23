package pl.tok.beginer;

public class K2 extends K1 {
    public static String plec="Mężczyzna";

    @Override
    public String getName() {                       //NADPISANIE METODY getName() w klasie K1
        return super.getName().concat(" (driver)");
    }
    public static void test() {
        K1 employee = new K1();                     //utworzenie obiektu klasy K1
        employee.name = "Jan";                      //metoda getName w klasie K1 jest oryginalna, więc zwraca:
        System. out.println(employee.getName());    // Employee: Jan

        K2 driver = new K2();                       //utworzenie obiektu klasy K2
        driver.name = "Tomasz";
        System. out.println(driver.getName());      //wywołanie metody getName spod obiektu "driver" klasy K2 powoduje:
                                                    // Employee: Tomasz (driver)
    }
}
