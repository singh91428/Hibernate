package in.nit.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name="fetchproduct")
public class Product{
	@Id
	@Column(name="pid")
	private Integer prodId;
	@Column(name="pname")
	private String prodName;
	@Column(name="pcost")
	private Double prodCost;
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="pidfk")
	private Set<Module>mob=new HashSet<>();
}
