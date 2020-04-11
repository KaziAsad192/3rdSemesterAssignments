public class Cube extends Shape3D {
    private double side;
    public Cube(String color, boolean filled) {
        super(color, filled);
    }

    public double getSide() {
       return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    protected double area() {
        return 6*side*side;
    }

    @Override
    protected double volume() {
        return side*side*side;
    }

    @Override
    public int compareTo(Object o) {
        if (area() > ((Sphere)o).area()){
            return 1 ;
        }else if (area()<((Sphere)o).area()){
            return -1;
        }
        else return 0 ;
    }

    @Override
    public String toString() {
        return "Cube{" + "Color: " + getColor() +
                "  | side=" + getSide() + " | Filled : " +
                isFilled() +" | Area :" + dec.format(area())
                + " | Volume: "+ dec.format(volume()) +
                '}';
    }
}
