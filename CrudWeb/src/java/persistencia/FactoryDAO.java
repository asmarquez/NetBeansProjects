/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author Juan
 */
public abstract class FactoryDAO {
    
    private static final int POOL_FACTORY = 1;
    
    public abstract DistribuidorDAO getDistribuidorDAO();
    
    public static FactoryDAO getFactory (int key){
        
        switch(key){
            case POOL_FACTORY:
                return new PoolFactoryDAO();
                
            default:
                throw new IllegalArgumentException();
            
        }
        
        
    }
    
}
