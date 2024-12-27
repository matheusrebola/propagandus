package propagandus.locationservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import propagandus.locationservice.core.dtos.LocationPerformanceDTO;

public interface LocationPerformanceView {
  @Query(value = """
   SELECT 
    l.location_id,
    l.street_name,
    l.street_number,
    l.location_type,
    l.city,
    l.city_zone,
    l.city_zone_type,
    COUNT(r.reaction_id) AS total_reactions,
    AVG(r.reaction_scale) AS avg_reaction_scale,
    COUNT(a.attention_id) AS total_attention
   FROM 
    location_table l
   LEFT JOIN 
    reaction_table r ON l.location_id = r.location_id
   LEFT JOIN 
    attention_table a ON l.location_id = a.location_id
   GROUP BY 
    l.location_id;
    """, nativeQuery = true)
  List<LocationPerformanceDTO> locationPerformance();

}
