package dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.UpdateTimestamp;
 
@Entity
@Table()
@Cacheable(true)
public class Anime implements Serializable {

	private static final long serialVersionUID = 14L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "anime_id")
	private Long id;

	@Column(length = 100)
	private String title;

	@Column(length = 900)
	private String synopsis;

	@Column
	private String state;

	@Column
	private String type;

	@Column(length = 500)
	private String frontimage;

	@Column(length = 500)
	private String backgroundimage;

	@Column
	private LocalDateTime fechadeEmision;

	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(mappedBy = "animes", cascade = CascadeType.ALL)
	private List<Tags> tags = new ArrayList<>();

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "anime", cascade = CascadeType.ALL)
	private List<Episodio> episodio = new ArrayList<>();

	// Constructor
	public Anime() {

	}

	public Anime(String title, String synopsis, String state, String type, String frontimage, String backgroundimage,
			LocalDateTime fechadeEmision) {

		this.title = title;
		this.synopsis = synopsis;
		this.state = state;
		this.type = type;
		this.frontimage = frontimage;
		this.backgroundimage = backgroundimage;
		this.fechadeEmision = fechadeEmision;
	}

	public List<Tags> getTags() {
		return tags;
	}

	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFrontimage() {
		return frontimage;
	}

	public void setFrontimage(String frontimage) {
		this.frontimage = frontimage;
	}

	public String getBackgroundimage() {
		return backgroundimage;
	}

	public void setBackgroundimage(String backgroundimage) {
		this.backgroundimage = backgroundimage;
	}

	// Getters y Setters
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getFechadeEmision() {
		return fechadeEmision;
	}

	public void setFechadeEmision(LocalDateTime fechadeEmision) {
		this.fechadeEmision = fechadeEmision;
	}

	public List<Episodio> getEpisodio() {
		return episodio;
	}

	public void setEpisodio(List<Episodio> episodio) {
		this.episodio = episodio;
	}

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date")
	private Date createDate;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_date")
	private Date updateDate;

}
