package in.nit.model;
import lombok.Data;
import lombok.NonNull;

/*@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode*/
@Data
public class Student {
	@NonNull
	private int stdId;
	private String stdName;
	public static void main(String[] args) {
		Student sobj=new Student(5);
		//sobj.setStdId(1);
		sobj.setStdName("chandu");
		System.out.println(sobj.getStdId());
		System.out.println(sobj.getStdName());
		System.out.println(sobj.hashCode());
		System.out.println(sobj.getClass());
	}
}
