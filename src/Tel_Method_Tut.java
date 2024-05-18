class AddCal{
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}

public class Tel_Method_Tut {

    public static void main(String a[]){
        AddCal obj = new AddCal();
        int r1 = obj.add(5,6,7);
        int r2 = obj.add(12,15);
        System.out.println(r1);
        System.out.println(r2);

    }


}
