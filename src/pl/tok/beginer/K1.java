package pl.tok.beginer;

public class K1 {
    public String name;

    public static String plec="Kobieta";

    public String getName() {           //jeżeli oznaczymy metodę jako "public final String getName()" - nie będzie można jej nadpisac !
        return "Employee: " + name;
    }
}
