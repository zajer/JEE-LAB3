/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pc.wat.jee.lab3;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author PC
 */
@Named
@RequestScoped
public class PseudoDataProviderBean {
    
    public List<Person> getData(){
        List<Person> result = new ArrayList<>();
        
        Person p1 = Person.builder()
                .name("Jan Kowalski")
                .birthDate(LocalDate.of(1977, Month.MARCH, 1))
                .numberOfChildren(2)
                .build();
        
        Person p2 = Person.builder()
                .name("Anna Kowalska")
                .birthDate(LocalDate.of(1990, Month.JULY, 15))
                .numberOfChildren(1)
                .build();
        
        Person p3 = Person.builder()
                .name("Krzyszto Krawczyk")
                .birthDate(LocalDate.of(1950, Month.MARCH, 2))
                .build();
        
        result.add(p1);
        result.add(p2);
        result.add(p3);
        
        
        return result;
    }
    
}
