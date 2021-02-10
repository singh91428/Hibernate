package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@DynamicInsert
@Table(name="dynamicinsert")
public class DynamicInsert {
	@Id
	@Column(name="pid")
	private Integer perId;
	@Column(name="pname")
	private String perName;
	@Column(name="psal")
	private Double perSal;
	@Column(name="ploc")
	private String perLoc;
}
