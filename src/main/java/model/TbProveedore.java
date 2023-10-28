package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tb_proveedores database table.
 * 
 */
@Entity
@Table(name="tb_proveedores")
@NamedQuery(name="TbProveedore.findAll", query="SELECT t FROM TbProveedore t")
public class TbProveedore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_proveedores")
	private int idProveedores;

	private String direccion;

	private String email;

	@Column(name="raz_social")
	private String razSocial;

	@Column(name="ruc_proveedor")
	private String rucProveedor;

	private int telefono;

	//bi-directional many-to-one association to TbProducto
	@OneToMany(mappedBy="tbProveedore")
	private List<TbProducto> tbProductos;

	public TbProveedore() {
	}

	public int getIdProveedores() {
		return this.idProveedores;
	}

	public void setIdProveedores(int idProveedores) {
		this.idProveedores = idProveedores;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRazSocial() {
		return this.razSocial;
	}

	public void setRazSocial(String razSocial) {
		this.razSocial = razSocial;
	}

	public String getRucProveedor() {
		return this.rucProveedor;
	}

	public void setRucProveedor(String rucProveedor) {
		this.rucProveedor = rucProveedor;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public List<TbProducto> getTbProductos() {
		return this.tbProductos;
	}

	public void setTbProductos(List<TbProducto> tbProductos) {
		this.tbProductos = tbProductos;
	}

	public TbProducto addTbProducto(TbProducto tbProducto) {
		getTbProductos().add(tbProducto);
		tbProducto.setTbProveedore(this);

		return tbProducto;
	}

	public TbProducto removeTbProducto(TbProducto tbProducto) {
		getTbProductos().remove(tbProducto);
		tbProducto.setTbProveedore(null);

		return tbProducto;
	}

}