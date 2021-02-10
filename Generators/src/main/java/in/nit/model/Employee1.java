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
@Table(name="empuuid")
public class Employee1 {
	@Id
	@Column(name="id",length=20)
	@GeneratedValue(generator="abc")
	@GenericGenerator(name="abc",strategy = "uuid")
	private String empId;
	private String name;
	private Double sal;

}
