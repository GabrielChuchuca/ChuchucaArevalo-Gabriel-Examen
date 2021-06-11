/**
 * 
 */
package ec.edu.ups.controlador;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named(value = "bodegaBean")
@RequestScoped
public class PedidoBean implements Serializable{
	private static final long serialVersionUID = 1L;

}
