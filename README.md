# 📚 Bookazon: Refactoring for the Future

Welcome to **Bookazon**—where code smells get cleaned up and design principles shine!  
This project is a refactored online bookstore, built by our team, BitWise, for CS321, Fall 2025.  
We took a legacy codebase and transformed it into a maintainable, extensible, and SOLID-compliant system.

---

## 🚀 What Did We Do?

- **Identified and fixed code smells** (Primitive Obsession, Open/Closed violations, etc.)
- **Applied SOLID principles** to every corner of the codebase
- **Redesigned core classes** for clarity and extensibility
- **Added new features** (discounts, media types, improved order details)
- **Collaborated using GitHub** (issues, branches, PRs, reviews)
- **Documented everything**—from design decisions to coding style fixes

---

## 🏗️ How Does Bookazon Work?

### **Class Connections**

- **User**  
  The heart of Bookazon! Each user has a name, a cart, a list of orders, and two addresses (shipping & billing).  
  Users can checkout, view orders, and enjoy subscription-based discounts.

- **Cart**  
  The user's shopping basket. Holds `CartItem`s, and can be cleared after checkout.

- **CartItem**  
  Represents a book and its quantity in the cart.

- **Order**  
  Created when a user checks out. Stores purchased items, addresses, status, and calculates price with discounts.

- **Address**  
  No more scattered strings! All address info is bundled in this class, used by both `User` and `Order`.

- **SubscriptionType**   
  No more magic strings—just safe, extendable code.

---

### **How Classes Interact**

- **User** owns a **Cart** and a list of **Order**s.
- **User** has **Address** objects for shipping and billing.
- **User** can checkout, which creates an **Order** using the current **Cart** and user details.
- **Order** references the **User** for discount calculation and uses the **Cart** to get purchased items.
- **Cart** contains multiple **CartItem**s, each representing a book and its quantity.
- **Address** is used by both **User** and **Order** for storing address information.
- **SubscriptionType** is used by **User** to determine the discount rate for orders.

---

## 🧹 Code Smells We Cleaned Up

- **Primitive Obsession:**  
  All address fields are now encapsulated in the `Address` class.

- **Open/Closed Principle:**  
  Subscription types and discount logic are handled via enums and inheritance, making it easy to add new types without modifying existing code.

- **Single Responsibility Principle:**  
  Each class has a clear, focused responsibility.

- **Removed direct cart manipulation from User:**  
  Cart operations are now performed via the `Cart` object, not through `User`.

- **Centralized address and discount logic:**  
  Improved type safety and maintainability.

---

## ✨ New Features

---

## 🛠️ Team Practices

- **Issues tracked and managed via GitHub**
- **Feature branches and pull requests for all changes**
- **Code reviews for quality and consistency**
- **Main branch always in a working state**
- **Coding style enforced with CheckStyle**

---

## 📈 Extensions

- **Burndown chart** to track sprint progress
![alt text](<assets/Screenshot 2025-10-02 at 12.10.00 PM.png>)

Day 1 (Saturday): Team read instructions, gathered requirements, and created UML diagram. Work reduced slightly (50 → 45 points).
Day 2 (Sunday): Team divided coding tasks, but no major progress yet (45 → 40 points).
Day 3 (Monday): Main coding progress. Most logic completed, but still buggy (40 → 15 points).
Day 4 (Tuesday): Focused on README and documentation, no code progress (remains 15 points).
Day 5 (Wednesday): Final fixes, wrap-up, and submission. All work completed (15 → 0 points).


## 🎨 Why Is This README Different?

This README isn’t just a checklist—it’s a story of how we transformed Bookazon from a tangled mess into a showcase of good design.  
We didn’t just fix bugs; we built a foundation for future features, easier maintenance, and happier developers.

---

## 📖 Want to Learn More?

- **Check out the `/src` directory** for all the refactored classes.
- **See our Google Doc report** for a deeper dive into our process, results, and reflections.

**Bookazon: Where clean code meets great books!**