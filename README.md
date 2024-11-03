# Reverse Digit Sum Calculator

This Java application reads non-negative integers from user input, breaks down each integer into its individual digits using a stack, reverses the digit order, and displays the reversed sequence with the sum of the digits. This is achieved by pushing each digit of the integer onto a stack and then popping them to reverse their order. The output shows the digits in reverse order and their sum in a formatted string.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Program Flow](#program-flow)
- [Classes and Structure](#classes-and-structure)
- [Example Output](#example-output)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [License](#license)

## Overview

This application is a command-line tool for processing non-negative integers. For each integer input, it:
1. Decomposes the integer into its individual digits.
2. Uses a stack to reverse the digits.
3. Computes the sum of the digits.
4. Prints the reversed sequence of digits along with their sum.

The program continues processing integers until a negative integer is entered, which exits the program.

## Features

- **Integer Digit Reversal**: Uses a stack data structure to reverse the digits of each integer.
- **Sum Calculation**: Computes the sum of the digits of each integer.
- **Formatted Output**: Outputs each integer’s digits in reverse order followed by their sum.
- **Dynamic Input Handling**: Processes integers continuously until a negative number is provided.

## Program Flow

1. The user enters a non-negative integer.
2. Each digit of the integer is pushed onto a stack, with the stack storing the digits in reverse order.
3. The program pops each digit off the stack, adding to a running sum, and formatting the output string.
4. The formatted string shows each digit, a plus sign between them, and their total sum.
5. The process repeats until a negative integer is input.

## Classes and Structure

The code is organized into several classes to handle different aspects of the program:

1. **Main**: The main class, containing program flow logic.
   - Reads user input.
   - Breaks down integers into digits and processes them using the stack (`MiPila`).
   - Formats and prints the final output.
   
2. **MiPila**: Implements a stack data structure using linked nodes.
   - Provides basic stack operations: `push`, `pop`, and `isEmpty`.
   
3. **Nodo**: Represents a node in the stack.
   - Stores integer data and a reference to the next node.
   
4. **Pila (Interface)**: Defines the stack operations for integer values.
   - Ensures stack consistency and defines the methods used by `MiPila`.

## Example Output

```
Enter a non-negative integer (negative to quit):
1234
4 + 3 + 2 + 1 = 10

Enter a non-negative integer (negative to quit):
305
5 + 0 + 3 = 8

Enter a non-negative integer (negative to quit):
-1
Program terminated.
```

## Getting Started

### Prerequisites
- **Java Development Kit (JDK) 8 or higher**

## Usage

1. Run the program.
2. Enter a series of non-negative integers, each followed by pressing `Enter`.
3. The program will output each integer’s digits in reverse order along with their sum.
4. Input a negative integer to exit the program.