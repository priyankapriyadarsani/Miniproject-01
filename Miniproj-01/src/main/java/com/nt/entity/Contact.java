package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="CONTACT_DETAILS")
public class Contact {
	@Id
	@GeneratedValue
	private Integer contactid;
	private String contactName;
	private String contactEmail;
	private Long contactNum;

}
