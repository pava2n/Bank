class MultiInheritance{
         public static void main(String args[]){
              Criminal  cr= new Criminal();
              cr.sleep();
              cr.duty();
              cr.thief();
         }
     }
     
     class Human { 
    void sleep(){
        System.out.println("Sleeping");
        
    }
    
}


    class Police extends Human{
        void duty(){
            System.out.println(" the police  is in investigation ");
            
        }
    }
    
    
  
    class Criminal extends Police{
         void thief(){
             System.out.println(" He cidnapd one boy nd blackmailing ");
         }
    }
    
     


OUTPUT:-

        Sleeping
 the police  is in investigation 
 He cidnapd one boy nd blackmailing 
