/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Dani
 */
@ManagedBean
@RequestScoped
@LocalBean
public class BeanTienda {
    
    private String nombreUsuario;
    private boolean GuardaSesion;

    public boolean isGuardaSesion() {
        return GuardaSesion;
    }

    public void setGuardaSesion(boolean GuardaSesion) {
        this.GuardaSesion = GuardaSesion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public BeanTienda(){

}
}
