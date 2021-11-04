package com.example.demo.dto;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DataDTO {

	private Long dt;
	private MainDTO main;
	private List<WheaterDTO> wheater;
	private CloudDTO clouds;
	private WindDTO wind;
	private Long visibility;
	private Double pop;
	private SysDTO sys;
	@JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	@JsonProperty("dt_txt")
	private Date dtTxt;

	public DataDTO() {
	}

	public DataDTO(Long dt, MainDTO main, List<WheaterDTO> wheater, CloudDTO clouds, WindDTO wind, Long visibility, Double pop,
			SysDTO sys, Date dtTxt) {
		super();
		this.dt = dt;
		this.main = main;
		this.wheater = wheater;
		this.clouds = clouds;
		this.wind = wind;
		this.visibility = visibility;
		this.pop = pop;
		this.sys = sys;
		this.dtTxt = dtTxt;
	}

	public Long getDt() {
		return dt;
	}

	public void setDt(Long dt) {
		this.dt = dt;
	}

	public MainDTO getMain() {
		return main;
	}

	public void setMain(MainDTO main) {
		this.main = main;
	}

	public List<WheaterDTO> getWheater() {
		return wheater;
	}

	public void setWheater(List<WheaterDTO> wheater) {
		this.wheater = wheater;
	}

	public CloudDTO getClouds() {
		return clouds;
	}

	public void setClouds(CloudDTO clouds) {
		this.clouds = clouds;
	}

	public WindDTO getWind() {
		return wind;
	}

	public void setWind(WindDTO wind) {
		this.wind = wind;
	}

	public Long getVisibility() {
		return visibility;
	}

	public void setVisibility(Long visibility) {
		this.visibility = visibility;
	}

	public Double getPop() {
		return pop;
	}

	public void setPop(Double pop) {
		this.pop = pop;
	}

	public SysDTO getSys() {
		return sys;
	}

	public void setSys(SysDTO sys) {
		this.sys = sys;
	}

	public Date getDtTxt() {
		return dtTxt;
	}

	public void setDtTxt(Date dtTxt) {
		this.dtTxt = dtTxt;
	}

	@Override
	public int hashCode() {
		return Objects.hash(clouds, dt, dtTxt, main, pop, sys, visibility, wheater, wind);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataDTO other = (DataDTO) obj;
		return Objects.equals(clouds, other.clouds) && Objects.equals(dt, other.dt)
				&& Objects.equals(dtTxt, other.dtTxt) && Objects.equals(main, other.main)
				&& Objects.equals(pop, other.pop) && Objects.equals(sys, other.sys)
				&& Objects.equals(visibility, other.visibility) && Objects.equals(wheater, other.wheater)
				&& Objects.equals(wind, other.wind);
	}

	@Override
	public String toString() {
		return "Data [dt=" + dt + ", main=" + main + ", wheater=" + wheater + ", clouds=" + clouds + ", wind=" + wind
				+ ", visibility=" + visibility + ", pop=" + pop + ", sys=" + sys + ", dtTxt=" + dtTxt + "]";
	}

}
