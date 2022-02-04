package com.h2;

import java.time.LocalDate;

public class SavingsCalculator {

    private float[] credits;
    private float[] debits;

    public SavingsCalculator(float[] credits, float[] debits) {

        this.credits = credits;
        this.debits= debits;

    }

    private float sumOfCredits() {

        float sum = 0.0f;

        for(int i = 0; i < credits.length; i++) {
            sum += credits[i];
        }

        return sum;

    }

    private float sumOfDebits() {

        float sum = 0.0f;

        for(int i = 0; i < debits.length; i++) {
            sum += debits[i];
        }

        return sum;

    }

    private static int remainingDaysInMonth(LocalDate date) {
        return -1;
    }

}
