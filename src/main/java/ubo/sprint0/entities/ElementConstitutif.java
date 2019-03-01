package ubo.sprint0.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the element_constitutif database table.
 * 
 */
@Entity
@Table(name="element_constitutif")
@NamedQuery(name="ElementConstitutif.findAll", query="SELECT e FROM ElementConstitutif e")
public class ElementConstitutif implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ElementConstitutifPK id;

	private String description;

	private String designation;

	@Column(name="NBH_CM")
	private byte nbhCm;

	@Column(name="NBH_TD")
	private byte nbhTd;

	@Column(name="NBH_TP")
	private byte nbhTp;

	@Column(name="NO_ENSEIGNANT")
	private int noEnseignant;

	public ElementConstitutif() {
	}

	public ElementConstitutifPK getId() {
		return this.id;
	}

	public void setId(ElementConstitutifPK id) {
		this.id = id;
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

	public byte getNbhCm() {
		return this.nbhCm;
	}

	public void setNbhCm(byte nbhCm) {
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

	public int getNoEnseignant() {
		return this.noEnseignant;
	}

	public void setNoEnseignant(int noEnseignant) {
		this.noEnseignant = noEnseignant;
	}

}