public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.b = triangle.a = triangle.c = 4;
        triangle.corner = 60;
        if (triangle.a+ triangle.b< triangle.c || triangle.b+ triangle.c< triangle.a || triangle.a+ triangle.c< triangle.b){
            System.out.println("Triangle doesn't exist.");
        } else {
            triangle.Perimeter();
            triangle.Square();
        }
    }
}
class Triangle {
    int a ;
    int b = a;
    int c = a;
    int corner;
    void Square(){
        double h = a*Math.sin(corner);
        double S = 0.5*h*c;
        System.out.println("Square of the triangle: " + S);
    }
    void Perimeter(){
        int P = a+b+c;
        System.out.println("Perimeter of the triangle: " +P);
    }
}