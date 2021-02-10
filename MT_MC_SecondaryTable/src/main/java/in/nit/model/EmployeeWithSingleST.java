package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="empst")
@SecondaryTable(name="empstproject",
pkJoinColumns=@PrimaryKeyJoinColumn(name="eid"))
public class EmployeeWithSingleST {
	@Id
	@Column(name="eid")
	private int empId;
	@Column(name="ename")
	private String empName;
	@Column(name="esal")
	private double empSal;
	@Column(name="pname",table="empstproject")
	private String projName;
	@Column(name="ploc",table="empstproject")
	private String projLoc;
	public EmployeeWithSingleST() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	public String getProjLoc() {
		return projLoc;
	}
	public void setProjLoc(String projLoc) {
		this.projLoc = projLoc;
	}
	@Override
	public String toString() {
		return "EmployeeWithSingleST [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", projName="
				+ projName + ", projLoc=" + projLoc + "]";
	}
	
}
