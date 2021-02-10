package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="fetchquete")
public class QueteMTO {
	@Id
	@Column(name="qid")
	private Integer queId;
	@Column(name="qamt")
	private Double queAmt;
	@Column(name="qcode")
	private String queCode;
}
