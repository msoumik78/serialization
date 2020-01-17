package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeAndDeSerializeUsingJavaDefault {


	public static void main(String[] args) {

		
		String filename = "person.ser";
		Person p = new Person();
		p.setName("Soumik");
		p.setDesignation("Senior Architect");
		p.setAge(40);
        

		// Serialize and save the object to file
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
		    fos = new FileOutputStream(filename);
		    out = new ObjectOutputStream(fos);
		    out.writeObject(p);

		    out.close();
		} catch (Exception ex) {
		    ex.printStackTrace();
		}
		
		// Now let's De-Serialize and re-create the object back in memory
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
		    fis = new FileInputStream(filename);
		    in = new ObjectInputStream(fis);
		    p = (Person) in.readObject();
		    in.close();
		} catch (Exception ex) {
		    ex.printStackTrace();
		}
		System.out.println(p);		

		}

}
