package com.sectionsixoop;

public class Point {

    private int x, y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((0 - this.x) * (0 - this.x) +
                (0 - this.y) * (0 - this.y));
    }

    public double distance(int bx, int by) {
        return Math.sqrt((bx - this.x) * (bx - this.x) +
                (by - this.y) * (by - this.y));
    }

    public double distance(Point point) {
        return Math.sqrt((point.x - this.x) * (point.x - this.x) +
                (point.y - this.y) * (point.y - this.y));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
