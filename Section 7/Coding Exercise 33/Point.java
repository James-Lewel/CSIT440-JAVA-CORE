public class Point {
    private int x;
    private int y;
    
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distance(int x, int y) {
        int xDiff = x - this.x;
        int yDiff = y - this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    
    public double distance(Point point) {
        int xDiff = point.getX() - this.x;
        int yDiff = point.getY() - this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}