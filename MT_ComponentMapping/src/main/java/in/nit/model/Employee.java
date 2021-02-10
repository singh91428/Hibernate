package in.nit.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="empcm")
public class Employee {
	@Id
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="hno",column=@Column(name="ehno")),
		@AttributeOverride(name="loc",column=@Column(name="eloc"))
	})
	private Address aobj;
}
