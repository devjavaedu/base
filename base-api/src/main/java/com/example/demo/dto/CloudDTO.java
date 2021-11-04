package com.example.demo.dto;

import java.util.Objects;

public class CloudDTO {

	private Long all;

	public CloudDTO() {
	}

	public CloudDTO(Long all) {
		super();
		this.all = all;
	}

	public Long getAll() {
		return all;
	}

	public void setAll(Long all) {
		this.all = all;
	}

	@Override
	public int hashCode() {
		return Objects.hash(all);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CloudDTO other = (CloudDTO) obj;
		return Objects.equals(all, other.all);
	}

	@Override
	public String toString() {
		return "Clouds [all=" + all + "]";
	}

}
