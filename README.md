# Json Logical Expression Evaluator

## Problem Description:
- Given a JSON object and a boolean expression
- JSON object should not contains sub objects
- Boolean expression consists of one or multiple logical expressions
- A simple expression can have these operators: <, <=, >, >=, =, != 
- The expression also can have inner expression which starts with '(' and end with ')'. 
- Multiple expressions can join each other by 2 boolean operators: 'AND(&)', 'OR(|)'
- Write functions to 
  - Validate the syntax of the given boolean experssion.
  - Evaluate the boolean expression against the given JSON object. 

`Sample Input`:
JSON object
```  
{
    "id": "624746b7685bb122df93c89b",
    "isActive": false,
    "age": 30,
    "firstName": "Witt",
    "gender": "male",
    "company": "NORALEX",
    "email": "wittratliff@noralex.com",
    "registered": "2020-05-26T09:25:21 -07:00",
    "tags": [
      "sint",
      "aliquip",
      "laboris",
      "quis",
      "enim",
      "dolore",
      "eu"
    ]
}
```
Boolean expression
```
age >= 25
gender != 'male' AND isActive = false
firstName = 'Witt' OR firstName = 'John' OR firstName = 'Louis' AND (age < 35 OR age >= 40)
```

`Sample Output`:
```
true
false
true
```

## Solution:
Define a grammar that represents the logical expression. My library supports 8 types of comparations:
 - `Num comparation`: To compare the key value with a number value. The number value could be integer and double

> x > 10
> y <= 0
> height = 175
...

- `String comparation`: To compare the key value with a string value. The compare value should put inside a single quote. Only supports for operator '=' and '!='

> name = 'Long Nguyen'
> city != 'Saigon'
...

- `Boolean comparation`: To compare the key value with a boolean value. The valid boolean values are 'TRUE' and 'FALSE' (case insensitive) 

> userIsActive = true
..

- `Key comparation`: To compare the key value with another key

> x > y
> y = z
> z <= k
...

- `Array comparation`: To compare the key value with an array. The keyword for this syntax is 'IN' or 'NOT IN' (case insensitive)

> faang IN ('facebook', 'amazon', 'apple', 'netflix', 'google')
> leapYear NOT IN (2017, 2019, 2021, 2022)
...

- `NULL comparation`: To check the key value is NULL or not. The keyword for this syntax is 'IS NULL' or 'IS NOT NULL' (case insensitive)

> user IS NULL
> email IS NOT NULL
...

- `Regex comparation`: To match the key value with a regular expression. The syntax for this comparation is 'MATCH / NOT MATCH regex("<pattern>"'

> lastname MATCH regex("[A-Z]")
...

- `Mix comparation`: You can actually mix one or more above comparations to make a logical boolean expression. Eg

> x > -5 AND x <= 10 AND (y IS NOT NULL AND y MATCH regex("\d+")) AND (z IN ('foo', 'bar') | z = 'fizzbuzz')

## Usage

To validate expression syntax

```
```

To evaluate expression against JSON object

```
```

## Tech

This library use [ANTLR](https://github.com/antlr/antlr4) to build grammar and generate grammar tree to handle parsing and evaluate

## License

MIT
