package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="emptab")
public class Employee {
	@Id
	@Column(name="id")
	private Integer empId;
	@Column(name="name",length=12)
	private String empName;
	@Column(name="sal")
	private Double empSal;
	@Column(name="dept",length=12)
	private String dept;
}
