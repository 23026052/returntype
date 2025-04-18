
public class returntype{

    public static void main(String[]args){
       
        System.out.println(ReturnString("hghgghgh"));
        System.out.println(addNUMBERS(1,5));
        System.out.println(addnumbers(2,4,6));
    }

    public static void showString(){
        System.out.println("return types");
    }

    public static String ReturnString(String a){

        return a;
    }
    public static int addNUMBERS(int a , int b){
        return a+b;  
    }
    public static double addnumbers(double a, double b ,double c){
    
        return a+b+c;
    }

}
