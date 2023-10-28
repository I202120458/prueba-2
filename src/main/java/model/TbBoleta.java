package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the tb_boleta database table.
 * 
 */
@Entity
@Table(name="tb_boleta")
@NamedQuery(name="TbBoleta.findAll", query="SELECT t FROM TbBoleta t")
public class TbBoleta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbBoletaPK id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	@Column(name="total_venta")
	private BigDecimal totalVenta;

	public TbBoleta() {
	}

	public TbBoletaPK getId() {
		return this.id;
	}

	public void setId(TbBoletaPK id) {
		this.id = id;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getTotalVenta() {
		return this.totalVenta;
	}

	public void setTotalVenta(BigDecimal totalVenta) {
		this.totalVenta = totalVenta;
	}

}