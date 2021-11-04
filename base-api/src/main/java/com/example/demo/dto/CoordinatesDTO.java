package com.example.demo.dto;

import java.util.Objects;

public class CoordinatesDTO {

	private Long lat;
	private Long lon;

	public CoordinatesDTO() {
	}

	public CoordinatesDTO(Long lat, Long lon) {
		super();
		this.lat = lat;
		this.lon = lon;
	}

	public Long getLat() {
		return lat;
	}

	public void setLat(Long lat) {
		this.lat = lat;
	}

	public Long getLon() {
		return lon;
	}

	public void setLon(Long lon) {
		this.lon = lon;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lat, lon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CoordinatesDTO other = (CoordinatesDTO) obj;
		return Objects.equals(lat, other.lat) && Objects.equals(lon, other.lon);
	}

	@Override
	public String toString() {
		return "Coordinates [lat=" + lat + ", lon=" + lon + "]";
	}

}