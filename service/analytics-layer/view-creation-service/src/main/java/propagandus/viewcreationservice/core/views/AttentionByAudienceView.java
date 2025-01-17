package propagandus.viewcreationservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import propagandus.viewcreationservice.core.dtos.AttentionByAudienceDTO;

public interface AttentionByAudienceView {
  @Query(value = """
   SELECT 
    a.attention_level,
    a.people_sex,
    SUM(a.look_count) AS total_looks,
    SUM(a.people_count) AS total_people,
    d.day_week,
    d.period_of_the_day,
    d.month,
    d.year
   FROM 
    attention_table a
   JOIN 
    date_time_table d ON a.attention_time_id = d.period_register_id
   GROUP BY 
    a.attention_level, a.people_sex, d.day_week, d.period_of_the_day, d.month, d.year
    """, nativeQuery = true)
  List<AttentionByAudienceDTO> attentionByAudience();

}
