# Abstract-assignment-3 
Tat Putjorn 672115024

This Java program reads mathematical expressions from a file, checks if they are valid infix expressions, and converts them into postfix notation using a stack-based approach. The program takes a file name as a command-line argument and processes each expression line by line. If the expression is valid, it prints the corresponding postfix expression; otherwise, it marks it as invalid. To run the program, compile it using javac InfixToPostfix.java, then execute it with java InfixToPostfix <filename>, where <filename> is the path to your input file (e.g., "D:\coding\Abstract\Assignment_3\input1.csv"). If the file is missing or contains incorrect expressions, the program will notify the user. This implementation ensures flexibility and allows processing multiple input files as needed.

Example Output:

Infix exp: (5 + 3) * (2 - (8 / 4))
Valid
Postfix exp: 5 3 + 2 8 4 / - *

Infix exp: ((7 + 6) * (5 - 2)) / (4 + 1)
Valid
Postfix exp: 7 6 + 5 2 - * 4 1 + /

Infix exp: 15 - ((3 * 8) / (2 + 2))
Valid
Postfix exp: 15 3 8 * 2 2 + / -

Infix exp: (9 + (3 - 1) * 4) / (6 - 2)
Valid
Postfix exp: 9 3 1 - 4 * + 6 2 - /

Infix exp: (12 / (4 + 2)) + ((6 - 3) * 2)
Valid
Postfix exp: 12 4 2 + / 6 3 - 2 * +

Infix exp: 18 - ((6 + 2) * 3) + (5 * 2)
Valid
Postfix exp: 18 6 2 + 3 * - 5 2 * +

Infix exp: (5 * (7 - 3) + 2) / (8 - 4)
Valid
Postfix exp: 5 7 3 - * 2 + 8 4 - /

Infix exp: (24 / (4 + 2)) * (3 + 1) - 7
Valid
Postfix exp: 24 4 2 + / 3 1 + * 7 -

Infix exp: ((5 + 2) * (8 - 3)) / (9 / 3)
Valid
Postfix exp: 5 2 + 8 3 - * 9 3 / /

Infix exp: (20 / (2 * 5)) + ((7 - 3) * 2)
Valid
Postfix exp: 20 2 5 * / 7 3 - 2 * +

Infix exp: (9 * 3) - ((6 / 2) + (4 * 2))
Valid
Postfix exp: 9 3 * 6 2 / 4 2 * + -

Infix exp: (30 / (6 - 2)) * ((5 + 1) / 2)
Valid
Postfix exp: 30 6 2 - / 5 1 + 2 / *

Infix exp: ((16 - 4) / (8 / 2)) + (3 * 5)
Valid
Postfix exp: 16 4 - 8 2 / / 3 5 * +

Infix exp: (2 * (3 + 4) - 5) / (5 / 5)
Valid
Postfix exp: 2 3 4 + * 5 - 5 5 / /

Infix exp: ((14 + 6) / (2 + 2)) * (3 - 1)
Valid
Postfix exp: 14 6 + 2 2 + / 3 1 - *

Infix exp: (25 / (5 + 5) * 2) + (9 - 4)
Valid
Postfix exp: 25 5 5 + / 2 * 9 4 - +

Infix exp: (8 * (4 - 2)) / ((2 + 3) * 2)
Valid
Postfix exp: 8 4 2 - * 2 3 + 2 * /

Infix exp: ((10 - 3) * (6 / 2)) + (4 * 5)
Valid
Postfix exp: 10 3 - 6 2 / * 4 5 * +

Infix exp: ((3 + 5) > (7 - 2)) && ((4 * 2) < 12)
Not-Valid

Infix exp: ((6 / 2) * 5) >= ((10 - 3) * 2)
Not-Valid

Infix exp: ((8 * (3 + 2)) < (45 / 5)) || ((9 - 2) > 5)
Not-Valid

Infix exp: ((12 + 6) == (3 * 6)) && ((5 + 3) != 8)
Not-Valid

Infix exp: ((7 + 3) <= (10 - 2)) || ((9 / 3) == 3)
Not-Valid

Infix exp: ((18 / 3) + 2 > 5) && ((4 * 2) <= 10)
Not-Valid

Infix exp: ((9 * (2 + 1)) >= (25 - 2)) || ((6 - 2) < 5)
Not-Valid

Infix exp: ((5 + 6) != (3 * 4)) && ((4 + 2) > 5)
Not-Valid

Infix exp: (20 / (4 + 1) == 4) && ((8 - 3) < 6)
Not-Valid

Infix exp: (((5 + 3) * 2) - (6 / 2)) > ((10 / 5) + 7)
Not-Valid

Infix exp: ((15 - (3 * 8)) / (2 + 2)) < ((6 * 3) - 9)
Not-Valid

Infix exp: (((7 + 5) * 2) / (9 - 3)) == ((8 + 4) / 3)
Not-Valid
