interface Mobile{
    void print();
    
}

class Vivo implements Mobile{
    public void print(){
        System.out.println(" the price of the mobile is 15000");
         System.out.println("the model of the mobile is v7+");
    }
    
}

class Realme implements Mobile{
    public void print(){
        System.out.println("the model of the mobile is 9 pro");
        
    }
}

class Interface3{
    public static void main(String args[]){
        Vivo c= new Vivo();
           c.print();
        Realme r= new Realme();
           r.print();
       // Drawable d= new Rectangle();
          // d.draw();
           
    }
}

s


OUTPUT:
       
   the price of the mobile is 15000
   the model of the mobile is v7+
   the model of the mobile is 9 pro
