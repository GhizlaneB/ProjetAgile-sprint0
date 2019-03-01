package ubo.sprint0.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;



	
	@Embeddable
	public class UniteEnseignementPK implements Serializable{
		private static final long serialVersionUID = 1L;
		
		
		
		@Column(name="CODE_FORMATION", insertable=false, updatable=false)
		private String codeFormation;

		@Column(name="CODE_UE")
		private String codeUe;

		public UniteEnseignementPK() {
		}

		public String getCodeFormation() {
			return codeFormation;
		}

		public void setCodeFormation(String codeFormation) {
			this.codeFormation = codeFormation;
		}

		public String getCodeUe() {
			return codeUe;
		}

		public void setCodeUe(String codeUe) {
			this.codeUe = codeUe;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((codeFormation == null) ? 0 : codeFormation.hashCode());
			result = prime * result + ((codeUe == null) ? 0 : codeUe.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			UniteEnseignementPK other = (UniteEnseignementPK) obj;
			if (codeFormation == null) {
				if (other.codeFormation != null)
					return false;
			} else if (!codeFormation.equals(other.codeFormation))
				return false;
			if (codeUe == null) {
				if (other.codeUe != null)
					return false;
			} else if (!codeUe.equals(other.codeUe))
				return false;
			return true;
		}
		
		
		
		
}
