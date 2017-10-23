package pl.tok.beginer;


public class KlasaDziedziczaca extends KlasaDoDziedziczenia {
    private String driverLicense;

    public KlasaDziedziczaca(String kolorOczu){ //3. konstruktor KD - przekazuje za pomocą "super(kolorOczu);"
                                                // parametr do konstruktora klasy po której dziedziczy (KDD)
        super(kolorOczu);
        }

    public static void test() {

        KlasaDziedziczaca driver = new KlasaDziedziczaca("NIebieski"); //2. tworzę nowy obiekt klasy KD z parametrem określonym w jej konstruktorze

        driver.driverLicense = "A5/1231";

        driver.setName("Jan Kowalski");
        driver.age=51;
        // driver.name = "Zbyszek" //-nie skompiluje sie - pole name w KlasieDoDziedziczenia jest private,
        // można je ustawic tylko jak powyżej - setterrem
        System.out.println("prawo jazdy:"+driver.driverLicense+" nazwisko:"+driver.getName()+" wiek:"+driver.age + " kolor oczu:"+driver.jakikolor);
    }
}
