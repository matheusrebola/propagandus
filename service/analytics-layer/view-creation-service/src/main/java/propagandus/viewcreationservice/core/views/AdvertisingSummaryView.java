package propagandus.viewcreationservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import propagandus.viewcreationservice.core.dtos.AdvertisingSummaryDTO;

public interface AdvertisingSummaryView {
	@Query(value = """
			SELECT
			    l.id AS location_id,
			    l.street_name AS street,
			    l.city AS city,
			    r.reaction_type AS reaction_type,
			    COUNT(r.id) AS total_reactions
			FROM location_table l
			LEFT JOIN reaction_table r ON r.location_id = l.location_id
			GROUP BY l.id, l.street_name, l.city, r.reaction_type;
		""", nativeQuery = true)
	List<AdvertisingSummaryDTO> advertisingSummary();
}
