interface Drawable{
    void draw();
    
}

class Circle implements Drawable{
    public void draw(){
        System.out.println("draw the circle");
    }
    
}

class Rectangle implements Drawable{
    public void draw(){
        System.out.println("draw the reactangle");
        
    }
}

class Interface1{
    public static void main(String args[]){
        Circle c= new Circle();
           c.draw();
        Rectangle r= new Rectangle();
           r.draw();
        Drawable d= new Rectangle();
           d.draw();
           
    }
}



OUTPUT:
        
         draw the circle
         draw the reactangle
         draw the reactangle
