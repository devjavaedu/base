package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "wheater")
public class Wheater {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "city_name")
	private String cityName;

	@Column(name = "country")
	private String country;

	@Column(name = "local_date_time")
	private LocalDateTime localDateTime;

	@Column(name = "min_temperature")
	private Double minimumTemperature;

	@Column(name = "max_temperature")
	private Double maximumTemperature;

	public Wheater() {
	}
	
	public Wheater(String cityName, String country, LocalDateTime localDateTime, Double minimumTemperature,
			Double maximumTemperature) {
		super();
		this.cityName = cityName;
		this.country = country;
		this.localDateTime = localDateTime;
		this.minimumTemperature = minimumTemperature;
		this.maximumTemperature = maximumTemperature;
	}


	public Wheater(Long id, String cityName, String country, LocalDateTime localDateTime, Double minimumTemperature,
			Double maximumTemperature) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.country = country;
		this.localDateTime = localDateTime;
		this.minimumTemperature = minimumTemperature;
		this.maximumTemperature = maximumTemperature;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return Objects.hash(cityName, country, id, localDateTime, maximumTemperature, minimumTemperature);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheater other = (Wheater) obj;
		return Objects.equals(cityName, other.cityName) && Objects.equals(country, other.country)
				&& Objects.equals(id, other.id) && Objects.equals(localDateTime, other.localDateTime)
				&& Objects.equals(maximumTemperature, other.maximumTemperature)
				&& Objects.equals(minimumTemperature, other.minimumTemperature);
	}

	@Override
	public String toString() {
		return "Wheater [id=" + id + ", cityName=" + cityName + ", country=" + country + ", localDateTime="
				+ localDateTime + ", minimumTemperature=" + minimumTemperature + ", maximumTemperature="
				+ maximumTemperature + "]";
	}

}