package dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table()
public class Anime implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;

	@Column
	private String nombre;

	@Column
	private String apellido;

	@Column
	private LocalDateTime fechadeEmision;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "anime", cascade = CascadeType.ALL)
	private List<Episodio> episodio = new ArrayList<>();

	// Constructor
	public Anime() {

	}

	public Anime(String nombre, String apellido, LocalDateTime fechadeEmision) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechadeEmision = fechadeEmision;
	}

	// Getters y Setters
	public Long getCodigo() {
		return id;
	}

	public void setCodigo(Long codigo) {
		this.id = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechadeEmision() {
		return fechadeEmision;
	}

	public void setFechadeEmision(LocalDateTime fechadeEmision) {
		this.fechadeEmision = fechadeEmision;
	}

	public java.util.List<Episodio> getEpisodio() {
		return episodio;
	}

	public void setEpisodio(java.util.List<Episodio> episodio) {
		this.episodio = episodio;
	}

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date")
	private Date createDate;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Update_date")
	private Date UpdateDate;

}
