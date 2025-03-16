package twentyOne;

public class Z extends Y {
    public float method (float f){
        return f*=f;
    }

    public static void main(String[] args) {
        Z z = new Z();
        System.out.println(z.method(2.38));
    }
}

