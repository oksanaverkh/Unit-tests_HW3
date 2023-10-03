package com.example;

public class Numbers {

    private int n;
    
    public Numbers(int n) {
        this.n = n;
    }

    public boolean evenOddNumber() {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInInterval(int minBorder, int maxBorder) {
        if (n >= minBorder && n <= maxBorder) {
            return true;
        } else {
            return false;
        }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
