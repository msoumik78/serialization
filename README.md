# Serialization
This project gives a simple overview of the following ways of serialization and de-serialization in Java :
* Using Java's out-of-the-box serialization technique 
* Using Avro serialization technique

Please also refer to my blog here [Soumik's blog on Java's default serialization](https://msoumik78.github.io/java/2017/10/12/java-serialization.html) and also this one : [Soumik's blog on Java's alternate serialization] (https://msoumik78.github.io/java/2019/01/30/Alternatives-to-Java-default-serialization.html)


### Dependencies

* Java 8 should be installed and available in the system. JAVA_HOME environment variable should be set and pointing to the location of Java 8.
* Maven should be installed in the system and set in PATH.

### Compiling

 `mvn clean compile `

### Running program

The below command runs the program which demonstrates java's default serialization technicque:                 
`mvn exec:java -Dexec.mainClass="serialization.SerializeAndDeSerializeUsingJavaDefault" `


The below command runs the program which demonstrates avro based serialization technicque:                 
`mvn exec:java -Dexec.mainClass="serialization.SerializeAndDeserializeUsingAvro" `

