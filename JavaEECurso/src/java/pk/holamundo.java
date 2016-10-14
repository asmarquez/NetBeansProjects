/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk;

import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

/**
 *
 * @author Juan
 */
public class holamundo extends TagSupport {

    private String texto;
    private int repeticiones = 2;

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            for (int i = 0; i < repeticiones; i++) {
                out.print(texto + "<br/>");
            }
        } catch (IOException e) {
            throw new JspException("Error: IOException"
                    + e.getMessage());
        }
        if (Math.random() * 10 > 5) {
            return SKIP_BODY;
        }
        return EVAL_BODY_INCLUDE;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

}
