package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tb_usuarios database table.
 * 
 */
@Embeddable
public class TbUsuarioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="dni_usuarios")
	private String dniUsuarios;

	@Column(name="id_cargo", insertable=false, updatable=false)
	private int idCargo;

	public TbUsuarioPK() {
	}
	public String getDniUsuarios() {
		return this.dniUsuarios;
	}
	public void setDniUsuarios(String dniUsuarios) {
		this.dniUsuarios = dniUsuarios;
	}
	public int getIdCargo() {
		return this.idCargo;
	}
	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TbUsuarioPK)) {
			return false;
		}
		TbUsuarioPK castOther = (TbUsuarioPK)other;
		return 
			this.dniUsuarios.equals(castOther.dniUsuarios)
			&& (this.idCargo == castOther.idCargo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dniUsuarios.hashCode();
		hash = hash * prime + this.idCargo;
		
		return hash;
	}
}