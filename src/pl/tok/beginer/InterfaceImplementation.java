package pl.tok.beginer;

public class InterfaceImplementation implements Interface{  //zaimplementowanie interfejsu zmusza do
    private String name;                                    //nadpisania zadeklarowanych w nim metod
    private Integer wiek;

    public InterfaceImplementation(String name, Integer wiek){
        this.name=name;
        this.wiek=wiek;
    }

    @Override                                               //nadpisanie metody z interfejsu
    public String getName() {
        return name;
    }

    @Override                                               //nadpisanie metody z interfejsu
    public Integer getWiek() {
        return wiek;
    }
}
