package propagandus.viewcreationservice.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record AdvertisingSummary(
		@Id Long id,
		Long advertisngId,
		String advertisingName,
		String advertisingCompany,
		String advertisingProduct,
		Long totalReactions,
		Long totalAttentions
		) {

}
