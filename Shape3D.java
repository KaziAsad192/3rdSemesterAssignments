import java.text.DecimalFormat;

abstract public class Shape3D {
    private String color ;
    private boolean filled ;
    DecimalFormat dec = new DecimalFormat("#.###");

    public Shape3D(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    abstract public int compareTo(Object o);
    abstract protected double area() ;
    abstract protected double volume();

}
