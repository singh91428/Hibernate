package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="studentitpsc")
@PrimaryKeyJoinColumn(name="eid")
public class TPSC_Student extends TPSC_Person{
	@Column(name="efee")
	private Double stuFee;
	@Column(name="sgrd")
	private String stuGrd;
}
