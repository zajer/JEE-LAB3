/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pc.wat.jee.lab3.di;

import javax.enterprise.context.Dependent;

/**
 *
 * @author PC
 */
public class SecondImplementation implements MyInterface{

    @Override
    public String magicText() {
        return "swag";
    }
    
}
