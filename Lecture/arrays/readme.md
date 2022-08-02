# Arrays

- Used to take multiple count of inputs and store them in a variable.
- It is a collection (or) data structure where you can store large number of values (or) inputs.

## How to declare it?

```
datatype[] variableName = {a1, a2, a3, ...};

datatype[] variableName = new datatype[size];
```

## Accessing Array values

- if `a = [1,2,3,4,5]` is an array

```
a[0] = 1; a[1] = 2; etc.
```

## Taking input

### Feeding values individually

`arr[location] = value`

- eg: `arr[1] = 1` or `arr[0] = 14`

### Feeding in one go

```
Scanner sc = new Scanner(System.in)

datatype[] variableName = new datatype[length];

for(int i = 0; i < variableName.length; i++){
    variableName[i] = sc.next${`Datatype`}();
}
```
