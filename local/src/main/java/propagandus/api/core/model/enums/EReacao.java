package propagandus.api.core.model.enums;

public enum EReacao {
  NEUTRO,         // Reação neutra
  FELIZ,          // Positivo, demonstra felicidade
  SORRISO_LEVE,   // Positivo, sorriso leve
  SORRISO_LARGO,  // Positivo, sorriso largo
  INTERESSE,      // Positivo, demonstra interesse
  ENTUSIASMO,     // Positivo, alto envolvimento
    
  TRISTE,         // Negativo, tristeza
  DESINTERESSE,   // Negativo, sem interesse
  FRUSTACAO,      // Negativo, demonstra frustração
  CONFUSO,        // Negativo, demonstra confusão
  ENTEDIADO,      // Negativo, tédio
  RAIVA,          // Negativo, demonstra raiva

  SURPRESO,       // Reação de surpresa
  CHOCADO,        // Reação de grande choque
  INDECISO,       // Incerto, não sabe como reagir
  DISTRAIDO       // Distração, não focado no conteúdo
}
