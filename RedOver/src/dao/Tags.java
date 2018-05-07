package dao;

import java.io.Serializable;
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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tag")
public class Tags implements Serializable {

	private static final long serialVersionUID = 10L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tag_id")
	private Long id;

	@Column(name = "tagName")
	private String tagName;

	@Column
	private Long idParent;

	/*
	 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	 * 
	 * @JoinTable(name = "tag_anime", joinColumns = @JoinColumn(name = "tag_id"),
	 * inverseJoinColumns = @JoinColumn(name = "animeId")) private Set<Anime>
	 * animes;
	 */

	/*
	 * @ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	 * 
	 * @JoinTable(name = "tag_anime", joinColumns = { @JoinColumn(name = "tag_id")
	 * }, inverseJoinColumns = {
	 * 
	 * @JoinColumn(name = "id_tag") }) public List<Anime> animes = new
	 * ArrayList<>();
	 */

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "animeidtag")
	private List<Anime> animes = new ArrayList<>();

	public Tags() {
		// Empy constructor
	}

	/*
	 * public Tags(int id, String tagName, List<Anime> animes, Date createDate, Date
	 * updateDate) {
	 * 
	 * this.id = id; this.tagName = tagName; this.animes = animes; this.createDate =
	 * createDate; this.updateDate = updateDate; }
	 */

	public Tags(Long id, String tagName, Long idParent, List<Anime> animes, Date createDate, Date updateDate) {

		this.id = id;
		this.tagName = tagName;
		this.idParent = idParent;
		this.animes = animes;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public List<Anime> getAnimes() {
		return animes;
	}

	public void setAnimes(List<Anime> animes) {
		this.animes = animes;
	}

	public Long getId() {
		return id;
	}

	public Long getIdParent() {
		return idParent;
	}

	public void setIdParent(Long idParent) {
		this.idParent = idParent;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
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
