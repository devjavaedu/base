package com.example.demo.dto;

import java.util.Objects;

public class SysDTO {

	private String pod;

	public SysDTO() {
	}

	public SysDTO(String pod) {
		super();
		this.pod = pod;
	}

	public String getPod() {
		return pod;
	}

	public void setPod(String pod) {
		this.pod = pod;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SysDTO other = (SysDTO) obj;
		return Objects.equals(pod, other.pod);
	}

	@Override
	public String toString() {
		return "Sys [pod=" + pod + "]";
	}

}
