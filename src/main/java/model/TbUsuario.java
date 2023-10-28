package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_usuarios database table.
 * 
 */
@Entity
@Table(name="tb_usuarios")
@NamedQuery(name="TbUsuario.findAll", query="SELECT t FROM TbUsuario t")
public class TbUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbUsuarioPK id;

	private String apellidoM;

	private String apellidoP;

	private String contraseña;

	private String nombres;

	private int telefono;

	private String usuario;

	//bi-directional many-to-one association to TbCargo
	@ManyToOne
	@JoinColumn(name="id_cargo")
	private TbCargo tbCargo1;

	//bi-directional many-to-one association to TbCargo
	@ManyToOne
	@JoinColumn(name="id_cargo")
	private TbCargo tbCargo2;

	public TbUsuario() {
	}

	public TbUsuarioPK getId() {
		return this.id;
	}

	public void setId(TbUsuarioPK id) {
		this.id = id;
	}

	public String getApellidoM() {
		return this.apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public String getApellidoP() {
		return this.apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getContraseña() {
		return this.contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public TbCargo getTbCargo1() {
		return this.tbCargo1;
	}

	public void setTbCargo1(TbCargo tbCargo1) {
		this.tbCargo1 = tbCargo1;
	}

	public TbCargo getTbCargo2() {
		return this.tbCargo2;
	}

	public void setTbCargo2(TbCargo tbCargo2) {
		this.tbCargo2 = tbCargo2;
	}

}