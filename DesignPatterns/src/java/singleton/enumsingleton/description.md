# 1️⃣ What is an Enum in Java?

>enum is short for enumeration.

It’s a special type in Java that lets you define a fixed set of constants.

Instead of writing multiple constants with static final fields, you can use an enum.


```java
public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
```

# 2️⃣ Enum as Singleton

Enums can also be used to implement a singleton pattern. Why?

- Java guarantees that each enum constant is instantiated only once, no matter what.

- It’s automatically thread-safe, serialization-safe, and reflection-safe.



This Repo Contains a real world use case scenario of a logging system

>**Clone the repo and execute LoggerDemo.java**