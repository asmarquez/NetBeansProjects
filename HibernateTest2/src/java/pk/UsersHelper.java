/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Juan
 */
public class UsersHelper {
    
    Session session = null;

    public UsersHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    
    public List getUsersByName(String userName){
        
        List<Users> usersList = null;
        try {

            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Users as users where users.name>='"+userName+"'");
            usersList = (List<Users>) q.list();
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
            
        }finally{
            session.close();
        }
        
       
        return usersList;
    }
    
    
}
