package pl.tok.beginer;

public class PolimorfizmDirector implements Interface
{
//implementuje interfejs więc nadpisuję zadeklarowane w interfejsie metody.

    @Override
    public String getName() {
        return "Zbyszek dyrektor";
    }

    @Override
    public Integer getWiek() {
        return 60;
    }
}
