package in.nit.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class CompositeKey implements Serializable{
	private Integer empId;
	private Integer deptId;
}
