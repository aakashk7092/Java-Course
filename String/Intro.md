# Introduction to String in Java

## Overview
In Java, **String** is one of the most important and widely used classes.  
It represents a sequence of characters and is used to store and manipulate text.

Java provides the `String` class inside the **java.lang** package, which is automatically imported in every Java program.

---

## What is a String?
A **String** in Java is an **immutable object** that represents a sequence of characters.

- Once created, its value **cannot be changed**
- Stored as an object, not a primitive type
- Used for text processing, input/output, file handling, etc.

---

## Why String is Important?
- Used in almost every Java application
- Essential for user input and output
- Plays a key role in APIs, file handling, and networking
- Frequently asked topic in interviews

---

## Creating a String in Java

### 1. Using String Literal
```java
String name = "Java";
Stored in String Constant Pool

Memory efficient

Recommended way

2. Using new Keyword
java
Copy code
String name = new String("Java");
Stored in heap memory

Creates a new object every time

String Memory Representation
String Constant Pool
Special memory area inside heap

Stores unique string literals

Improves memory efficiency

Diagram:

Immutability of String
Once a String object is created, it cannot be modified.

Example:

java
Copy code
String s = "Java";
s = s.concat(" Language");
A new object is created

Old object remains unchanged

Diagram:

Common String Methods
Method	Description
length()	Returns string length
charAt()	Returns character at index
substring()	Extracts part of string
toUpperCase()	Converts to uppercase
toLowerCase()	Converts to lowercase
equals()	Compares content
compareTo()	Lexicographical comparison

String vs StringBuilder vs StringBuffer
Feature	String	StringBuilder	StringBuffer
Mutability	Immutable	Mutable	Mutable
Thread Safe	Yes	No	Yes
Performance	Slow	Fast	Medium

When to Use String?
When data should not change

When security and thread safety are important

When working with constant text values

Key Points to Remember
String is immutable

Stored in String Constant Pool

Use equals() instead of ==

Prefer StringBuilder for frequent modifications

Conclusion
Understanding String in Java is essential for mastering Java fundamentals.
It improves memory usage, code safety, and performance when used correctly.

Author
Aakash Kumar
B.Tech Student | Java & DSA Learner

License
This project is open-source and free to use for learning purposes.

yaml
Copy code

---

### How to use images correctly in GitHub
1. Create a folder named **`images`**
2. Upload your diagrams inside it
3. Use the same names as written:
   - `string_constant_pool.png`
   - `string_immutability.png`

---

If you want, I can also:
- Create **custom diagrams (PNG)** for String
- Optimize this for **interview notes**
- Convert this into **PDF / notes style**
- Add **comparison visuals**

Just tell me.






You said:
add in readme file careted images


ChatGPT said:
Below is the updated README.md with created images properly added and explained.
You can directly copy–paste this into GitHub.
(Images are assumed to be already created by you and placed inside an images/ folder.)

md
Copy code
# Introduction to String in Java

## Overview
In Java, **String** is one of the most important and frequently used classes.  
It represents a sequence of characters and is widely used for text handling.

The `String` class is present in the **java.lang** package, which is automatically imported in every Java program.

---

## What is a String?
A **String** in Java is an **immutable object** that stores a sequence of characters.

### Key Characteristics
- String is an **object**, not a primitive
- Once created, it **cannot be changed**
- Stored efficiently using **String Constant Pool**

---

## Why String is Important?
- Used in almost every Java application
- Required for user input and output
- Plays a major role in APIs, file handling, and databases
- Very important for interviews and exams

---

## Creating a String in Java

### 1. Using String Literal
```java
String language = "Java";
Stored in String Constant Pool

Memory efficient

Recommended approach

Diagram:

2. Using new Keyword
java
Copy code
String language = new String("Java");
Stored in heap memory

Creates a new object every time

Diagram:

# String Constant Pool (SCP)
*The String Constant Pool is a special memory area inside the heap that stores unique string literals.*

Advantages
Saves memory

Improves performance

Avoids duplicate objects


*Immutability of String*
Once a String object is created, its value cannot be modified.

Example:
java
Copy code
String s = "Java";
s = s.concat(" Language");
A new object is created

Original string remains unchanged

Comparison: == vs equals()
Operator	Checks
==	Reference (memory location)
equals()	Content (actual value)


# Commonly Used String Methods
Method	      Purpose
length()	  Returns length of string
charAt()	  Returns character at index
substring()	  Extracts part of string
toUpperCase() Converts to uppercase
toLowerCase() Converts to lowercase
equals()	  Compares content
compareTo()	  Lexicographical comparison


# When to Use String?
*When value should not change*

*When thread safety is required*

*When working with constant data*

*Key Points to Remember*
*String is immutable*

*Stored in String Constant Pool*

*Use equals() instead of ==*

*Use StringBuilder for frequent modifications*

# Conclusion
Understanding String in Java is essential for building strong Java fundamentals.
Correct usage improves performance, memory efficiency, and code safety.