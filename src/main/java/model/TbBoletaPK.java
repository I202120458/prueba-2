package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tb_boleta database table.
 * 
 */
@Embeddable
public class TbBoletaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_boleta")
	private String idBoleta;

	@Column(name="dni_cliente")
	private String dniCliente;

	public TbBoletaPK() {
	}
	public String getIdBoleta() {
		return this.idBoleta;
	}
	public void setIdBoleta(String idBoleta) {
		this.idBoleta = idBoleta;
	}
	public String getDniCliente() {
		return this.dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TbBoletaPK)) {
			return false;
		}
		TbBoletaPK castOther = (TbBoletaPK)other;
		return 
			this.idBoleta.equals(castOther.idBoleta)
			&& this.dniCliente.equals(castOther.dniCliente);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idBoleta.hashCode();
		hash = hash * prime + this.dniCliente.hashCode();
		
		return hash;
	}
}