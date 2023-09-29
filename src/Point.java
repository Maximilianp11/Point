public class Point {

    private int x;
    private int y;

    private String pair;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int value) {
        this.x = value;
        this.y = value;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }
    public  void setY(int newY) {
        y = newY;
    }

    public String coordinate() {
        pair = "(" + x + ", " + y + ")";
        return pair;
    }

    public String quadrant() {
        if (x > 0 && y > 0) {
            return "The point is in quadrant 1";
        } else if (x > 0 && y < 0) {
            return "The point is in quadrant 3";
        } else if (x < 0 && y > 0) {
            return "The point is in quadrant 2";
        } else if (x < 0 && y < 0) {
            return "The point is in quadrant 4";
        } else if (x == 0 || y == 0) {
            return "The point is on an axis";
        }

        return "";
    }
}
