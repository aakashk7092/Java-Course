
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
String language = "Java";
Stored in String Constant Pool

Memory efficient

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
Method	        Purpose
--------------------------------------
length()	    |  Returns length of string
-----------------------------------------
charAt()	    |  Returns character at index
-----------------------------------------
substring()	  |  Extracts part of string
-----------------------------------------
toUpperCase() |  Converts to uppercase
-----------------------------------------
toLowerCase() |  Converts to lowercase
-----------------------------------------
equals()	    |  Compares content
-----------------------------------------
compareTo()	  |  Lexicographical comparison
-----------------------------------------



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
