package ubo.sprint0.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.stream.Stream;


/**
 * The persistent class for the promotion database table.
 * 
 */
@Entity
@Table(name="PROMOTION")
@NamedQuery(name="Promotion.findAll", query="SELECT p FROM Promotion p")
public class Promotion implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private PromotionPK id;
	@Column(name="ANNEE_UNIVERSITAIRE",insertable=false, updatable=false)
	private String anneeUniversitaire;

	@Override
	public String toString() {
		return "Promotion [id=" + id + ", anneeUniversitaire=" + anneeUniversitaire + ", commentaire=" + commentaire
				+ ", dateRentree=" + dateRentree + ", dateReponseLalp=" + dateReponseLalp + ", dateReponseLp="
				+ dateReponseLp + ", lieuRentree=" + lieuRentree + ", nbMaxEtudiant=" + nbMaxEtudiant
				+ ", processusStage=" + processusStage + ", siglePromotion=" + siglePromotion + ", enseignant="
				+ enseignant + ", formation=" + formation + "]";
	}

	private String commentaire;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_RENTREE")
	private Date dateRentree;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_REPONSE_LALP")
	private Date dateReponseLalp;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_REPONSE_LP")
	private Date dateReponseLp;

	@Column(name="LIEU_RENTREE")
	private String lieuRentree;

	@Column(name="NB_MAX_ETUDIANT")
	private short nbMaxEtudiant;

	@Column(name="PROCESSUS_STAGE")
	private String processusStage;

	@Column(name="SIGLE_PROMOTION")
	private String siglePromotion;

	//bi-directional many-to-one association to Enseignant
	@ManyToOne
	@JoinColumn(name="NO_ENSEIGNANT")
	private Enseignant enseignant;

	//bi-directional many-to-one association to Formation
	@ManyToOne
	@JoinColumn(name="CODE_FORMATION",insertable=false, updatable=false)
	private Formation formation;

	public Promotion() {
	}

	public String getAnneeUniversitaire() {
		return this.anneeUniversitaire;
	}

	public void setAnneeUniversitaire(String anneeUniversitaire) {
		this.anneeUniversitaire = anneeUniversitaire;
	}

	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Date getDateRentree() {
		return this.dateRentree;
	}

	public void setDateRentree(Date dateRentree) {
		this.dateRentree = dateRentree;
	}

	public Date getDateReponseLalp() {
		return this.dateReponseLalp;
	}

	public void setDateReponseLalp(Date dateReponseLalp) {
		this.dateReponseLalp = dateReponseLalp;
	}

	public Date getDateReponseLp() {
		return this.dateReponseLp;
	}

	public void setDateReponseLp(Date dateReponseLp) {
		this.dateReponseLp = dateReponseLp;
	}

	public String getLieuRentree() {
		return this.lieuRentree;
	}

	public void setLieuRentree(String lieuRentree) {
		this.lieuRentree = lieuRentree;
	}

	public short getNbMaxEtudiant() {
		return this.nbMaxEtudiant;
	}

	public void setNbMaxEtudiant(short nbMaxEtudiant) {
		this.nbMaxEtudiant = nbMaxEtudiant;
	}

	public String getProcessusStage() {
		return this.processusStage;
	}

	public void setProcessusStage(String processusStage) {
		this.processusStage = processusStage;
	}

	public String getSiglePromotion() {
		return this.siglePromotion;
	}

	public void setSiglePromotion(String siglePromotion) {
		this.siglePromotion = siglePromotion;
	}

	public Enseignant getEnseignant() {
		return this.enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public Formation getFormation() {
		return this.formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	public PromotionPK getId() {
		return id;
	}

	public void setId(PromotionPK id) {
		this.id = id;
	}

	public Stream<Promotion> stream() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}