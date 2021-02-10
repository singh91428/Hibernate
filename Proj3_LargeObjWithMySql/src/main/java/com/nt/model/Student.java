package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="student1lob")
public class Student {
	@Id
	@Column(length=10)
	private int sid;
	@Column(length=20)
	private String sname;
	@Lob
	private byte[] stdimg;
}
