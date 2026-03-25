# 1. 🏭 Factory Design Pattern (basic idea)

👉 Situation

You want something, like a burger.

❌ Normal way:

- You go into the kitchen and cook it yourself
- You must know everything (ingredients, steps)

✅ Factory way:

- You just say:

    >“Give me a burger”

- The kitchen (factory) makes it for you
-------------------------------------------

**🧠 In programming**

Instead of:

```java
Burger b = new CheeseBurger(); // ❌ you decide everything
```

You do:

```java
Burger b = BurgerFactory.getBurger("cheese"); // ✅ factory decides
```
👉 You don’t care how it’s made, only that you get it.
--------------------------------------------------------

**🔥 Simple Meaning**
>Factory Pattern = “Don’t create objects yourself. Ask someone else to create them.”

-------------------------------------------------------


# 2. 🍱 Abstract Factory Pattern (big boss level)

Now imagine you don’t want just a burger…

You want a full meal:
- Burger 🍔
- Drink 🥤
- Fries 🍟

And you want a type of meal:

🍔 Kids Meal:
- Small burger
- Juice
- Small fries

🍔 Adult Meal:
- Big burger
- Coke
- Large fries

------------------------------------------------------
**🧠 In code**

```java
MealFactory factory = new KidsMealFactory();

Burger b = factory.createBurger();
Drink d = factory.createDrink();
Fries f = factory.createFries();

```
👉 Everything matches the same family
-------------------------------------------------------

**🔥 Simple Meaning**
> Abstract Factory = “Create a group of related objects together”