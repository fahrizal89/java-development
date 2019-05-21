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
```java
List list = new ArrayList();
list.add(10);
list.add(10.5);
for (Object obj : list) {
  System.out.println(obj);
}
```
- Variable Length Argument List
Can use multi parameters with same type
```java
exampleVariableLengthArgumentList("1");
exampleVariableLengthArgumentList("1","2");
exampleVariableLengthArgumentList("1","2","3");
```
```java
private void exampleVariableLengthArgumentList(String... parameters) {
  for (String str : parameters) {
    System.out.println("Paramters:-" + str);
  }
  System.out.println("");
}
```
- Static import
Import static class
```java
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
- Diamond Syntax
Before
```java
Map<String, List<Trade>> trades = new TreeMap<String, List<Trade>> ();
```
After
```java
Map<String, List<Trade>> trades = new TreeMap <> ();
```
- Strings in switch Statement
```java
String status = "b";

switch(status) {
case "a":
  System.out.println("a");
  break;
case "b":
  System.out.println("b");
  break;
default:
  break;
}
```
- Numeric literals with underscores
```java
int thousand =  1_000;
```
- Improved exception handling
```java
try{
      methodThatThrowsThreeExceptions();
} catch(ExceptionOne | ExceptionTwo | ExceptionThree e) {
      // log and deal with all Exceptions
}
```

Java 8

- Lambda Expressions
Before
```java
Runnable r = new Runnable(){
    @Override
    public void run() {
      System.out.println("My Runnable");
    }
 };
```
After
```java
Runnable r1 = () -> {
  System.out.println("My Runnable");
};
```
- Stream
```java
List<Integer> myList = new ArrayList<>();
for(int i=0; i<100; i++) myList.add(i);

//sequential stream
Stream<Integer> sequentialStream = myList.stream();

//parallel stream
Stream<Integer> parallelStream = myList.parallelStream();

//using lambda with Stream API, filter example
Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
//using lambda in forEach
highNums.forEach(p -> System.out.println("High Nums parallel="+p));

Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
```
Output:
```
High Nums parallel=93
High Nums parallel=91
High Nums parallel=92
High Nums parallel=94
High Nums parallel=95
High Nums parallel=96
High Nums parallel=97
High Nums parallel=98
High Nums parallel=99
High Nums sequential=91
High Nums sequential=92
High Nums sequential=93
High Nums sequential=94
High Nums sequential=95
High Nums sequential=96
High Nums sequential=97
High Nums sequential=98
High Nums sequential=99
```
