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

import ubo.sprint0.entities.*;
import ubo.sprint0.repository.PromotionRepository;
import ubo.sprint0.service.PromotionService;

@CrossOrigin
@RestController
@RequestMapping("/")
public class PromotionController {

	@Autowired
	PromotionRepository promotionrepository;

	@Autowired
	private PromotionService promotionservice;

	// Recuperer toutes les promotions
	@RequestMapping(method = RequestMethod.GET, value="/promotions")
	public List<Promotion> recupererToutesLesPromotions() {
		return promotionservice.recupererToutesLesPromotions();
	}
	
	//Recuperer les promotions à partir de l'ID composé de formation et anneeUniversitaire
	@RequestMapping(method = RequestMethod.GET, value="/promotions/{formation}/{anneeUniversitaire}")
	public Optional<Promotion> recupererPromotionParId(@PathVariable String formation,
			@PathVariable String anneeUniversitaire) {
		return promotionservice.recupererPromotionParId(formation, anneeUniversitaire);
	}

	//Delete les promotions à partir de l'ID composé de formation et anneeUniversitaire
	@RequestMapping(method = RequestMethod.DELETE, value = "/promotions/{formation}/{anneeUniversitaire}")
	public void supprimerPromotion(@PathVariable String formation, @PathVariable String anneeUniversitaire) {
		promotionservice.supprimerPromotion(formation, anneeUniversitaire);
	}

	
	//Recuperer une promotion à partir de siglePromotion
	@RequestMapping(method = RequestMethod.GET, value="/promotions/siglePromotion/{siglePromotion}")
	public Promotion recupererPromotionParSigle(@PathVariable String siglePromotion) {
		return promotionservice.recupererPromotionParSigle(siglePromotion);
	}

	//Supprimer toutes les promotions
	@RequestMapping(method = RequestMethod.DELETE, value = "/promotions")
	public void supprimerPromotions() {
		promotionservice.supprimerPromotions();
	}

	//Ajouter une promotion
	@RequestMapping(method = RequestMethod.POST, value = "/promotions")
	public void creerPromotion(@RequestBody Promotion promotion) {
		promotionservice.creerPromotion(promotion);
	}

	//Recuperer une promotion à partir de lieuRentree
	@RequestMapping(method = RequestMethod.GET, value="/promotions/lieuRentree/{lieuRentree}")
	public List<Promotion> recupererPromotionParLieuRentree(@PathVariable String lieuRentree) {
		return promotionservice.recupererPromotionParLieuRentree(lieuRentree);
	}

}
