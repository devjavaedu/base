package com.example.demo.dto;

import java.util.Objects;

public class CityDTO {

	private Long id;
	private String name;
	private CoordinatesDTO coord;
	private String country;
	private Long population;
	private Long timezone;
	private Long sunrise;
	private Long sunset;

	public CityDTO() {
	}

	public CityDTO(Long id, String name, CoordinatesDTO coord, String country, Long population, Long timezone,
			Long sunrise, Long sunset) {
		super();
		this.id = id;
		this.name = name;
		this.coord = coord;
		this.country = country;
		this.population = population;
		this.timezone = timezone;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CoordinatesDTO getCoord() {
		return coord;
	}

	public void setCoord(CoordinatesDTO coord) {
		this.coord = coord;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public Long getTimezone() {
		return timezone;
	}

	public void setTimezone(Long timezone) {
		this.timezone = timezone;
	}

	public Long getSunrise() {
		return sunrise;
	}

	public void setSunrise(Long sunrise) {
		this.sunrise = sunrise;
	}

	public Long getSunset() {
		return sunset;
	}

	public void setSunset(Long sunset) {
		this.sunset = sunset;
	}

	@Override
	public int hashCode() {
		return Objects.hash(coord, country, id, name, population, sunrise, sunset, timezone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CityDTO other = (CityDTO) obj;
		return Objects.equals(coord, other.coord) && Objects.equals(country, other.country)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(population, other.population) && Objects.equals(sunrise, other.sunrise)
				&& Objects.equals(sunset, other.sunset) && Objects.equals(timezone, other.timezone);
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", coord=" + coord + ", country=" + country + ", population="
				+ population + ", timezone=" + timezone + ", sunrise=" + sunrise + ", sunset=" + sunset + "]";
	}

}