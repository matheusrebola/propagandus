package propagandus.datalake.core.dtos;

import propagandus.datalake.core.models.enumerators.EAttentionLevel;
import propagandus.datalake.core.models.enumerators.ESEx;

public class AttentionCreateDto {
	private EAttentionLevel attentionLevel;
	private Byte attentionValue;
	private Short lookCount;
	private Short peopleCount;
	private ESEx sex;
	private Long periodId;
	private Long locationId;
	private Long advertisingId;
	private Long painelId;
	
	public AttentionCreateDto(
			EAttentionLevel attentionLevel,
			Byte attentionValue,
			Short lookCount,
			Short peopleCount,
			ESEx sex,
			Long attentionTimeId,
			Long locationId,
			Long advertisingId,
			Long painelId) {
		super();
		this.attentionLevel = attentionLevel;
		this.attentionValue = attentionValue;
		this.lookCount = lookCount;
		this.peopleCount = peopleCount;
		this.sex = sex;
		this.periodId = attentionTimeId;
		this.locationId = locationId;
		this.advertisingId = advertisingId;
		this.painelId = painelId;
	}

	public EAttentionLevel getAttentionLevel() {
		return attentionLevel;
	}

	public void setAttentionLevel(EAttentionLevel attentionLevel) {
		this.attentionLevel = attentionLevel;
	}

	public Byte getAttentionValue() {
		return attentionValue;
	}

	public void setAttentionValue(Byte attentionValue) {
		this.attentionValue = attentionValue;
	}

	public Short getLookCount() {
		return lookCount;
	}

	public void setLookCount(Short lookCount) {
		this.lookCount = lookCount;
	}

	public Short getPeopleCount() {
		return peopleCount;
	}

	public void setPeopleCount(Short peopleCount) {
		this.peopleCount = peopleCount;
	}

	public ESEx getSex() {
		return sex;
	}

	public void setSex(ESEx sex) {
		this.sex = sex;
	}

	public Long getPeriodId() {
		return periodId;
	}

	public void setPeriodId(Long periodId) {
		this.periodId = periodId;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public Long getAdvertisingId() {
		return advertisingId;
	}

	public void setAdvertisingId(Long advertisingId) {
		this.advertisingId = advertisingId;
	}

	public Long getPainelId() {
		return painelId;
	}

	public void setPainelId(Long painelId) {
		this.painelId = painelId;
	}
}
