package ec.edu.ups.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pedido
 *
 */
@Entity
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private int numero;
	private LocalDate fecha;
	private String nombreCliente;
	private double subtotal;
	private double iva;
	private double total;
	private String observaciones;
	
	@Transient
	private boolean editable;
	
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	private List<Comidas> comidas;
	
	@ManyToOne
	private TarjetaCredito tarjetaCredito;

	public Pedido() {
		//super();
	}

	public Pedido(String nombreCliente, double subtotal, double iva, double total,
			String observaciones) {
		//super();
		//this.numero = numero;
		//this.fecha = fecha;
		this.nombreCliente = nombreCliente;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
		this.observaciones = observaciones;
		//this.comidas = comidas;
		//this.tarjetaCredito = tarjetaCredito;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
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

	/**
	 * @return the comidas
	 */
	public List<Comidas> getComidas() {
		return comidas;
	}

	/**
	 * @param comidas the comidas to set
	 */
	public void setComidas(List<Comidas> comidas) {
		this.comidas = comidas;
	}

	/**
	 * @return the tarjetaCredito
	 */
	public TarjetaCredito getTarjetaCredito() {
		return tarjetaCredito;
	}

	/**
	 * @param tarjetaCredito the tarjetaCredito to set
	 */
	public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	
	

	/**
	 * @return the editable
	 */
	public boolean isEditable() {
		return editable;
	}

	/**
	 * @param editable the editable to set
	 */
	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", fecha=" + fecha + ", nombreCliente=" + nombreCliente + ", subtotal="
				+ subtotal + ", iva=" + iva + ", total=" + total + ", observaciones=" + observaciones + ", comidas="
				+ comidas + ", tarjetaCredito=" + tarjetaCredito + "]";
	}
}
