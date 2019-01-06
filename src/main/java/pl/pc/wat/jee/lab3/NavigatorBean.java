/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pc.wat.jee.lab3;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author PC
 */
@Named
@SessionScoped
public class NavigatorBean implements Serializable {
    @Getter @Setter private String input="";
    private String direction;
    
    public String getDirection(){
        String result;
        switch(input.toLowerCase()){
            case "page1":
            case "1":
            case "page 1":
            case "p1":
                result = "toPage1";
                break;
            case "page2":
            case "2":
            case "page 2":
            case "p2":
                result = "toPage2";
                break;
            default :
                result = "doNothing";
        }
        return result;
    }
    
}
