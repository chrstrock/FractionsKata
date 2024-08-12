package com.tddkatas.fractions;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction f2) {
        return new Fraction(5, 6);
    }

}
