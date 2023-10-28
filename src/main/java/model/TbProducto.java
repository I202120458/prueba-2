package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the tb_producto database table.
 * 
 */
@Entity
@Table(name="tb_producto")
@NamedQuery(name="TbProducto.findAll", query="SELECT t FROM TbProducto t")
public class TbProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbProductoPK id;

	private String descripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_registro")
	private Date fechaRegistro;

	@Column(name="precio_venta")
	private BigDecimal precioVenta;

	private int stock;

	//bi-directional many-to-one association to TbCategoria
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private TbCategoria tbCategoria;

	//bi-directional many-to-one association to TbProveedore
	@ManyToOne
	@JoinColumn(name="id_proveedores")
	private TbProveedore tbProveedore;

	public TbProducto() {
	}

	public TbProductoPK getId() {
		return this.id;
	}

	public void setId(TbProductoPK id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public BigDecimal getPrecioVenta() {
		return this.precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public TbCategoria getTbCategoria() {
		return this.tbCategoria;
	}

	public void setTbCategoria(TbCategoria tbCategoria) {
		this.tbCategoria = tbCategoria;
	}

	public TbProveedore getTbProveedore() {
		return this.tbProveedore;
	}

	public void setTbProveedore(TbProveedore tbProveedore) {
		this.tbProveedore = tbProveedore;
	}

}