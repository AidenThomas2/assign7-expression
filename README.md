## CSCE 20003 Data Structures Assignment 7: Stack Expression Evaluator


### 1. Assignment Overview

In this assignment, you will implement your own generic `Stack` data structure from scratch and use it to build an application that converts standard mathematical expressions from **Infix notation** to **Postfix order**, and then evaluates the result.

### Learning Objectives

- Implement a custom generic Abstract Data Type (ADT) using interfaces.
- Apply the **Last-In, First-Out (LIFO)** principle to solve algorithmic problems.
- Understand operator precedence and parenthesis matching.
- Parse and evaluate mathematical expressions using stacks.

---

### 2. Background: Infix to Postfix & Expression Evaluation

When humans write mathematical expressions, we naturally use **Infix notation**, where operators sit _between_ operands (e.g., `(3 + 5) * 2`). While intuitive for humans, computers find infix expressions complex to parse directly due to operator precedence rules and parentheses.

**Postfix Notation** (also known as _Reverse Polish Notation_ or RPN) places operators _after_ their operands (e.g., `3 5 + 2 *`). Postfix notation has two key advantages:

1. It eliminates the need for parentheses.
2. It processes operations strictly in the order they appear from left to right.

### How the Stack Helps in Conversion

During infix-to-postfix conversion, numbers go straight to the output, while operators wait on a stack until all higher-precedence operators have been processed. Parentheses act as markers that pause and resume operator resolution.

### How the Stack Helps in Evaluation

To evaluate a postfix expression, numbers are pushed onto a stack. When an operator is encountered, the top two numbers are popped, the operation is applied, and the result is pushed back onto the stack. When the expression ends, the top of the stack holds the final result.

---

### 3. Interfaces Required

You must implement the provided Java interfaces defined in your Eclipse project without modifying their method signatures. Do **NOT** use Java's built-in `java.util.Stack` or `java.util.Deque` or any other classes in the Java Collections Package.

---

#### Example One

```
Enter an infix expression (e.g., (3 + 5) * 2): (5 + 3)/(2 + 2)

--- Results ---
Infix Expression:   (5 + 3)/(2 + 2)
Postfix Expression: 5 3 + 2 2 + /
Evaluated Result:   2
```

#### Example Two

```
Enter an infix expression (e.g., (3 + 5) * 2): (2 + 3) * 2 - (2 * 2)

--- Results ---
Infix Expression:   (2 + 3) * 2 - (2 * 2)
Postfix Expression: 2 3 + 2 * 2 2 * -
Evaluated Result:   6
```
