package pl.tok.beginer;

public class PolimorfizmBusinessCard {
    static String getBusinessCard(Interface pracownik) {  //metoda przyjmuje jako parametry obiekty klas
        return "Wizytówka " + pracownik.getName() +       // PolimorfizmDriver i PolimorfizmDirector grdyż obie
                " "+pracownik.getWiek();                  // te klasy impelmentują ten sam interfejs
    }
}
