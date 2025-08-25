package src.function;

public class returntype {
    public static int me(int a){
        System.out.println("This is me function");
        if(a>0) return 5;
        else return 0;
    }
    public static void main(String[] args){
        // System.out.println(me());
        // me();//stand alone function call
        int x = me(9);
        System.out.println(3+x);

    }
}

// me() in itself become an integer type function because it is returning an integer value and value is 0.
