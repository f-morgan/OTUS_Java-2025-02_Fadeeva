package ru.otus;

import static com.google.common.base.MoreObjects.firstNonNull;

public class HelloOtus {
    public static void main(String[] args) {

        String firstString = null;
        String secondString = "NotNullString";

        System.out.println("Get not null String between two: " + firstNonNull(firstString, secondString));
    }
}
