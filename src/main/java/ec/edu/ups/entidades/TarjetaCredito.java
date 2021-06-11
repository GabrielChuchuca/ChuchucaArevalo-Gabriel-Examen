package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TarjetaCredito
 *
 */
@Entity
public class TarjetaCredito implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private int numeroTarjeta;
	private String nombreTitular;
	private Date fechaCaducidad;
	private int cvv;
	
	@OneToMany(mappedBy = "tarjetaCredito", cascade = CascadeType.ALL)
	private List<Pedido> pedidos;
	
	public TarjetaCredito() {
		super();
	}

	public TarjetaCredito(int numeroTarjeta, String nombreTitular, Date fechaCaducidad, int cvv, List<Pedido> pedidos) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.nombreTitular = nombreTitular;
		this.fechaCaducidad = fechaCaducidad;
		this.cvv = cvv;
		this.pedidos = pedidos;
	}

	/**
	 * @return the numeroTarjeta
	 */
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	/**
	 * @param numeroTarjeta the numeroTarjeta to set
	 */
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	/**
	 * @return the nombreTitular
	 */
	public String getNombreTitular() {
		return nombreTitular;
	}

	/**
	 * @param nombreTitular the nombreTitular to set
	 */
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	/**
	 * @return the fechaCaducidad
	 */
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	/**
	 * @param fechaCaducidad the fechaCaducidad to set
	 */
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	/**
	 * @return the cvv
	 */
	public int getCvv() {
		return cvv;
	}

	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	/**
	 * @return the pedidos
	 */
	public List<Pedido> getPedidos() {
		return pedidos;
	}

	/**
	 * @param pedidos the pedidos to set
	 */
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "TarjetaCredito [numeroTarjeta=" + numeroTarjeta + ", nombreTitular=" + nombreTitular
				+ ", fechaCaducidad=" + fechaCaducidad + ", cvv=" + cvv + ", pedidos=" + pedidos + "]";
	}
}
