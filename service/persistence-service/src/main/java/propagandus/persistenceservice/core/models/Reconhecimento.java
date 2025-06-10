package propagandus.persistenceservice.core.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;
import propagandus.persistenceservice.core.models.enums.EAtencao;
import propagandus.persistenceservice.core.models.enums.EIdade;
import propagandus.persistenceservice.core.models.enums.ESexo;

import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class Reconhecimento {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column @Temporal(TemporalType.DATE)
  private String data;
  @ManyToOne
  @JoinColumn(name="local_id", nullable=false)
  private Local local;
  @Column(length = 1) @Enumerated(EnumType.STRING)
  private ESexo sexo;
  @Column(length = 10) @Enumerated(EnumType.STRING)
  private EIdade idade;
  @Column(length = 10) @Enumerated(EnumType.STRING)
  private EAtencao atencao;

  @Override
  public final boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
    Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
    if (thisEffectiveClass != oEffectiveClass) return false;
    Reconhecimento that = (Reconhecimento) o;
    return getId() != null && Objects.equals(getId(), that.getId());
  }

  @Override
  public final int hashCode() {
    return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
  }
}
