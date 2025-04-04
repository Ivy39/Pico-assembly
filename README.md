# Pico Assembly Interpreter

## Overview
Pico Assembly is a simple Java-based interpreter that allows users to execute a custom assembly-like language with basic operations such as incrementing, decrementing, conditional jumps, and output. The interpreter operates on four registers and executes user-provided instructions sequentially.

## Features
- **User Input for Registers**: Initialize four registers (R1, R2, R3, R4) with user-defined values.
- **Custom Instruction Set**: Supports a basic instruction set for manipulating register values and controlling execution flow.
- **Basic Debugging Output**: Prints register values at the end of execution.


## Instructions
Pico Assembly uses the following instruction set:
- `E` (Exit): Terminates execution.
- `P` (Increment): Increments the specified register.
- `M` (Decrement): Decrements the specified register.
- `J` (Jump): Jumps to the specified instruction line.
- `C` (Conditional Jump): Skips the next instruction if the specified register is zero or negative.
- `W` (Write Character): Outputs the ASCII character stored in the specified register.

## Example: "Hello"
To print "Hello", enter the following program:

```
R1=72
R2=101
R3=108
R4=111

How long should your code be?: 6
1. W1
2. W2
3. W3
4. W3
5. W4
6. E
```

## How to Run

1. Run the program:
   ```bash
   java Pico_assembly
   ```
2. Follow the prompts to input initial register values and code instructions.
3. Write your code that you want to execute.  
4. View the output at the end of execution.

## Contributing
Feel free to fork and modify the project. If you find any bugs or want to propose new features, open an issue or submit a pull request.

## License
This project is licensed under the MIT License.

