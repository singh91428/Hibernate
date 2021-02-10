package in.nit.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class StudentMTM {
	@Id
	private Integer sid;
	private String sname;
	private String smail;
	@ManyToMany
	@JoinTable(name="stdcrstab",joinColumns=@JoinColumn(name="sidfk"),
	inverseJoinColumns=@JoinColumn(name="cidfk"))
	private List<CourseMTM> cobj;
}
