public class Main {

    public static void main(String[] args) {
        Sphere obj = new Sphere("Red" , true);
        obj.setRadius(8);
        System.out.println(obj.toString());
        System.out.println();

        Cube obj1 = new Cube("white" ,true);
        obj1.setSide(8);
        System.out.println(obj1.toString());

        if (obj1.compareTo(obj) == -1){
            System.out.println("\nSphere's volume is bigger than Cube's . ");
        }else if (obj1.compareTo(obj) == 1){
            System.out.println("\nCube's volume is bigger than Sphere's .");
        }else
        {
            System.out.println("\nVolume are equal in all Shape...");
        }



    }
}
