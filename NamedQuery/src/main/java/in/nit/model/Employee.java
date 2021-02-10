package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import lombok.Data;

@NamedQueries({
	@NamedQuery(name="allemp",query="from in.nit.model.Employee"),
	@NamedQuery(name="requered",query="select empId,empName from in.nit.model.Employee where id=:a")
})
@Data
@Entity
@Table(name="namedQueryemp")
public class Employee {
	@Id
	@Column(name="id")
	private Integer empId;
	@Column(name="name")
	private String empName;
	@Column(name="sal")
	private Double empSal;
}
