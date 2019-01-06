/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pc.wat.jee.lab3.di;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 * @author PC
 */
@Singleton
public class MyInterfaceProducer implements Serializable{
    
    @Inject
    transient private InjectionChooserBean injectionChooser; //jest tylko jedna "implementacja" klasy InjectionChooserBean. Gdyby były inne (dziedziczace po InjectionChooserBean) to należałoby określić ktora jest domyślna (@Default) a które alternatywne  @Alternative
    
    @Produces
    public MyInterface superInjectionMethod(){
        String switcher = injectionChooser.getSomeText();
        switch(switcher)
        {
            case "FIRST" :
                return new FirstImplementation();
            case "SECOND":
                return new SecondImplementation();
            default:
                return new FirstImplementation();
        }
    }
}
