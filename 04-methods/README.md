# 🛠️ Methods & Functions Debugging

## 📌 Overview
A curated collection of Java debugging exercises focusing on **Methods**, parameter passing, return types, and static vs. non-static contexts.

This directory serves as a practical log for identifying, analyzing, and fixing common method-related errors and syntax traps.

---

## 📁 Included Exercises

| # | Exercise Name | Primary Focus / Error Types | Status |
|---|---|---|---|
| **01** | `Lab5 - Methods Basics` | Return Types, Type Mismatches, Static Context, Syntax | ✅ Resolved |
| **02** | *[Next Exercise]* | *[Scope / Description]* | ⏳ Pending |

---

## 🔍 Exercise 01 Breakdown: `Lab5`

### 🛑 Identified Errors & Root Causes
1. **Return Type Mismatch**: Method defined as `void` but contained a `return` value.
2. **Argument Type Mismatch**: Arguments passed (`double`) did not match method signature (`int`).
3. **Static Context Violation**: Called a non-static method directly inside a `static` context (`main`).
4. **Missing Semicolon**: Statement missing terminating `;`.
5. **Unclosed Class**: Class body missing closing brace `}`.

### 💡 Key Takeaway
To invoke a non-static method inside `main`, either instantiate the class (`Lab5 obj = new Lab5();`) or modify the method signature with the `static` keyword.

---

## 🚀 How to Run Exercises

Navigate to this directory and compile/run any specific exercise:

```bash
# Example for Lab5
javac Lab5Fixed.java
java lab5
