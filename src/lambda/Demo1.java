package lambda;

public class Demo1 {
    interface Cal{
        int add(int a, int b);
    }

    public static void main(String[] args) {
        Cal c = new Cal(){
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        Cal cc = (a, b) -> {
            return a + b;
        };

        System.out.println(c.add(1,2));
    }
}
