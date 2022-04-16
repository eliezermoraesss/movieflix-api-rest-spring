package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import com.devsuperior.movieflix.entities.Role;

public class RoleDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String authority;
	
	public RoleDTO() {
	}
	
	public RoleDTO(Role role) {
		this.id = role.getId();
		this.authority = role.getAuthority();
	}

	public RoleDTO(Long idLong, String authority) {
		this.id = idLong;
		this.authority = authority;
	}

	public Long getIdLong() {
		return id;
	}

	public void setIdLong(Long idLong) {
		this.id = idLong;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
}
