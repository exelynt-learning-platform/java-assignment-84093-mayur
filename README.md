# Java Architecture and Explanation

## Module
**Java Editions & Platform Architecture**

## Assignment Title
**Java Architecture and Explanation**

## Objective

The objective of this assignment is to understand Java architecture and the roles of **JDK, JRE, and JVM**. It also explains how Java achieves platform independence through bytecode and the JVM.

## Java Architecture

The basic flow of Java execution is:

```text
Java Source Code
       ↓
     javac
       ↓
Java Bytecode (.class)
       ↓
      JVM
       ↓
Operating System & Hardware
```

### JDK — Java Development Kit

JDK is used by developers to create Java applications.

It provides tools required to:

- Write Java programs
- Compile Java programs
- Debug applications
- Run Java programs
- Generate documentation

The important tool `javac` converts Java source code (`.java`) into bytecode (`.class`).

### JRE — Java Runtime Environment

JRE provides the environment required to run Java applications.

It includes:

- JVM
- Java runtime libraries
- Other components required for running Java applications

JRE is mainly concerned with running Java programs rather than developing them.

### JVM — Java Virtual Machine

JVM is the engine that executes Java bytecode.

Its main responsibilities include:

- Loading Java class files
- Verifying bytecode
- Executing Java bytecode
- Providing a platform-specific runtime environment

Different operating systems have their own JVM implementations.

## Relationship Between JDK, JRE and JVM

```text
JDK
 └── JRE
      └── JVM
```

In simple terms:

- **JDK** → Develop Java programs
- **JRE** → Run Java programs
- **JVM** → Execute Java bytecode

## Platform Independence

Java achieves platform independence through **bytecode and the JVM**.

The process is:

1. The programmer writes Java source code in a `.java` file.
2. The Java compiler (`javac`) converts the source code into bytecode.
3. The bytecode is stored in a `.class` file.
4. The bytecode is not directly dependent on a particular operating system.
5. A suitable JVM on the target operating system executes the same bytecode.

Therefore, the same Java program can run on different operating systems such as:

- Windows
- Linux
- macOS

This concept is commonly described as:

**Write Once, Run Anywhere (WORA)**

## Files in This Assignment

| File | Description |
|---|---|
| `README.md` | Assignment explanation and documentation |
| `java_architecture.md` | Detailed explanation of JDK, JRE, JVM and platform independence |
| `Java_Architecture_Diagram.svg` | Java architecture diagram |
| `Java_Architecture_and_Explanation.pdf` | Final PDF submission |

## Conclusion

Java architecture separates development and execution. The **JDK** provides development tools, the **JRE** provides the runtime environment, and the **JVM** executes Java bytecode. The use of bytecode and JVM implementations allows Java applications to run across different platforms.