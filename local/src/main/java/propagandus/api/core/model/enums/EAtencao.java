package propagandus.api.core.model.enums;

public enum EAtencao {
  SEM_INTERESSE,         // A pessoa claramente não está interessada ou não está prestando atenção
  OLHADA_RAPIDA,         // A pessoa deu uma olhada rápida, sem foco prolongado
  DISTRAIDA,             // A pessoa está olhando, mas não está focada (distraída com outra coisa)
  ATENCAO_PASSIVA,       // A pessoa está observando, mas sem interação emocional visível
  CURIOSIDADE,           // A pessoa parece estar curiosa, demonstrando interesse crescente
  INTERESSE,             // A pessoa está prestando atenção de maneira clara e constante
  ATENCAO_PROLONGADA,    // A pessoa está observando por um tempo considerável, mostrando um foco maior
  ENGAGEMENT_TOTAL       // A pessoa está totalmente envolvida e focada na propaganda, possivelmente reagindo emocionalmente ou fisicamente
}
