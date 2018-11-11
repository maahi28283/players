public class HelloWorld{

     public static void main(String []args){
       String s="aabbcc";
       String r=new StringBuffer(s).reverse().toString();
        System.out.println(r);
     }
}
