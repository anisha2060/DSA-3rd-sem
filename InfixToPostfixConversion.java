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
        }
    }
}

