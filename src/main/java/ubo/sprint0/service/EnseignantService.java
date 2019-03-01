package ubo.sprint0.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ubo.sprint0.entities.Enseignant;
import ubo.sprint0.repository.EnseignantRepository;

@Service
public class EnseignantService {
	@Autowired
	EnseignantRepository enseignantrepository;

	// Recuperer tous les enseignants
	public List<Enseignant> recupererTousLesEnseignants() {

		return enseignantrepository.findAll();
	}

	// Recuperer un enseignant par son identifiant
	public Optional<Enseignant> getEnseignant(int noenseignant) {
		return enseignantrepository.findById(noenseignant);
	}

	// Recuperer un enseignant par son nom
	public Enseignant recupererEnseignantParNom(String nom) {
		List<Enseignant> listeDesCandidat = enseignantrepository.findAll();
		return listeDesCandidat.stream().filter(t -> t.getNom().equals(nom)).findFirst().get();
	}

	// Recuperer un enseignant par son universite
	public Enseignant recupererEnseignantParEmailUbo(String email) {
		List<Enseignant> listeDesCandidat = enseignantrepository.findAll();
		return listeDesCandidat.stream().filter(t -> t.getEmailUbo().equals(email)).findFirst().get();
	}

	// Recuperer un enseignant par l'emailUbo:
	public Enseignant recupererEnseignantParEmailUbo(int noenseignant) {
		List<Enseignant> listeDesCandidat = enseignantrepository.findAll();
		return listeDesCandidat.stream().filter(t -> t.getNoEnseignant() == (noenseignant)).findFirst().get();
	}

	// Ajouter un enseignant
	public void creerEnseignant(Enseignant enseignant) {
		enseignantrepository.save(enseignant);
	}

	// Supprimer tous les enseignants
	public void supprimerEnseignant() {
		enseignantrepository.deleteAll();
	}

}