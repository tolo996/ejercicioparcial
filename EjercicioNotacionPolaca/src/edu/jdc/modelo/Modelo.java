
package edu.jdc.modelo;

import java.util.EmptyStackException;
import java.util.Stack;


public class Modelo {
   
    private Nodo top;

    public void push(int data) {
        Nodo newNode = new Nodo(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public void evaluate(String expression) {
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isOperator(token)) {
                int operand2 = pop();
                int operand1 = pop();
                int result = applyOperation(token, operand1, operand2);
                push(result);
            } else {
                try {
                    push(Integer.parseInt(token));
                } catch (NumberFormatException e) {
                    System.err.println("entrada invalida    : " + token);
                }
            }
        }
    }

    private boolean isOperator(String token) {
        return "+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token);
    }

    private int applyOperation(String token, int operand1, int operand2) {
        switch (token) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Operador Invalido");
        }
    }

    public int getResult() {
        return pop();
    }
}

