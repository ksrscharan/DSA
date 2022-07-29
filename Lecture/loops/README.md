# What are loops?

- Loops are used to execute a set of instructions for a fixed number of times.

## Types of Loops

### For-loop

```
for(init; cond; increment/decrement){
    code;
}
```
- Things to remember
    - Best to use in most cases.
    - For known number of iteration, use _for_ loop.

### While Loop

```
init
while(condition){
    code;
    increment/decrement;
}
```
- Things to remember
    - When there's no stopping condition, loop goes infinite.
    - For known number of iteration, use _for_ loop.
    - When you know stopping condition, use _while_ loop.

### Do-While Loop
```
init
do{
    code;
    increment/decrement;
}while(condition)
```
- Things to remember
    - Will at least pnce before checking for condition.