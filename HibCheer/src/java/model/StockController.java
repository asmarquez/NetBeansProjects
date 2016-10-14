/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

/**
 *
 * @author Juan
 */
@Named(value = "stockController")
@Dependent
public class StockController {

    /**
     * Creates a new instance of StockController
     */
    
    public StockController() {
    }
    
}
