package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="conmto")
public class ContractMTO {
	@Id
	@Column(name="cid")
	private Integer conId;
	@Column(name="ven")
	private String vendor;
	@Column(name="reg")
	private String regCode;
	@ManyToOne
	@JoinColumn(name="qidfk")
	private QueteMTO qob;
}
