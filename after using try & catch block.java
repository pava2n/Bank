          //BY USING TRY & CATCH BLOCK WE EXECUTED THE CODE//

class Pavan{
    public static void main(String args[]){
        
          int fNum=25;
          int sNum=0;
          int result=0;
          try{
              result= fNum/sNum;
     }
         catch(ArithmeticException ae){
             System.out.println(ae.toString());
         }
          System.out.println( result);
    }
}



 OUTPUT;

    
       java -cp /tmp/sfdx46BzPv Pavan
java.lang.ArithmeticException: / by zero s0
