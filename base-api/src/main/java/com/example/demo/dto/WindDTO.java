package com.example.demo.dto;

import java.util.Objects;

public class WindDTO {

	private Double speed;
	private Long deg;
	private Double gust;

	public WindDTO() {
	}

	public WindDTO(Double speed, Long deg, Double gust) {
		super();
		this.speed = speed;
		this.deg = deg;
		this.gust = gust;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Long getDeg() {
		return deg;
	}

	public void setDeg(Long deg) {
		this.deg = deg;
	}

	public Double getGust() {
		return gust;
	}

	public void setGust(Double gust) {
		this.gust = gust;
	}

	@Override
	public int hashCode() {
		return Objects.hash(deg, gust, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WindDTO other = (WindDTO) obj;
		return Objects.equals(deg, other.deg) && Objects.equals(gust, other.gust) && Objects.equals(speed, other.speed);
	}

	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", deg=" + deg + ", gust=" + gust + "]";
	}

}