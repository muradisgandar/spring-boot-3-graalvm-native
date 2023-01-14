package com.example.demo.features;

public class StringTextBlock {

    public static void oldStyle() {
        String text = "{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"age\": 45,\n" +
                "  \"address\": \"Doe Street, 23, Java Town\"\n" +
                "}";
        System.out.println(text);
    }

    public static void newStyle() {
        String text = """
            {
              "name": "John Doe",
              "age": 45,
              "address": "Doe Street, 23, Java Town"
            }
            """;
        System.out.println(text);
    }
}
