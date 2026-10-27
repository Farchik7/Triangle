
public class Triangle {
    private double a;
    private double b;
    private double c;

    // Замінено нетиповий префікс take* на standard get*
    public double getA() {
        return a;
    }
    // Замінено нетиповий префікс put* на standard set*
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }
   
    // Перейменовано з perim() на perimeter()
   public double perimeter() {
        return a + b + c;
   }

   // Усунуто дублювання: півпериметр тепер зберігається в змінну p
   public double area() {
       double p = 0.5 * perimeter();
       return Math.sqrt(p * (p - a) * (p - b) * (p - c));
   }

   // Змінено назву на isEquilateral() та прибрано зайвий if-else
   public  boolean  isEquilateral(){
       return (a == b) && (b == c);
   }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Triangle triangle)) return false;

        return Double.compare(a, triangle.a) == 0 && Double.compare(b, triangle.b) == 0 && Double.compare(c, triangle.c) == 0;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(a);
        result = 31 * result + Double.hashCode(b);
        result = 31 * result + Double.hashCode(c);
        return result;
    }
}
