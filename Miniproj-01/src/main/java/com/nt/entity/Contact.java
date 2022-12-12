package com.nt.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
