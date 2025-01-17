package propagandus.viewcreationservice.core.dtos;

public record AdvertisingSummaryDTO(
		Long advertisngId,
		String advertisingName,
		String advertisingCompany,
		String advertisingProduct,
		Long totalReactions,
		Long totalAttentions
		) {
}
