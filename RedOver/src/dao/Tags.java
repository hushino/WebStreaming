package dao;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tag")
public class Tags {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tag_id")
	private int id;

	@Column(name = "tagName")
	private String tagName;

	/*
	 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	 * 
	 * @JoinTable(name = "tag_anime", joinColumns = @JoinColumn(name = "tag_id"),
	 * inverseJoinColumns = @JoinColumn(name = "animeId")) private Set<Anime>
	 * animes;
	 */

	@ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinTable(name = "tag_anime", joinColumns = { @JoinColumn(name = "tag_id") }, inverseJoinColumns = {
			@JoinColumn(name = "animeId") })
	private Set<Anime> animes = new HashSet<>();

	public Tags() {
		// Empy constructor
	}

	public Tags(int id, String tagName, Set<Anime> animes, Date createDate, Date updateDate) {
		
		this.id = id;
		this.tagName = tagName;
		this.animes = animes;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public Set<Anime> getAnimes() {
		return animes;
	}

	public void setAnimes(Set<Anime> animes) {
		this.animes = animes;
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
