# Java Programming

This is the repository for the course **Java Programming**.  
For more information and registration visit the website: https://hamburgcodingschool.com/en/courses/java/

## The Java programming language

- https://www.java.com/en/download/faq/whatis_java.xml

**Java** - Programming Language  
**JVM** - Java Virtual Machine  
**JRE** - Java Runtime Environment  
**JDK** - Java Development Kit

#### JVM
Provides the environment for Java.

#### JRE
Contains JVM and a set of libraries for code execution. The JRE is where Java code runs in.

#### JDK
Contains JRE and development tools. These tools contain e.g. debugger and compiler. This is needed for programming.

#### Compiler
Takes `*.java` files and compiles them into `*.class` files (byte code). This byte code is what JVM can understand.

#### Class Loader
Loads the byte code into memory. Part of JRE.

#### Bytecode Verifyer
Verifies if byte code is valid for execution.

#### Interpreter
Reads byte code stream and executes the program.

### Primitive Data Types

**`int`**  
**`boolean`**  
**`float`**  
**`double`**  
**`byte`**  
**`long`**  
**`short`**  
**`char`**  

- http://cs.fit.edu/~ryan/java/language/java-data.html
- Comparison to C/C++: http://softpixel.com/~cwright/programming/datatypes.java.php

### Logic in Java

- http://codingbat.com/doc/java-if-boolean-logic.html

### Java Code Style

- https://google.github.io/styleguide/javaguide.html

### Access Modifiers

**`public`**: can be accessed from any other class  
**`private`**: can only be accessed within the declared class itself  
**`protected`**: can be accessed within declared class and subclasses  
**(no modifier)**: *package-private*: can only be accessed withing the package of this class  

## Java Technologies

### Java Platforms

**Java SE** (Java Standard Edition): general purpose, for desktop applications or servers  
**Java EE** (Java Enterprise Edition): Java SE + APIs, for client-server enterprise applications  
**Java ME** (Java Micro Edition): libraries (profiles) for devices with limited resources, e.g. PDAs, printers  
**Java Card**: Applets for smart cards or small-memory devices

### Applications

**Swing**: graphical user interface library for Java SE  
**JavaFX**: platform for Java desktop applications, intended to replace Swing  
**Android Apps**: java applications running on the Android platform  

### Web Technologies

**Applet**: small Java application running on client-side in the web browser, typically for showing some graphics or animations   
**Servlet**: server-side components that use Java EE to respond to HTTP requests, typically deliver an HTML page  
**Java Server Pages** (JSP): server-side components, using Java EE to deliver content in HTML pages, embedded in HTML files like `<% ... %>`
**Spring**: a framework for Java applications, typically used for enterprise server applications, also e.g. REST services

## Database Connectors

**JDBC** (Java DataBase Connector): provides access to SQL databases
**Hibernate**: ORM (Object-Relational Mapping) maps relational databases to a Java object model

### File Extensions

**.jar**: library or executable file, used by Java SE  
**.exe**: for Windows, you can transform your executable .jar into an .exe file  
**.war**: library for server applications or web components
**.ear**: contains .war and .jar files, package for Java EE applications
**.apk**: android application