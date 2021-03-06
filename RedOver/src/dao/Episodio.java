package dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table()
@Cacheable(true)
public class Episodio implements Serializable {

	private static final long serialVersionUID = 2L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;

	@Column(length = 100)
	private String titleCap;

	@Column(length = 900)
	private String imageCap;

	@Column
	private int chapter;

	@Column(length = 300)
	private String server;

	@Column
	private Long parentId;

	@Column
	private LocalDateTime timestap;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "IdAnime")
	private Anime anime;

	public Episodio() {

	}

	public Episodio(String titleCap, String imageCap, int chapter, String server, Long parentId, LocalDateTime timestap,
			Anime anime) {

		this.titleCap = titleCap;
		this.imageCap = imageCap;
		this.chapter = chapter;
		this.server = server;
		this.parentId = parentId;
		this.timestap = timestap;
		this.anime = anime;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Anime getAnime() {
		return anime;
	}

	public void setAnime(Anime anime) {
		this.anime = anime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImageCap() {
		return imageCap;
	}

	public void setImageCap(String imageCap) {
		this.imageCap = imageCap;
	}

	public String getTitleCap() {
		return titleCap;
	}

	public void setTitleCap(String title) {
		this.titleCap = title;
	}

	public int getChapter() {
		return chapter;
	}

	public void setChapter(int chapter) {
		this.chapter = chapter;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public LocalDateTime getTimestap() {
		return timestap;
	}

	public void setTimestap(LocalDateTime timestap) {
		this.timestap = timestap;
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
