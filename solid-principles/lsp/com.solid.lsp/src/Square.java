public class Square implements Shape {

    private int side;

    Square(int side) {
        this.setSide(side);
    }

    @Override
    public int getArea() {
        return side * side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
