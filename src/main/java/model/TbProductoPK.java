package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tb_producto database table.
 * 
 */
@Embeddable
public class TbProductoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_producto")
	private int idProducto;

	@Column(name="id_categoria", insertable=false, updatable=false)
	private int idCategoria;

	@Column(name="id_proveedores", insertable=false, updatable=false)
	private int idProveedores;

	public TbProductoPK() {
	}
	public int getIdProducto() {
		return this.idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getIdCategoria() {
		return this.idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public int getIdProveedores() {
		return this.idProveedores;
	}
	public void setIdProveedores(int idProveedores) {
		this.idProveedores = idProveedores;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TbProductoPK)) {
			return false;
		}
		TbProductoPK castOther = (TbProductoPK)other;
		return 
			(this.idProducto == castOther.idProducto)
			&& (this.idCategoria == castOther.idCategoria)
			&& (this.idProveedores == castOther.idProveedores);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idProducto;
		hash = hash * prime + this.idCategoria;
		hash = hash * prime + this.idProveedores;
		
		return hash;
	}
}