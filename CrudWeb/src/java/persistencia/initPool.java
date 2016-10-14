/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.sql.DataSource;

/**
 *
 * @author Juan
 */
public class initPool {

    public initPool() {
    }
    
    public DataSource initPoolNow() throws ServletException {
        DataSource pool = null;
        Context env = null;
        try {
            env = (Context) new InitialContext().lookup("java:comp/env");
            pool = (DataSource) env.lookup("jdbc/CrudPool"); //Acude
            //al Recurso no al Pool pilaassss
            if (pool == null) {
                throw new ServletException("No se encontró el DataSource");
            }
        } catch (NamingException ne) {
            throw new ServletException(ne.getMessage());
        }
        
        return pool;
    }



}
