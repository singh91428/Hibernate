package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="stutab")
public class Student {
	@Id
	@Column(name="sid")
	private Integer stuId;
	@Column(name="sname")
	private String stuName;
	private String course;
	@Column(name="dept")
	private String stuDept;
	@Column(name="sfee")
	private Double stuFee;
}
