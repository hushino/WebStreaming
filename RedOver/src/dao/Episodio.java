package dao;

import java.time.LocalDateTime;
import java.util.Date;

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
public class Episodio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;

	@Column
	private String title;

	@Column
	private String imageCap;

	@Column
	private int chapter;

	@Column
	private String server;

	@Column
	private LocalDateTime timestap;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ANIME_ID")
	private Anime anime;

	public Episodio() {

	}

	public Episodio(String title, String imageCap, int chapter, String server, LocalDateTime timestap, Anime anime) {
		this.title = title;
		this.imageCap = imageCap;
		this.chapter = chapter;
		this.server = server;
		this.timestap = timestap;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
	private Date UpdateDate;

}
