package com.example.demo.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MainDTO {

	private Double temp;
	@JsonProperty("feels_like")
	private Double feelsLike;
	@JsonProperty("temp_min")
	private Double tempMin;
	@JsonProperty("temp_max")
	private Double tempMax;
	private Long pressure;
	@JsonProperty("sea_level")
	private Long seaLevel;
	@JsonProperty("grnd_level")
	private Long grndLevel;
	private Integer humidity;
	@JsonProperty("temp_kf")
	private Float tempKf;

	public MainDTO() {
	}

	public MainDTO(Double temp, Double feelsLike, Double tempMin, Double tempMax, Long pressure, Long seaLevel,
			Long grndLevel, Integer humidity, Float tempKf) {
		super();
		this.temp = temp;
		this.feelsLike = feelsLike;
		this.tempMin = tempMin;
		this.tempMax = tempMax;
		this.pressure = pressure;
		this.seaLevel = seaLevel;
		this.grndLevel = grndLevel;
		this.humidity = humidity;
		this.tempKf = tempKf;
	}

	public Double getTemp() {
		return temp;
	}

	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public Double getFeelsLike() {
		return feelsLike;
	}

	public void setFeelsLike(Double feelsLike) {
		this.feelsLike = feelsLike;
	}

	public Double getTempMin() {
		return tempMin;
	}

	public void setTempMin(Double tempMin) {
		this.tempMin = tempMin;
	}

	public Double getTempMax() {
		return tempMax;
	}

	public void setTempMax(Double tempMax) {
		this.tempMax = tempMax;
	}

	public Long getPressure() {
		return pressure;
	}

	public void setPressure(Long pressure) {
		this.pressure = pressure;
	}

	public Long getSeaLevel() {
		return seaLevel;
	}

	public void setSeaLevel(Long seaLevel) {
		this.seaLevel = seaLevel;
	}

	public Long getGrndLevel() {
		return grndLevel;
	}

	public void setGrndLevel(Long grndLevel) {
		this.grndLevel = grndLevel;
	}

	public Integer getHumidity() {
		return humidity;
	}

	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	public Float getTempKf() {
		return tempKf;
	}

	public void setTempKf(Float tempKf) {
		this.tempKf = tempKf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(feelsLike, grndLevel, humidity, pressure, seaLevel, temp, tempKf, tempMax, tempMin);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MainDTO other = (MainDTO) obj;
		return Objects.equals(feelsLike, other.feelsLike) && Objects.equals(grndLevel, other.grndLevel)
				&& Objects.equals(humidity, other.humidity) && Objects.equals(pressure, other.pressure)
				&& Objects.equals(seaLevel, other.seaLevel) && Objects.equals(temp, other.temp)
				&& Objects.equals(tempKf, other.tempKf) && Objects.equals(tempMax, other.tempMax)
				&& Objects.equals(tempMin, other.tempMin);
	}

	@Override
	public String toString() {
		return "Main [temp=" + temp + ", feelsLike=" + feelsLike + ", tempMin=" + tempMin + ", tempMax=" + tempMax
				+ ", pressure=" + pressure + ", seaLevel=" + seaLevel + ", grndLevel=" + grndLevel + ", humidity="
				+ humidity + ", tempKf=" + tempKf + "]";
	}

}