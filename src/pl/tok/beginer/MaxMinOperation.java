package pl.tok.beginer;

import java.util.Arrays;
import java.util.List;

public class MaxMinOperation {


    void getResult(List<Integer> intList, MathOperation mathOperation){
        int wynik = mathOperation.calculate(intList);
        System.out.println("Wynik działania metody: "+wynik );
    }

}
