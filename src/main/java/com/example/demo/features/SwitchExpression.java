package com.example.demo.features;

public class SwitchExpression {

    public static void oldStyleWithoutBreak(Fruit fruit) {
        switch (fruit) {
            case APPLE, PEAR:
                System.out.println("Common fruit");
            case ORANGE, AVOCADO:
                System.out.println("Exotic fruit");
            default:
                System.out.println("Undefined fruit");
        }
    }

    public static void oldStyleWithBreak(Fruit fruit) {
        switch (fruit) {
            case APPLE, PEAR:
                System.out.println("Common fruit");
                break;
            case ORANGE, AVOCADO:
                System.out.println("Exotic fruit");
                break;
            default:
                System.out.println("Undefined fruit");
        }
    }

    // The default behaviour of Switch Expressions is no fall-through, so no break is needed.
    public static void newSwitchStyle(Fruit fruit) {
        switch (fruit) {
            case APPLE, PEAR -> System.out.println("Common fruit");
            case ORANGE, AVOCADO -> System.out.println("Exotic fruit");
            default -> System.out.println("Undefined fruit");
        }
    }

    public static void withReturnValue(Fruit fruit) {
        System.out.println(
                switch (fruit) {
                    case APPLE, PEAR -> "Common fruit";
                    case ORANGE, AVOCADO -> "Exotic fruit";
                    default -> "Undefined fruit";
                });
    }

    public static void withYield(Fruit fruit) {  // yield also is supported in old style
        String text = switch (fruit) {
            case APPLE, PEAR -> {
                System.out.println("the given fruit was: " + fruit);
                yield "Common fruit";  // return value
            }
            case ORANGE, AVOCADO -> "Exotic fruit";
            default -> "Undefined fruit";
        };
        System.out.println(text);
    }

    public enum Fruit {

        APPLE,
        PEAR,
        ORANGE,
        AVOCADO
    }

}
