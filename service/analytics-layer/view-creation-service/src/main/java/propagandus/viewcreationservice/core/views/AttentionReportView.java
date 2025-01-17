package propagandus.viewcreationservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import propagandus.viewcreationservice.core.dtos.AttentionReportDTO;

public interface AttentionReportView {
	@Query(value = """
			SELECT
			    a.id AS attention_id,
			    p.identification AS painel_identification,
			    a.attention_level AS attention_level,
			    a.attention_value AS attention_value,
			    a.look_count AS look_count,
			    a.people_count AS people_count,
			    a.people_sex AS predominant_sex,
			    pr.day_ AS attention_period,
			    pr.day_week AS attention_day_week,
			    pr.hour_of_day AS attention_hour,
			    pr.minutes AS attention_minute,
			    pr.period_of_the_day AS attention_period
			FROM attention_table a
			INNER JOIN painel_table p ON a.painel_id = p.painel_id
			INNER JOIN date_time_table pr ON pr.period_register_id = a.attention_time_id;
		""", nativeQuery = true)
	List<AttentionReportDTO> attentionReport();
}
