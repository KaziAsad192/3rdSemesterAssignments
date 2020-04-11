public class Sphere extends Shape3D {
    private double radius ;

    public Sphere(String color, boolean filled) {
       super(color, filled);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected double area() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    protected double volume() {
        return (4/3)*Math.PI*radius*radius*radius;
    }

    @Override
    public int compareTo(Object o) {
        if (volume() > ((Cube)o).volume()){
            return 1 ;
        }else if (volume()<((Cube)o).volume()){
            return -1 ;
        }
        else
            return 0 ;
    }


    @Override
    public String toString() {
        return "Sphere{" +
                "color: " + getColor() + " | " + "Radius :" + getRadius() +
                " | Filled : " + isFilled() + " | Area :" + dec.format(area()) +
                " | Volume: "+ dec.format(volume()) +
                '}';
    }
}
