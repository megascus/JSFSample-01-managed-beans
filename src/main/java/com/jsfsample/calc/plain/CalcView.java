package com.jsfsample.calc.plain;

import com.jsfsample.calc.Calc;
import com.jsfsample.calc.CalcProducer;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@RequestScoped
@Getter @Setter
public class CalcView extends AbstractBean{
    
    @Inject
    private Calc calc;
    
    @Inject
    private List<Calc> results;
    
    @PostConstruct
    public void init(){
        //今回は使ってないですが普通使います(^^;
    }
    
    public void calc(){
        long l = calc.getLeft();
        long r = calc.getRight();
        long a = l + r;
        calc.setAnswer(a);
        
        if (l % 2 == 0) message("left", "左辺 " + l + " は偶数です");
        if (r % 2 != 0) message("right", "右辺 " + r + " は奇数です");
        
        results.add(0, calc);
        calc = CalcProducer.getCalc();
    }
}
