package com.learning.ds.creational.builder.example2;

public class PrototypeFactory {
    public static class ModelType {
        public static final String MOVIE = "Movie";
        public static final String ALBUM = "Album";
        public static final String SHOW = "Show";
    }

    private static java.util.Map<String , PrototypeCapable> prototypes = new java.util.HashMap<String , PrototypeCapable>();

    static
    {
        prototypes.put(ModelType.MOVIE, new Movie());
        prototypes.put(ModelType.ALBUM, new Album());
        prototypes.put(ModelType.SHOW, new Show());
    }

    public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException {
        return ((PrototypeCapable) prototypes.get(s)).clone();
    }
}
