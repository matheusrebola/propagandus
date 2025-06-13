package propagandus.persistenceservice.core.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;
import propagandus.persistenceservice.core.models.enums.ELocal;
import propagandus.persistenceservice.core.models.enums.EZona;

import java.util.Objects;
import java.util.Set;

@Entity(name = "local_tb")
@Getter
@Setter
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class Local {
  @Id @GeneratedValue(strategy = GenerationType.UUID)
  private String id;
  @Column(length = 10) @Enumerated(EnumType.STRING)
  private EZona zona;
  @Column(length = 10) @Enumerated(EnumType.STRING)
  private ELocal local;
  @Column
  private String detalhes;
  @Column(length = 20)
  private String latitude;
  @Column(length = 20)
  private String longitude;
  @OneToMany(mappedBy="local")
  private Set<Reconhecimento> reconhecimentos;

  @Override
  public final boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
    Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
    if (thisEffectiveClass != oEffectiveClass) return false;
    Local local = (Local) o;
    return getId() != null && Objects.equals(getId(), local.getId());
  }

  @Override
  public final int hashCode() {
    return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
  }
}
