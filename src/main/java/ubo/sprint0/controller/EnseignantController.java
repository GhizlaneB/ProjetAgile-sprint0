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

import ubo.sprint0.entities.Enseignant;
import ubo.sprint0.service.EnseignantService;


@CrossOrigin
@RestController
@RequestMapping("/")
public class EnseignantController {

	@Autowired
	private EnseignantService enseignantservice;

	//Recuperer tous les enseignants
	@RequestMapping(method = RequestMethod.GET, value="/enseignants")
	public List<Enseignant> recupererTousLesEnseignants() {

		return enseignantservice.recupererTousLesEnseignants();
	}

	//Recuperer un enseignant par son id 
	@RequestMapping(method = RequestMethod.GET, value="/enseignants/{noEnseignant}")
	public Optional<Enseignant> recupererEnseignantParNoEnseignant(@PathVariable int noEnseignant) {
		return enseignantservice.recupererEnseignantParNoEnseignant(noEnseignant);
	}

	//Recuperer un enseignant par son nom
	@RequestMapping(method = RequestMethod.GET, value="/enseignants/nom/{nom}")
	public Enseignant recupererEnseignantParNom(@PathVariable String nom) {
		return enseignantservice.recupererEnseignantParNom(nom);
	}

	//Recuperer un enseignant par son universite
	@RequestMapping(method = RequestMethod.GET, value="/enseignants/emailUbo/{emailUbo}")
	public Enseignant recupererEnseignantParEmailUbo(@PathVariable String emailUbo) {
		return enseignantservice.recupererEnseignantParEmailUbo(emailUbo);
	}

	//Ajouter un enseignant
	@RequestMapping(method = RequestMethod.POST, value = "/enseignants")
	public void creerEnseignant(@RequestBody Enseignant enseignant) {
		enseignantservice.creerEnseignant(enseignant);
	}

	//Supprimer tous les enseignants
	@RequestMapping(method = RequestMethod.DELETE, value = "/enseignants")
	public void supprimerEnseignant() {
		enseignantservice.supprimerEnseignant();
	}
}
