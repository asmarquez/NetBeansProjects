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
class PoolFactoryDAO extends FactoryDAO {

    public PoolFactoryDAO() {
    }

    @Override
    public DistribuidorDAO getDistribuidorDAO() {
        return new PoolDistribuidorDAO(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
