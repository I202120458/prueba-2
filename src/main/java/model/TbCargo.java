package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tb_cargo database table.
 * 
 */
@Entity
@Table(name="tb_cargo")
@NamedQuery(name="TbCargo.findAll", query="SELECT t FROM TbCargo t")
public class TbCargo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_cargo")
	private int idCargo;

	private String descripcion;

	//bi-directional many-to-one association to TbUsuario
	@OneToMany(mappedBy="tbCargo1")
	private List<TbUsuario> tbUsuarios1;

	//bi-directional many-to-one association to TbUsuario
	@OneToMany(mappedBy="tbCargo2")
	private List<TbUsuario> tbUsuarios2;

	public TbCargo() {
	}

	public int getIdCargo() {
		return this.idCargo;
	}

	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<TbUsuario> getTbUsuarios1() {
		return this.tbUsuarios1;
	}

	public void setTbUsuarios1(List<TbUsuario> tbUsuarios1) {
		this.tbUsuarios1 = tbUsuarios1;
	}

	public TbUsuario addTbUsuarios1(TbUsuario tbUsuarios1) {
		getTbUsuarios1().add(tbUsuarios1);
		tbUsuarios1.setTbCargo1(this);

		return tbUsuarios1;
	}

	public TbUsuario removeTbUsuarios1(TbUsuario tbUsuarios1) {
		getTbUsuarios1().remove(tbUsuarios1);
		tbUsuarios1.setTbCargo1(null);

		return tbUsuarios1;
	}

	public List<TbUsuario> getTbUsuarios2() {
		return this.tbUsuarios2;
	}

	public void setTbUsuarios2(List<TbUsuario> tbUsuarios2) {
		this.tbUsuarios2 = tbUsuarios2;
	}

	public TbUsuario addTbUsuarios2(TbUsuario tbUsuarios2) {
		getTbUsuarios2().add(tbUsuarios2);
		tbUsuarios2.setTbCargo2(this);

		return tbUsuarios2;
	}

	public TbUsuario removeTbUsuarios2(TbUsuario tbUsuarios2) {
		getTbUsuarios2().remove(tbUsuarios2);
		tbUsuarios2.setTbCargo2(null);

		return tbUsuarios2;
	}

}