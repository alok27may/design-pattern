package com.learning.ds.creational.builder.example2;

public class PrototypePatternTest {
    public static void main(String[] args) {
        try {
            final String movieProtoType = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE).toString();
            System.out.println(movieProtoType);
            final String albumProtoType = PrototypeFactory.getInstance(PrototypeFactory.ModelType.ALBUM).toString();
            System.out.println(albumProtoType);
            final String showProtoType = PrototypeFactory.getInstance(PrototypeFactory.ModelType.SHOW).toString();
            System.out.println(showProtoType);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
