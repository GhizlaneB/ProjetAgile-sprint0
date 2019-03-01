package ubo.sprint0.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ubo.sprint0.entities.Candidat;
import ubo.sprint0.service.CandidatService;

@CrossOrigin
@RestController
@RequestMapping("/")
public class CandidatController {

	@Autowired
	private CandidatService candidatservice;

	// Recuperer tous les candidats
	@RequestMapping(method = RequestMethod.GET, value="/candidats")
	public List<Candidat> recupererTousLesCandidat() {

		return candidatservice.recupererTousLesCandidat();
	}

	// Recuperer un candidat par son id
	@RequestMapping(method = RequestMethod.GET, value="/candidats/{id}")
	public Optional<Candidat> recupererCandidatParID(@PathVariable String id) {
		return candidatservice.recupererCandidatParID(id);
	}

	// Recuperer un candidat par son nom
	@RequestMapping(method = RequestMethod.GET, value="/candidats/nom/{nom}")
	public Candidat recupererCandidatParNom(@PathVariable String nom) {
		return candidatservice.recupererCandidatParNom(nom);
	}

	// Recuperer un candidat par son universite
	@RequestMapping(method = RequestMethod.GET, value="/candidats/universite/{universite}")
	public Candidat recupererCandidatParUniverite(@PathVariable String universite) {
		return candidatservice.recupererCandidatParUniverite(universite);
	}

	// Ajouter candidat
	@RequestMapping(method = RequestMethod.POST, value = "/candidats")
	public void creerCandidat(@RequestBody Candidat candidat) {
		candidatservice.creerCandidat(candidat);
	}

	// Supprimer un candidat par id
	@RequestMapping(method = RequestMethod.DELETE, value = "/candidats/{id}")
	public void supprimerCandidat(@PathVariable String id) {
		candidatservice.supprimerCandidat(id);
	}

	// Supprimer tous les candidats
	@RequestMapping(method = RequestMethod.DELETE, value = "/candidats")
	public void supprimerCandidats() {
		candidatservice.supprimerCandidats();
	}
}