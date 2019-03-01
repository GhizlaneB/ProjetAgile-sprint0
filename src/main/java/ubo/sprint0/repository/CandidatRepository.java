package ubo.sprint0.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ubo.sprint0.entities.Candidat;

public interface CandidatRepository extends JpaRepository<Candidat, String> {
	
}
