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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table()
@Cache(region = "animeCache",usage = CacheConcurrencyStrategy.READ_WRITE)
public class Anime implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;

	@Column
	private String title;

	@Column
	private String synopsis;

	@Column
	private String state;

	@Column
	private String type;

	@Column
	private String tags;

	@Column
	private String frontimage;

	@Column
	private String backgroundimage;

	@Column
	private LocalDateTime fechadeEmision;

	
    @org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "anime", cascade = CascadeType.ALL)
	private List<Episodio> episodio = new ArrayList<>();

	// Constructor
	public Anime() {

	}

	public Anime(String title, String synopsis, String state, String type, String tags, String frontimage,
			String backgroundimage, LocalDateTime fechadeEmision) {

		this.title = title;
		this.synopsis = synopsis;
		this.state = state;
		this.type = type;
		this.tags = tags;
		this.frontimage = frontimage;
		this.backgroundimage = backgroundimage;
		this.fechadeEmision = fechadeEmision;
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

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
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
	@Column(name = "Update_date")
	private Date UpdateDate;

}
