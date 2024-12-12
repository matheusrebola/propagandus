package propagandus.painelservice.core.views;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Immutable
@Subselect("""
    SELECT 
        pt.package_type,
        COUNT(p.painel_id) AS total_painels
    FROM package_type_table pt
    LEFT JOIN painel_table p ON p.package_type_id = pt.package_type_id
    GROUP BY pt.package_type
""")
public record PainelsByPackageTypeView(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
    String packageType,
    Long totalPainels
) {}
