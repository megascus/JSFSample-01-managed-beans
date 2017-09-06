package com.jsfsample.calc.plain;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public abstract class AbstractBean {
    
    protected void message(String clientId, String message){
        FacesContext.getCurrentInstance().addMessage(
                clientId, 
                new FacesMessage(message)
        );
    }
    
}
