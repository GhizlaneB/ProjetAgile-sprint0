package ubo.sprint0.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ubo.sprint0.entities.Formation;
import ubo.sprint0.repository.FormationRepository;

@Service
public class FormationService {
	@Autowired
	FormationRepository formationRepository;

	// Recuperer la liste des formations
	public List<Formation> recupererToutesLesFormations() {
		return formationRepository.findAll();
	}

	// Recuperer la formation par code
	public Formation recupererLaFormationAvecLeCodeFormation(String codeFormation) {

		List<Formation> listeDesFormations = formationRepository.findAll();
		return listeDesFormations.stream().filter(t -> t.getCodeFormation().equals(codeFormation)).findFirst().get();
	}

	// Recuperer la formation par son nom
	public Formation RecupererLaFormationAvecLeNom(String nomFormation) {

		List<Formation> listeDesFormationsParNom = formationRepository.findAll();
		return listeDesFormationsParNom.stream().filter(t -> t.getNomFormation().equals(nomFormation)).findFirst()
				.get();
	}

	// creer une formation
	public void creerFormation(Formation formation) {
		formationRepository.save(formation);

	}

	// supprimer une formation par son code
	public void supprimerFormation(String codeFormation) {
		formationRepository.deleteById(codeFormation);
	}

	// supprimer toutes les formations
	public void supprimerFormations() {
		formationRepository.deleteAll();
	}

	// Mettre à jour une formation
	public void misAjourdeFormation(Formation formation) {
		formationRepository.save(formation);

	}
}
