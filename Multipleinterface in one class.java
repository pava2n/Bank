interface Printable{
    void print();
}
interface Showable{
    void show();
}

  class Testinterface1 implements Printable,Showable{
      public void print(){
          System.out.println("hai,printable interface");
      }
      public void show(){
         System.out.println("hai,showable interface");
      }  
   public static void main(String args[]){
       Testinterface1 t= new Testinterface1();
           t.show();
           t.print();
   }
  }
  

OUTPUT;-


       hai,showable interface
       hai,printable interface
