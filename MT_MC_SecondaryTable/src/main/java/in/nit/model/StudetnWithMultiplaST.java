package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="studentst")
@SecondaryTables({
	@SecondaryTable(name="crsdtlst"),
	@SecondaryTable(name="adddtlst",
	pkJoinColumns=@PrimaryKeyJoinColumn(name="did"))
})
public class StudetnWithMultiplaST {
	@Id
	@Column(name="sid")
	private Integer stuId;
	@Column(name="sname")
	private String stuName;
	@Column(name="sdept")
	private String stuDep;
	@Column(name="cname",table="crsdtlst")
	private String crsName;
	@Column(name="cfee",table="crsdtlst")
	private Double crsFee;
	@Column(name="sadd",table="adddtlst")
	private String addDetails;
	@Column(name="scloc",table="adddtlst")
	private String crrLocation;
}
