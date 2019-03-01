package ubo.sprint0.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ubo.sprint0.entities.Promotion;
import ubo.sprint0.entities.PromotionPK;
import ubo.sprint0.repository.PromotionRepository;

@Service
public class PromotionService {
	@Autowired
	PromotionRepository promotionrepository;

	// Recuperer toutes les promotions
	public List<Promotion> recupererToutesLesPromotions() {

		return promotionrepository.findAll();
	}

	// Recuperer une promotion à partir de lieuRentree
	public List<Promotion> recupererPromotionParLieuRentree(String lieuRentree) {
		List<Promotion> listeDesPromotion = promotionrepository.findAll();
		return listeDesPromotion.stream().filter(t -> t.getLieuRentree().equals(lieuRentree))
				.collect(Collectors.toList());
	}

	// Recuperer une promotion à partir de siglePromotion
	public Promotion recupererPromotionParSigle(String siglePromotion) {
		List<Promotion> listeDesPromotion = promotionrepository.findAll();
		return listeDesPromotion.stream().filter(t -> t.getSiglePromotion().equals(siglePromotion)).findFirst().get();
	}

	// Supprimer toutes les promotions
	public void supprimerPromotions() {
		promotionrepository.deleteAll();
	}

	// Ajouter une promotion
	public void creerPromotion(Promotion promotion) {
		promotionrepository.save(promotion);
	}

	// Recuperer les promotions à partir de l'ID composé de formation et
	// anneeUniversitaire
	public Optional<Promotion> recupererPromotionParId(String formation, String anneeUniversitaire) {

		return promotionrepository.findById(new PromotionPK(anneeUniversitaire, formation));
	}

	// Delete les promotions à partir de l'ID composé de formation et
	// anneeUniversitaire
	public void supprimerPromotion(String formation, String anneeUniversitaire) {
		PromotionPK promotionpk = new PromotionPK();
		promotionpk.setAnneeUniversitaire(anneeUniversitaire);
		promotionpk.setFormation(formation);
		promotionrepository.deleteById(promotionpk);
	}

}
