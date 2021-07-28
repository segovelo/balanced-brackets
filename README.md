# balanced-brackets
Balanced Brackets, also known as Balanced Parentheses, is a common programming problem.

A bracket is considered to be any of the following characters  "(", ")", "[", "]", "{", "}".
A set of brackets is considered to be a matched pair if an opening bracket, "(", "[", and "{", 
occurs to the left of the corresponding closing bracket, ")", "]",  and "}", respectively.
However, a string containing bracket pairs is not balanced if the set of brackets it encloses is not matched.
For example, if the input is “{[(])}”, the pair of square brackets, “[]”, encloses a single unbalanced opening 
round bracket, "(". Similarly, the pair of round brackets, "()", encloses a single unbalanced closing 
square bracket, "]". Thus, the input string "{[(])}" is unbalanced.

Therefore, a string containing bracket characters is said to be balanced if:
1- A matching opening bracket occurs to the left of each corresponding closing bracket
2 - Brackets enclosed within balanced brackets are also balanced
It does not contain any non-bracket characters
There are a couple of special cases to keep in mind: null is considered to be unbalanced, while the empty string is considered to be balanced.

