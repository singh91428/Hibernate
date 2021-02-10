package in.nit.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employeeitpcc")
@PrimaryKeyJoinColumn(name="eid")
/*
 * @AttributeOverrides({
 * 
 * @AttributeOverride(name="pid",column=@Column(name="eid")),
 * 
 * @AttributeOverride(name="pname",column=@Column(name="ename")) })
 */
public class TPCC_Employee extends TPCC_Person{
	@Column(name="esal")
	private Double empSal;
	@Column(name="edept")
	private String empDept;
}
