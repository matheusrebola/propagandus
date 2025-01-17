package propagandus.viewcreationservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import propagandus.viewcreationservice.core.dtos.CampaignEffectivenessDTO;

public interface CampaignEffectivenessView {
  @Query(value = """
    SELECT 
        a.advertising_id,
        a.advertising_name,
        r.reaction_type,
        r.reaction_scale,
        d.day_week,
        d.period_of_the_day,
        d.month,
        d.year
    FROM 
        advertising_table a
    JOIN 
        reaction_table r ON a.advertising_id = r.advertising_id
    JOIN 
        date_time_table d ON r.period_time_id = d.period_register_id
    """, nativeQuery = true)
  List<CampaignEffectivenessDTO> campaignEffectiveness();
}