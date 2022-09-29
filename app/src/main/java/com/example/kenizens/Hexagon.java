package com.example.kenizens;

public class Hexagon {
    private float sideLength;

    public Hexagon (float sideLength) {
        this.sideLength = sideLength;
    }

    public float Area (float sideLength) {
        return (float) (3*Math.sqrt(3)/2*Math.pow(sideLength, 2));
    }

    public float Perimeter(float sideLength) {
        return sideLength*6;
    }

    public float getSideLength() {
        return sideLength;
    }

    public void setSideLength(float sideLength) {
        this.sideLength = sideLength;
    }
}
