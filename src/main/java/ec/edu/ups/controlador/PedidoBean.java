/**
 * 
 */
package ec.edu.ups.controlador;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.PedidosFacade;
import ec.edu.ups.ejb.TarjetaCreditoFacade;
import ec.edu.ups.entidades.Pedido;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class PedidoBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@EJB
	private PedidosFacade ejbPedidosFacade;

	@EJB
	private TarjetaCreditoFacade ejbTarjetaCreditoFacade;

	private List<Pedido> list;
	private LocalDate fecha;
	private String nombreCliente;
	private double subtotal;
	private double iva;
	private double total;
	private String observaciones;

	public PedidoBean() {

	}

	@PostConstruct
	public void init() {
		// ejbCategoryFacade.create(new Category("Hola"));
		// ejbCategoryFacade.create(new Category("1211"));
		list = ejbPedidosFacade.findAll();
	}

	public Pedido[] getList() {
		return list.toArray(new Pedido[0]);
	}

	public void setList(List<Pedido> list) {
		this.list = list;
	}
	
	

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the nombreCliente
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}

	/**
	 * @param nombreCliente the nombreCliente to set
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	/**
	 * @return the subtotal
	 */
	public double getSubtotal() {
		return subtotal;
	}

	/**
	 * @param subtotal the subtotal to set
	 */
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * @return the iva
	 */
	public double getIva() {
		return iva;
	}

	/**
	 * @param iva the iva to set
	 */
	public void setIva(double iva) {
		this.iva = iva;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * @param observaciones the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String add() {
		ejbPedidosFacade.create(
				new Pedido(this.nombreCliente, this.subtotal, this.iva, this.total, this.observaciones));
		list = ejbPedidosFacade.findAll();
		return null;
	}

	public String delete(Pedido p) {
		ejbPedidosFacade.remove(p);
		list = ejbPedidosFacade.findAll();
		return null;
	}

	public String edit(Pedido p) {
		p.setEditable(true);
		return null;
	}

	public String save(Pedido p) {
		ejbPedidosFacade.edit(p);
		p.setEditable(false);
		return null;
	}

}
