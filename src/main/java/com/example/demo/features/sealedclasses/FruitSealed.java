package com.example.demo.features.sealedclasses;

/** sealed keyword is provided control over class extends
 * we can define which class can extend super, which not
 * all permitted classes can extend FruitSealed class
 * visibility of defined class with sealed keyword is only within package
 */
public abstract sealed class FruitSealed permits AppleSealed, PearSealed {
}
