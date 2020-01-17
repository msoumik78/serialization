package serialization;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Person implements Serializable {
	private String name;
	private String designation;
	private int age;

}
