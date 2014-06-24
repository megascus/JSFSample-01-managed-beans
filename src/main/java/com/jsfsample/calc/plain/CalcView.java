package com.jsfsample.calc.plain;

import com.jsfsample.calc.Calc;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@ViewScoped
@Getter @Setter
public class CalcView extends AbstractBean{
    
    private Calc calc = new Calc();
    
    private List<Calc> results = new LinkedList<Calc>();
    
    @PostConstruct
    public void init(){
    }
    
    public void calc(){
        long l = calc.getLeft();
        long r = calc.getRight();
        long a = l + r;
        calc.setAnswer(a);
        
        if (l % 2 == 0) message("left", "左辺 " + l + " は偶数です");
        if (r % 2 != 0) message("right", "右辺 " + r + " は奇数です");
        
        results.add(0, calc);
        calc = new Calc();
    }
}
