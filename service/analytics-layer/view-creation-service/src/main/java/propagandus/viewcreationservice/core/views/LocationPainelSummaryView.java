package propagandus.viewcreationservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import propagandus.viewcreationservice.core.dtos.LocationPainelSummaryDTO;

public interface LocationPainelSummaryView {
	@Query(value = """
			SELECT
			    l.id AS location_id,
			    l.street_name AS street,
			    l.street_number AS street_number,
			    l.city AS city,
			    l.city_zone AS city_zone,
			    l.location_type AS location_type,
			    p.id AS painel_id,
			    p.identification AS painel_identification,
			    pt.package_type AS painel_package_type
			FROM location_table l
			LEFT JOIN painel_table p ON p.location_id = l.location_id
			LEFT JOIN package_type_table pt ON pt.package_type_id = p.package_type_id;
		""", nativeQuery = true)
	List<LocationPainelSummaryDTO> locationPainelSummary();
}
