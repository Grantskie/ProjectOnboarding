### Higher Order Functions
A higher order function is a function that either takes another function as a parameter, outputs another function as a return or both

### Example
```
val numbers = Array(0, 1, 2, 3, 4, 5)
val newNumbers = numbers.map(_ * 10)

newNumbers: Array[Int] = Array(0, 10, 20, 30, 40, 50)

So the map function is a higher order function because it takes another function as a parameter
```
