# 🧩 Advanced Programming: Java Design Patterns

![Java](https://img.shields.io/badge/Java-JDK%208%2B-orange?style=flat-square&logo=java)
![License](https://img.shields.io/badge/License-MIT-blue?style=flat-square)
![Patterns](https://img.shields.io/badge/Patterns-5%2B-green?style=flat-square)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=flat-square)

A structured, hands-on reference for **Advanced Design Patterns in Java** — built for developers who want to master object-oriented design, clean architecture, and real-world problem solving.

---

## 📌 About

Design patterns are **proven, reusable solutions to recurring software design problems**. This repository provides:

- ✅ Clean, well-documented Java implementations
- ✅ Realistic, practical examples for each pattern
- ✅ Organized package structure under `com`
- ✅ Ready-to-run `Main` classes for immediate experimentation

Whether you're preparing for technical interviews, leveling up your architecture skills, or simply exploring OOP principles — this repo has you covered.

---

## 📂 Project Structure

```
DesignPatterns/
│── src/
│   └── com/
│       ├── singleton/        # Creational
│       ├── factory/          # Creational
│       ├── decorator/        # Structural
│       ├── observer/         # Behavioral
│       ├── strategy/         # Behavioral
│       ├── command/          # Behavioral
│       └── ...               # More patterns coming soon
│
└── README.md
```

Each package contains:
- Pattern implementation class(es)
- A `Main.java` entry point to run the example
- Inline comments explaining the design decisions

---

## 🏗️ Implemented Patterns

| Category | Pattern | Description |
|----------|---------|-------------|
| **Creational** | Singleton | Ensures a class has only one instance |
| **Structural** | Decorator | Adds behavior to objects dynamically |
| **Behavioral** | Observer | Notifies dependents of state changes |
| **Behavioral** | Strategy | Defines a family of interchangeable algorithms |
| **Behavioral** | Command | Encapsulates requests as objects |

> 🔄 More patterns will be added progressively as the repository grows.

---

## 🚀 Getting Started

### Prerequisites

- Java JDK 8 or higher
- Any Java-compatible IDE: **IntelliJ IDEA**, **Eclipse**, or **VS Code**

### Installation

1. **Clone the repository:**

```bash
git clone https://github.com/your-username/DesignPatterns.git
```

2. **Open the project** in your preferred IDE.

3. **Navigate to the pattern** you want to explore:

```
src/com/<pattern-name>/
```

4. **Run the `Main` class** to see the pattern in action.

---

## 💡 Example: Singleton Pattern

The Singleton pattern ensures only **one instance** of a class is created and provides a global access point to it.

```java
package com.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

```java
// Usage
Singleton s1 = Singleton.getInstance();
Singleton s2 = Singleton.getInstance();

System.out.println(s1 == s2); // true — same instance
```

> ⚠️ The above uses a basic (non-thread-safe) implementation. See the source for a thread-safe version using `synchronized` or double-checked locking.

---

## 🎯 Goals & Use Cases

- 📚 Learn and apply advanced design patterns in Java
- 🔨 Improve object-oriented design and architectural thinking
- 💼 Prepare for technical interviews and system design discussions
- 🏛️ Build scalable, maintainable, and extensible software

---

## 🤝 Contributing

Contributions are welcome! To add a new pattern or improve an existing one:

1. **Fork** the repository
2. **Create a branch** for your feature: `git checkout -b feature/pattern-name`
3. **Commit** your changes: `git commit -m "Add: <PatternName> pattern"`
4. **Push** to your fork: `git push origin feature/pattern-name`
5. **Open a Pull Request** for review

Please follow the existing package structure and include a `Main.java` with a working example.

---

## 📜 License

This project is open-source and available under the [MIT License](LICENSE).

---

## ⭐ Support

If you find this project helpful, consider giving it a ⭐ on GitHub — it helps others discover it too!