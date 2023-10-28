package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tb_categoria database table.
 * 
 */
@Entity
@Table(name="tb_categoria")
@NamedQuery(name="TbCategoria.findAll", query="SELECT t FROM TbCategoria t")
public class TbCategoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_categoria")
	private int idCategoria;

	private String descripcion;

	//bi-directional many-to-one association to TbProducto
	@OneToMany(mappedBy="tbCategoria")
	private List<TbProducto> tbProductos;

	public TbCategoria() {
	}

	public int getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<TbProducto> getTbProductos() {
		return this.tbProductos;
	}

	public void setTbProductos(List<TbProducto> tbProductos) {
		this.tbProductos = tbProductos;
	}

	public TbProducto addTbProducto(TbProducto tbProducto) {
		getTbProductos().add(tbProducto);
		tbProducto.setTbCategoria(this);

		return tbProducto;
	}

	public TbProducto removeTbProducto(TbProducto tbProducto) {
		getTbProductos().remove(tbProducto);
		tbProducto.setTbCategoria(null);

		return tbProducto;
	}

}