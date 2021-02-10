package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="personitpsc")
@Inheritance(strategy=InheritanceType.JOINED)
public class TPSC_Person {
	@Id
	@Column(name="pid")
	private Integer perId;
	@Column(name="pname")
	private String perName;
}
