package in.nit.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="emptab")
public class SetCollection {
	@Id
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	@Column(name="esal")
	private Double empSal;
	@ElementCollection
	@CollectionTable(name="empptab",joinColumns=@JoinColumn(name="eid"))
	@Column(name="proj")
	Set<String> project;
	@Override
	public String toString() {
		return "SetCollection [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", project=" + project
				+ "]";
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	public Set<String> getProject() {
		return project;
	}
	public void setProject(Set<String> project) {
		this.project = project;
	}
	public SetCollection() {
		super();
	}
	
}
