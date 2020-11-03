package com.company;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        StackOperations stackOperations=new Stack();
        stackOperations.push("1");
        stackOperations.push("2");
        stackOperations.push("3");

        List<String> stack=stackOperations.get();

        for(String str:stack){
            System.out.println(str);
        }

        System.out.println("========================================");
        stackOperations.push("1");
        stackOperations.push("2");
        stackOperations.push("3");
        stackOperations.push("4");
        stackOperations.push("5");
        stackOperations.push("6");

        Optional<String> item;
        do{
            item=stackOperations.pop();
            System.out.println(item.orElse("Stack is Empty"));
        }while (item.isPresent());

        System.out.println("========================================");

        stackOperations.push("1");
        stackOperations.push("2");
        stackOperations.push("3");
        stackOperations.push("4");
        stackOperations.push("5");
        stackOperations.push("6");

        System.out.println(stackOperations.pop().orElse("Stack is empty"));
        System.out.println(stackOperations.pop().orElse("Stack is empty"));
        System.out.println(stackOperations.pop().orElse("Stack is empty"));
        System.out.println(stackOperations.pop().orElse("Stack is empty"));
        System.out.println(stackOperations.pop().orElse("Stack is empty"));
        System.out.println(stackOperations.pop().orElse("Stack is empty"));
        System.out.println(stackOperations.pop().orElse("Stack is empty"));
        System.out.println(stackOperations.pop().orElse("Stack is empty"));

    }
}
