package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="fetchmodule")
public class Module {
	@Id
	@Column(name="mid")
	private Integer modId;
	@Column(name="mname")
	private String modName;
	@Column(name="mtype")
	private String modType;
	
}
