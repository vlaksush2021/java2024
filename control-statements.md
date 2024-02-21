## Control Statements in Java
Control statements in Java are used to alter the flow of execution in a program. 
They allow you to make decisions, repeat actions, and perform branching based on conditions.  

### Conditional Statements
if Statement: Executes a block of code if a specified condition is true.
```java
if (condition) {
    // Code to be executed if the condition is true
}
```

#### if-else Statement
Executes one block of code if the condition is true and another block if the condition is false.
```java
if (condition) {
    // Code to be executed if the condition is true
} else {
    // Code to be executed if the condition is false
}
```

#### else-if Statement
Allows you to check multiple conditions.

```java
if (condition1) {
    // Code to be executed if condition1 is true
} else if (condition2) {
    // Code to be executed if condition2 is true
} else {
    // Code to be executed if none of the conditions are true
}
```

### Looping Statements
#### for Loop
Executes a block of code repeatedly for a fixed number of times.
```java
for (initialization; condition; increment/decrement) {
    // Code to be executed in each iteration
}
```
#### while Loop 
Executes a block of code repeatedly as long as a specified condition is true.
```java
while (condition) {
    // Code to be executed as long as the condition is true
}
```
#### do-while Loop
Similar to a while loop but the code block is executed at least once, even if the condition is false.
```java
do {
    // Code to be executed at least once
} while (condition);
```

### Branching Statements
#### break Statement
Terminates the loop or switch statement and transfers execution to the statement immediately following the loop or switch.
#### continue Statement
Skips the current iteration of a loop and proceeds to the next iteration.
#### return Statement
Exits from the current method and optionally returns a value.
