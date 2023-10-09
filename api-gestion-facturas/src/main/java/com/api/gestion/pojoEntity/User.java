package com.api.gestion.pojoEntity;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Data;
@NamedQuery(name = "findByEmail",query = "selec u from User where u.email=email")

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "users")
public class User{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer	id;
	@Column(name = "names")
	private String name;
	@Column(name = "contacNumber")
	private String contactNumber;
	@Column(name = "emails")
	private String email; 
	@Column(name = "passwords")
	private String password;
	@Column(name = "status")
	private String status;
	@Column(name = "roles")
	private String role;
}
