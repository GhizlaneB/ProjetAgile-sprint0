package ubo.sprint0.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ubo.sprint0.entities.Candidat;
import ubo.sprint0.repository.CandidatRepository;

@Service
public class CandidatService {
	@Autowired
	CandidatRepository candidatrepository;

	// Recuperer tous les candidats
	public List<Candidat> recupererTousLesCandidat() {

		return candidatrepository.findAll();
	}

	// recuperer candidat par id
	public Optional<Candidat> recupererCandidatParID(String id) {
		return candidatrepository.findById(id);
	}

	// retourner un candidat par nom:
	public Candidat recupererCandidatParNom(String nom) {
		List<Candidat> listeDesCandidat = candidatrepository.findAll();
		return listeDesCandidat.stream().filter(t -> t.getNom().equals(nom)).findFirst().get();
	}

	// retourner un candidat par universite:
	public Candidat recupererCandidatParUniverite(String universite) {
		List<Candidat> listeDesCandidat = candidatrepository.findAll();
		return listeDesCandidat.stream().filter(t -> t.getUniversiteOrigine().equals(universite)).findFirst().get();
	}

	// ajouter un candidat
	public void creerCandidat(Candidat candidat) {
		candidatrepository.save(candidat);
	}

	// supprimer un candidat
	public void supprimerCandidat(String id) {
		candidatrepository.deleteById(id);
	}

	// supprimer tous les candidats
	public void supprimerCandidats() {
		candidatrepository.deleteAll();
	}

}
