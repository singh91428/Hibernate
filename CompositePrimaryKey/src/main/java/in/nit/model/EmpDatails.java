package in.nit.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="empcpk")
public class EmpDatails {
	@EmbeddedId
	private CompositeKey cpk;
	@Column(name="name",length=20)
	private String empName;
	@Column(name="sal")
	private Double empSal;
}
