package com.example.demo.dto;

import java.util.List;
import java.util.Objects;

public class OpenWheaterDTO {

	private String cod;
	private Long message;
	private Long cnt;
	private List<DataDTO> list;
	private CityDTO city;

	public OpenWheaterDTO() {
	}

	public OpenWheaterDTO(String cod, Long message, Long cnt, List<DataDTO> list, CityDTO city) {
		super();
		this.cod = cod;
		this.message = message;
		this.cnt = cnt;
		this.list = list;
		this.city = city;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public Long getMessage() {
		return message;
	}

	public void setMessage(Long message) {
		this.message = message;
	}

	public Long getCnt() {
		return cnt;
	}

	public void setCnt(Long cnt) {
		this.cnt = cnt;
	}

	public List<DataDTO> getList() {
		return list;
	}

	public void setList(List<DataDTO> list) {
		this.list = list;
	}

	public CityDTO getCity() {
		return city;
	}

	public void setCity(CityDTO city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, cnt, cod, list, message);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OpenWheaterDTO other = (OpenWheaterDTO) obj;
		return Objects.equals(city, other.city) && Objects.equals(cnt, other.cnt) && Objects.equals(cod, other.cod)
				&& Objects.equals(list, other.list) && Objects.equals(message, other.message);
	}

	@Override
	public String toString() {
		return "OpenWheater [cod=" + cod + ", message=" + message + ", cnt=" + cnt + ", list=" + list + ", city="
				+ city + "]";
	}

}