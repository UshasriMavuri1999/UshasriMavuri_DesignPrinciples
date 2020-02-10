# UshasriMavuri_DesignPrinciples


# Week-3
## Design Principles

 * Implement Calculator Application with Add, Divide, Multiply and Subtract Methods
 * Implement Layered Architecture
 * Implement SOLID, KISS, DRY, YAGNI principles
 
### Creating a Maven Project

```sh
mvn archetype:generate -DgroupId=com.mycompany.calculator -DartifactId=my-calculator -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```
### Build the Project

```sh
mvn package
mvn test
```
You may test the newly compiled and packaged JAR with the following command:

```sh
java -cp target/my-calculator-1.0-SNAPSHOT.jar com.mycompany.calculator.App
```

- I've obtained the result as:

![Result](s1.png)

![Result](s2.png)

![Result](s3.png)