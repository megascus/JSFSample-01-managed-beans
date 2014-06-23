package com.jsfsample.calc;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.enterprise.inject.Produces;
import javax.faces.view.ViewScoped;

public class CalcProducer {
    
    @Produces @ViewScoped
    public List<Calc> getCalcList(){
        return new LinkedList<>();
    }
    
    @Produces
    public static Calc getCalc(){
        Random rand = new Random(System.currentTimeMillis());
        return new Calc(
                Math.abs(rand.nextInt() % 10) + 1,
                Math.abs(rand.nextInt() % 10) + 1,
                0
        );
    }
}
