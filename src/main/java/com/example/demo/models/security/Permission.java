package com.example.demo.models.security;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="permissions")
public class Permission implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="permission_name")
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
        return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
