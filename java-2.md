# Java Architecture and Explanation

## 1. Role of JDK, JRE and JVM

### JDK – Java Development Kit
- JDK is used by developers to create Java applications.
- It contains tools required to write, compile, debug, and run Java programs.
- The important tool is `javac`, which converts Java source code (`.java`) into bytecode (`.class`).

### JRE – Java Runtime Environment
- JRE provides the environment required to run Java applications.
- It includes the JVM and required Java runtime libraries.
- It is mainly concerned with running Java programs rather than developing them.

### JVM – Java Virtual Machine
- JVM is the engine that executes Java bytecode.
- It loads and verifies `.class` files and executes the bytecode.
- Different operating systems have their own JVM implementations.

## 2. How Java Achieves Platform Independence

Java achieves platform independence through bytecode and the JVM.

1. The programmer writes Java source code in a `.java` file.
2. The Java compiler (`javac`) converts it into bytecode (`.class`).
3. Bytecode is not directly dependent on a particular operating system.
4. A suitable JVM on each operating system executes the same bytecode.
5. Therefore, the same Java program can run on Windows, Linux, macOS, etc.

### Flow

Java Source Code  
↓  
javac  
↓  
Java Bytecode (.class)  
↓  
JVM  
↓  
Operating System

This is commonly described as:

**Write Once, Run Anywhere (WORA)**