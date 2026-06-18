# Algorithms & Data Structures — Assignment 1 (AITU)

![Java](https://img.shields.io/badge/Java-17-007396?logo=openjdk&logoColor=white)

## Overview

Eleven standalone Java programs solving classic algorithmic problems using **recursion**. Each solution includes a documented Big-O analysis in the Javadoc. Written as a lab series for the Algorithms & Data Structures course at Astana IT University.

## What it implements

- **Recursive minimum** (`FirstProblem`) — finds the minimum element in an array recursively; O(n).
- **Recursive average** (`SecondProblem`) — sums an array recursively then divides; O(n).
- **Primality test** (`ThirdProblem`) — trial division up to √n; O(√n).
- **Factorial** (`Fourthproblem`) — standard recursive factorial; O(n).
- **Fibonacci** (`FifthProblem`) — naive recursive Fibonacci; O(2ⁿ), complexity noted explicitly.
- **Power** (`SixthProblem`) — recursive exponentiation aⁿ; O(n).
- **Reverse print** (`SeventhProblem`) — reads N integers and prints them in reverse using the call stack; O(n).
- **All-digits check** (`EigthProblem`) — recursive character scan to verify a string is all digits; O(n).
- **Binomial coefficient** (`NinethProblem`) — Pascal's rule recursion C(n,k); O(2ⁿ).
- **GCD** (`TenthProblem`) — Euclidean algorithm via recursion; O(log min(a,b)).
- **Palindrome check** (`Eleventh`) — recursive two-pointer comparison; O(n).

## Project structure

```
src/
├── Main.java                  # Entry point (reverse-print demo)
└── tasks/
    ├── FirstProblem.java      # Recursive minimum
    ├── SecondProblem.java     # Recursive average
    ├── ThirdProblem.java      # Primality test
    ├── Fourthproblem.java     # Factorial
    ├── FifthProblem.java      # Fibonacci
    ├── SixthProblem.java      # Power
    ├── SeventhProblem.java    # Reverse print
    ├── EigthProblem.java      # All-digits check
    ├── NinethProblem.java     # Binomial coefficient
    ├── TenthProblem.java      # GCD (Euclidean)
    └── Eleventh.java          # Palindrome check
```

## How to run

Each task has its own `main` method. Compile and run any one individually:

```bash
# From the src/ directory
javac tasks/FifthProblem.java
java -cp . tasks.FifthProblem
# Enter n at the prompt, e.g. 10
```

Or compile everything at once:

```bash
javac -d out src/tasks/*.java src/Main.java
java -cp out tasks.TenthProblem
```

---

Adil Ormanov — [GitHub](https://github.com/Adilforest)
