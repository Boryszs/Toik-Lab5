package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Stack implements StackOperations {
    private List<String> stack;


    public Stack() {
        stack=new LinkedList<>();
    }

    @Override
    public List<String> get() {
        List<String> tmp=new LinkedList<>(this.stack);
        stack.clear();
        return tmp;
    }

    @Override
    public Optional<String> pop() {
        if(stack.size()>=1){
            String tmp=stack.get((stack.size()-1));
            stack.remove(stack.size()-1);
            return Optional.of(tmp);
        }
        return Optional.empty();

    }

    @Override
    public void push(String item) {
        this.stack.add(item);
    }
}
