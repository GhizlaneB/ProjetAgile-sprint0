package ubo.sprint0.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the unite_enseignement database table.
 * 
 */
@Entity
@Table(name="unite_enseignement")
@NamedQuery(name="UniteEnseignement.findAll", query="SELECT u FROM UniteEnseignement u")
public class UniteEnseignement implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private UniteEnseignementPK id;
	
	@Column(name="CODE_UE",insertable=false, updatable=false)
	private String codeUe;

	private String description;

	private String designation;

	@Column(name="NBH_CM")
	private BigDecimal nbhCm;

	@Column(name="NBH_TD")
	private byte nbhTd;

	@Column(name="NBH_TP")
	private byte nbhTp;

	private String semestre;

	//bi-directional many-to-one association to Enseignant
	@ManyToOne
	@JoinColumn(name="NO_ENSEIGNANT")
	private Enseignant enseignant;

	//bi-directional many-to-one association to Formation
	@ManyToOne
	@JoinColumn(name="CODE_FORMATION",insertable=false, updatable=false)
	private Formation formation;

	public UniteEnseignement() {
	}

	public String getCodeUe() {
		return this.codeUe;
	}

	public void setCodeUe(String codeUe) {
		this.codeUe = codeUe;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public BigDecimal getNbhCm() {
		return this.nbhCm;
	}

	public void setNbhCm(BigDecimal nbhCm) {
		this.nbhCm = nbhCm;
	}

	public byte getNbhTd() {
		return this.nbhTd;
	}

	public void setNbhTd(byte nbhTd) {
		this.nbhTd = nbhTd;
	}

	public byte getNbhTp() {
		return this.nbhTp;
	}

	public void setNbhTp(byte nbhTp) {
		this.nbhTp = nbhTp;
	}

	public String getSemestre() {
		return this.semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
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

}