package pl.tok.beginer;

import java.util.Collections;
import java.util.List;

public class MaxOperation implements MathOperation{

    @Override
    public Integer calculate(List<Integer> intList) {
        return Collections.max(intList);
    }
}
