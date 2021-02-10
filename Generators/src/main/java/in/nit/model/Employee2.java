package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="empsequence")
public class Employee2 {
	@Id
	@Column(name="id",length=20)
	@GeneratedValue(generator="abc")
	@GenericGenerator(name="abc",strategy = "sequence")
	private String empId;
	private String name;
	private Double sal;

}
