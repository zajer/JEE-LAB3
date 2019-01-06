/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pc.wat.jee.lab3.di;

import pl.pc.wat.jee.lab3.di.MyInterface;
import pl.pc.wat.jee.lab3.di.SecondImplementation;
import pl.pc.wat.jee.lab3.di.FirstImplementation;
import java.io.Serializable;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author PC
 */
@Named
@RequestScoped
public class BeingInjectedBean implements Serializable{
 
    @Inject
    private MyInterface implementation; //wstrzykiwanie jest dokonywane przez metode oznaczoną @Produces w klasie MyInterfaceProducer
    
    public String textFromImplementation(){
        return implementation.magicText();
    }
    
}
