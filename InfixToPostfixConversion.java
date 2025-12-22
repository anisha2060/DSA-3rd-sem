public classInfixToPostfixConversion{

    /** 
    * Determines the precedecne of an operator
    * @param op The operator character
    * @return An integer reoresenting the precedence
    */
    private static int getPrecedence(char op){
        switch (op){
            case '+':
            case '-':
                return 1;    //Lowest precedence: Addition and subtraction

            case '*':
            case '/':
                return 2;    //Medium precedence: Multiplication and Division

            case '^':
            case '$':
                return 3;    //Highest precedence: Exponentiation and Dollar sign

            default:
                return 0;    //Everything else  like paranthesis
        }
    }
    public static string convertToPostfix(String infixExpression){
        // 1. Create a StringBuilder to build the final postfix expression
        StringBuilder postfixResult = new StringBuilder();

        // 2. Create a stack to hold the operators and paranthesis
        Stack<character> operatorStack=new Stack<>();

        // 3. Loop through every character in the Infix expression
        for (int i = 0; i<infixExpression.length(); i++){
            char token = infixExpression.charAt(i);

            // Ignore any blank spaces
            if (character.isWhitespace(token)){
                continue;
            }

            // CASE 1: The token is an operand (Letter or digit)
            if (character.isLetterOrDigit(token)){
                // if it is a number or a variable, just add it directly to the postfix result
                postfixResult.append(token);
            }

            // CASE 2: The token is opening paranthesis'('
            else if(token =='('){
                // Push '(' on the stack.
                operatorStack.push(token);
            }

            // CASE 3: The token is closing paranthesis ')'
            else if (token == ')'){
                // POP operators from the stack and append to the postfix result
                // until the matching '(' is found.

                while(!operatorStack.isEmpty() && operatorStack.peek() !='('){
                    postfixResult.append(operatorStack.pop());
                }

                // if the stack is empty, discard or remove '('
                if (!operatorStack.isEmpty()&& operatorStack.peek()=='('){
                    operatorStack.pop();
                }

                // CASE 4: The token is an operator (+,-,*,/) --
                else{
                    // while the stack is not empty And the top operator has 
                    // greater or equal precedence than the current token:

                    while(!operatorStack.isEmpty()&&
                    getPrecedence(operatorStack.peek())>= getPrecedence(token))
                    {
                        // Crucial check: Donot push the opening parantheis '('
                        // it belongs to CASE 3

                        if (operatorStack.peek()=='('){
                            break;
                        }
                        // pop the higher precedence operator and push it to the result
                        postfixResult.append(operatorStack);
                    }

                    // Now, push the current operator on to the stack 
                    operatorStack.push(token);
                } 
            }
        }
    }
}

