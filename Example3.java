class Single{
     private static final Single single = new Single();
     private static int count = 0;
     private Single(){
     }
     public static Single getInstrance(){
     count++;
     return single;
     }
     public  void print(){
     System.out.println("This is Single,No."+count);
     }
    }
    public class Example3{
     public static void main(String args[]){
     Single single = Single.getInstrance();
     single.print();
     Single single2 = Single.getInstrance();
     single2.print();
     }
    }