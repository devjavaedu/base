package com.example.demo.dto;

import java.util.Objects;

public class WheaterDTO {

	private Long id;
	private String main;
	private String description;
	private String icon;

	public WheaterDTO() {
	}

	public WheaterDTO(Long id, String main, String description, String icon) {
		super();
		this.id = id;
		this.main = main;
		this.description = description;
		this.icon = icon;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, icon, id, main);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WheaterDTO other = (WheaterDTO) obj;
		return Objects.equals(description, other.description) && Objects.equals(icon, other.icon)
				&& Objects.equals(id, other.id) && Objects.equals(main, other.main);
	}

	@Override
	public String toString() {
		return "Wheater [id=" + id + ", main=" + main + ", description=" + description + ", icon=" + icon + "]";
	}

}