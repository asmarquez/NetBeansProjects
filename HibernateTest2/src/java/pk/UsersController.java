/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Juan
 */
@Named(value = "usersController")
@RequestScoped
public class UsersController implements Serializable {

    DataModel usersInfos;
    UsersHelper helper;

    private String usersName;

    public UsersController() {

        helper = new UsersHelper();

    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public DataModel getUsersByName() {
        if (usersInfos == null) {
            usersInfos = new ListDataModel(helper.getUsersByName(usersName));
        }
        return usersInfos;
    }
    
    public String irPaginaIndex(){
        usersInfos = null;
        return "index";
    }

}
