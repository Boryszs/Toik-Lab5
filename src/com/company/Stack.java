package com.company;

import java.util.List;
import java.util.Optional;

public class Stack implements StackOperations {
    private List<String> stack;
    private int size;
    
    public Stack() {
        this.size=0;
    }

    @Override
    public List<String> get() {
        return null;
    }

    @Override
    public Optional<String> pop() {
        return Optional.empty();
    }

    @Override
    public void push(String item) {

    }
}
