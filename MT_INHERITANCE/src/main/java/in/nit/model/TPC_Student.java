package in.nit.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
@Data
@DiscriminatorValue("stutab")
public class TPC_Student extends TPC_Person {
	@Column(name="sfee")
	private Double stuFee;
	@Column(name="sgrd")
	private String stuGrd;
}
