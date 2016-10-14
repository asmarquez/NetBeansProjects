/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;
import modelo.Distribuidor;

/**
 *
 * @author Juan
 */
public interface DistribuidorDAO {
    
    public boolean createDistribuidor(Distribuidor distribuidor);
    public boolean  deleteDistribuidor(String name);
    public Distribuidor readDistribuidor(String name);
    public boolean updateDistribuidor(String name, Distribuidor distribuidor);

    /**
     *
     * @return
     */
    public boolean setUp();
    public boolean disconnect();

}
