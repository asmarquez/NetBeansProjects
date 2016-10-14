/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Juan
 */
public class StockHelper {

    Session session = null;

    public StockHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public List getStockInfo(String word2find) {
        List<Stock> stockList = null;

        try {
            session.beginTransaction();
            Query q = session.createQuery("from Stock as stock where codigo >= '" +  word2find + "'");
            stockList = (List<Stock>) q.list();
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.close();
        }

        return stockList;
    }

}
