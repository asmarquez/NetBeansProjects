/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.sql.DataSource;
import modelo.Distribuidor;

/**
 *
 * @author Juan
 */
class PoolDistribuidorDAO implements DistribuidorDAO {

    private DataSource pool;
    private Connection conexion;

    public PoolDistribuidorDAO() {
    }

    @Override
    public boolean createDistribuidor(Distribuidor distribuidor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteDistribuidor(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Distribuidor readDistribuidor(String name) {
        
        PreparedStatement statment;
        ResultSet resultSet = null;
        Distribuidor newDist = new Distribuidor();
        
        String query = "select *" + "from mydb.distribuidor";
        
        getCon();
        
        try {
            statment = conexion.prepareStatement(query);
            resultSet = statment.executeQuery();
            
            
            for (int i=1;i<10;i++){
                resultSet.next();
            }
            
            
            
            newDist.setId(resultSet.getString(1));
            newDist.setEmpresa(resultSet.getString(2));
         
            
        } catch (SQLException ex) {
            Logger.getLogger(PoolDistribuidorDAO.class.getName()).log(Level.SEVERE, null, ex);
            newDist = null;
        }
        
            return newDist;
    }

    @Override
    public boolean updateDistribuidor(String name, Distribuidor distribuidor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setUp() {

        initPool IniciarPool = new initPool();
        try {
            pool = IniciarPool.initPoolNow();
            return true;
        } catch (ServletException ex) {
            Logger.getLogger(PoolDistribuidorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    @Override
    public boolean disconnect() {
        return true;
    }
    
    
    private void getCon(){
        try {
            conexion = pool.getConnection();
            
        } catch (SQLException ex) {
            Logger.getLogger(PoolDistribuidorDAO.class.getName()).log(Level.SEVERE, 
                    "NO se pudo establecer conexion con la BD", ex);
        }
        
    } 
    

}
