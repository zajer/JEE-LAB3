/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pc.wat.jee.lab3.di;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;
import javax.inject.Singleton;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author PC
 */
@Named
@ApplicationScoped
public class InjectionChooserBean implements Serializable{
    @Getter @Setter private String someText = "niezainicjalizowana";
    
    public void method1(AjaxBehaviorEvent event) throws AbortProcessingException {
        
        if(someText.contentEquals("JEE"))
            someText = "BRAWO :)";
    }
}
