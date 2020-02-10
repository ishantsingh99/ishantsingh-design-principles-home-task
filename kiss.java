public class kiss {
    static void calculator(String s,int a,int b)
    {
        switch(s)
        {
            case "add":
                System.out.println(a+b);
                break;
            case "subtract":
                System.out.println(a-b);
                break;
            case "multiply":
                System.out.println(a*b);
                break;
            case "divide":
                System.out.println(a/b);
                break;
        }
    }
    public static void main(String args[]){
        calculator("add",2,4);
        calculator("multiply",3,6);
    }
}
