package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="nativeQueryemp")
public class Employee {
	@Id
	@Column(name="id")
	private Integer empId;
	@Column(name="name")
	private String empName;
	@Column(name="sal")
	private Double empSal;
}
