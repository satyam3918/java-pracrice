class Calculator{
    int a;

    public int add( int n1, int n2){
        int r = n1 + n2;
        return r;
    }
}

public class Tel_Class_Tut {
    public static void main(String a[]){
        int num1= 7;
        int num2= 9;
        Calculator calc = new Calculator();
        int result = calc.add(num1,num2);
        System.out.println(result);
    }

}
