package com.example.demo.dto;

import java.time.LocalDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

public class LocalWheaterDTO {

	private String cityName;

	private String country;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private LocalDateTime localDateTime;

	private Double minimumTemperature;

	private Double maximumTemperature;

	public LocalWheaterDTO() {
	}

	public LocalWheaterDTO(String cityName, String country, LocalDateTime localDateTime, Double minimumTemperature,
			Double maximumTemperature) {
		super();
		this.cityName = cityName;
		this.country = country;
		this.localDateTime = localDateTime;
		this.minimumTemperature = minimumTemperature;
		this.maximumTemperature = maximumTemperature;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public Double getMinimumTemperature() {
		return minimumTemperature;
	}

	public void setMinimumTemperature(Double minimumTemperature) {
		this.minimumTemperature = minimumTemperature;
	}

	public Double getMaximumTemperature() {
		return maximumTemperature;
	}

	public void setMaximumTemperature(Double maximumTemperature) {
		this.maximumTemperature = maximumTemperature;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cityName, country, localDateTime, maximumTemperature, minimumTemperature);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocalWheaterDTO other = (LocalWheaterDTO) obj;
		return Objects.equals(cityName, other.cityName) && Objects.equals(country, other.country)
				&& Objects.equals(localDateTime, other.localDateTime)
				&& Objects.equals(maximumTemperature, other.maximumTemperature)
				&& Objects.equals(minimumTemperature, other.minimumTemperature);
	}

	@Override
	public String toString() {
		return "LocalWheaterDTO [cityName=" + cityName + ", country=" + country + ", localDateTime=" + localDateTime
				+ ", minimumTemperature=" + minimumTemperature + ", maximumTemperature=" + maximumTemperature + "]";
	}

}
