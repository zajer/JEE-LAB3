/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pc.wat.jee.lab3;

import java.time.LocalDate;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author PC
 */
@Named
@Dependent
@Data
@Builder
public class Person {
    private String name;
    private int numberOfChildren;
    private LocalDate birthDate;
    
}
