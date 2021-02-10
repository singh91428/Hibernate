package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employeeitpsc")
@PrimaryKeyJoinColumn(name="eid")
public class TPSC_Employee extends TPSC_Person{
	@Column(name="esal")
	private Double empSal;
	@Column(name="edept")
	private String empDept;
}
