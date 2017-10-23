package pl.tok.beginer;

public class PolimorfizmDriver implements Interface
{
//implementuje interfejs więc nadpisuję zadeklarowane w interfejsie metody.

    @Override
    public String getName() {
        return "Janek kierowca";
    }

    @Override
    public Integer getWiek() {
        return 51;
    }
}
