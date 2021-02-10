package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="modeltab")
public class Model {
	@Id
	@Column(name="mid")
	private Integer modId;
	@Column(name="mcolor")
	private String modColor;
	
}
