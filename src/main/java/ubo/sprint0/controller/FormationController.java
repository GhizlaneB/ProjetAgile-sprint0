package ubo.sprint0.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ubo.sprint0.entities.Formation;
import ubo.sprint0.service.FormationService;

@CrossOrigin
@RestController
@RequestMapping("/")
public class FormationController {
	@Autowired
	private FormationService formationService;

	// Recuperer la liste des formations
	@RequestMapping(method = RequestMethod.GET, value="/formations")
	public List<Formation> recupererToutesLesFormations() {
		return formationService.recupererToutesLesFormations();
	}

	// Recuperer formations par id
	@RequestMapping(method = RequestMethod.GET, value="/formations/{codeFormation}")
	public Formation recupererLaFormationAvecLeCodeFormation(@PathVariable String codeFormation) {
		return formationService.recupererLaFormationAvecLeCodeFormation(codeFormation);
	}

	// Recuperer formations par nom de la formation
	@RequestMapping(method = RequestMethod.GET,value="/formations/nom/{nomFormation}")
	public Formation RecupererLaFormationAvecLeNom(@PathVariable String nomFormation) {
		return formationService.RecupererLaFormationAvecLeNom(nomFormation);
	}

	// Creer formation
	@RequestMapping(method = RequestMethod.POST, value = "/formations")
	public void creerFormation(@RequestBody Formation formation) {
		formationService.creerFormation(formation);
	}

	// Supprimer une formation par codeFormation
	@RequestMapping(method = RequestMethod.DELETE, value = "/formations/{codeFormation}")
	public void supprimerFormation(@PathVariable String codeFormation) {
		formationService.supprimerFormation(codeFormation);
	}

	// Supprimer toutes les formations
	@RequestMapping(method = RequestMethod.DELETE, value = "/formations")
	public void supprimerFormations() {
		formationService.supprimerFormations();
	}

	// Mise à jour d'une formation
	@RequestMapping(method = RequestMethod.PUT, value = "/formations")
	public void misAjourdeFormation(@RequestBody Formation formation) {
		formationService.misAjourdeFormation(formation);
	}

}