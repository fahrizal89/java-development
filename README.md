# java-development

Java 5


- Enhanced for Loop
Simpler. Don't need define start to end
```java
String[] counts = { "one", "two", "three" };
for (String str : counts) {
  System.out.println(str);
}
```
- Autoboxing/Unboxing

Can put primitive type values into collections
```
List list = new ArrayList();
list.add(10);
list.add(10.5);
for (Object obj : list) {
  System.out.println(obj);
}
```
- Variable Length Argument List
```
exampleVariableLengthArgumentList("1");
exampleVariableLengthArgumentList("1","2");
exampleVariableLengthArgumentList("1","2","3");
```
```
private void exampleVariableLengthArgumentList(String... parameters) {
  for (String str : parameters) {
    System.out.println("Paramters:-" + str);
  }
  System.out.println("");
}
```
- Static import
```
import static java.lang.Math.abs;

private void exampleStaticImport() {
  System.out.println(abs(-100));
}
```



Java 6

- Scripting Language Support
- JDBC 4.0 API
- Java Compiler API
- Pluggable Annotations
- Native PKI, Java GSS, Kerberos and LDAP support
- Integrated Web Services

Java 7

- Strings in switch Statement
- Type Inference for Generic Instance Creation
- Multiple Exception Handling
- Support for Dynamic Languages
- Try with Resources
- Java nio Package
- Binary Literals, underscore in literals
- Diamond Syntax
- Automatic null Handling

Java 8

- Lambda Expressions
- Pipelines and Streams
- Date and Time API
- Default Methods
- Type Annotations
- Nashhorn JavaScript Engine
- Concurrent Accumulators
- Parallel operations
- PermGen Error Removed
- TLS SNI

Java 9

- Improved Javadoc
- Factory methods for collections(like List, Map, Set and Map.Entry)
- JShell: the interactive Java REPL
- Stream API Improvements
- Private methods in Interfaces
- Multi-Resolution Image API
- The Java(9) Platform module system
- Improvements in Process API
- HTTP/2 Client
- Miscellaneous Java 9 Features
