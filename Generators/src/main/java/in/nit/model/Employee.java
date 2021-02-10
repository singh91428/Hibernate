package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="emptab1")
public class Employee {
	
	@Id
	@Column(name="eid")
	@GeneratedValue(generator = "empgen")
	@GenericGenerator(name = "empgen", strategy = "increment")
	private Integer empId;
	
	
	@Column(name="ename",length=15)
	private String empName;
	@Column(name="esal")
	private Double empSal;
	@Column(name="dept",length=15)
	private String deptName;
}

