package in.nit.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
@Data
@DiscriminatorValue("stutab")
public class TPC_Employee extends TPC_Person {
	@Column(name="esal")
	private Double empSal;
	@Column(name="edept")
	private String empDept;
}
