package in.nit.model;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

@Entity
@Table(name="comptab")
public class Company {
	@Id
	@Column(name="cid")
	private Integer comId;
	@Column(name="cname")
	private String comName;
	@Column(name="caddr")
	private String addr;
	@ElementCollection
	@CollectionTable(name="projtab",joinColumns=@JoinColumn(name="cid"))
	@MapKeyColumn(name="pojs")
	@Column(name="version")
	private Map<String,Double> proj;
	public Company() {
		super();
	}
	public Integer getComId() {
		return comId;
	}
	public void setComId(Integer comId) {
		this.comId = comId;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Map<String, Double> getProj() {
		return proj;
	}
	public void setProj(Map<String, Double> proj) {
		this.proj = proj;
	}
	@Override
	public String toString() {
		return "Company [comId=" + comId + ", comName=" + comName + ", addr=" + addr + ", proj=" + proj + "]";
	}
	
}
