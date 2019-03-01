package ubo.sprint0.repository;





import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import ubo.sprint0.entities.Promotion;
import ubo.sprint0.entities.PromotionPK;

public interface PromotionRepository extends JpaRepository<Promotion, PromotionPK> {

	@Override
	Optional<Promotion> findById(PromotionPK promotionPK);

	
	




	//@Query("select p from Promotion p where p.formation like : M2DOSI")
	//Promotion findByPromotionId(PromotionPK promotionId);



}
