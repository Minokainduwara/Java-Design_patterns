# 1️⃣ Static in Java
Think of static like this:

>One thing shared by everyone

**🎒 Example (real life)**

Imagine a classroom:
* Every student has their own bag → normal (non-static)
* But there is one whiteboard for the whole class  static

👉 Everyone uses the same whiteboard

**❌ Without static (each object has its own copy)**
```java
class Student {
    int marks = 0;
}
```

```java
Student s1 = new Student();
Student s2 = new Student();

s1.marks = 10;
s2.marks = 20;
```
👉 Each student has their own marks

**✅ With static (shared)**
```java
class Student {
    static int count = 0;

    Student() {
        count++;
    }
}
```
```java
Student s1 = new Student();
Student s2 = new Student();

System.out.println(Student.count); // 2
```
👉 Both objects share one variable

# 1️⃣ Eager Singleton

>The object is created immediately when the class loads
>(not when you need it)