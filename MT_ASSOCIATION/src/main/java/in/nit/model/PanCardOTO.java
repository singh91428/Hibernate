package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="pancardoto")
public class PanCardOTO {
	@Id
	@Column(name="pid")
	private Integer panId;
	@Column(name="pnum")
	private String panNum;
	@Column(name="pname")
	private String panName;
}
