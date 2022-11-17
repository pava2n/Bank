 class MobileUser{
           public static void main(String args[]){
               Mobile vivo= new Mobile();
                      vivo.insertSim(new Uninor());
               String res=vivo.sendSms(79979,"hai ra premuu");
               
               
               String vc=vivo.dailCall(63049);
               
                      System.out.println(res);
                      
                      
                      System.out.println(vc);
                      
           
      }
       
  }
  interface Sim{
      String dailCall (long mobile_No);
      String sendSms(long mobile_No,String msg);
}
  class Uninor implements Sim {s
      public String dailCall(long mobile_No){
      return "the number u have dailed is currently busy please try again later";
      }
      public String sendSms(long mobile_No, String msg){
      return "the sms has sent succesfully from uninor sim1";
      }
      
  }
  
  class Idea implements Sim{
       public String dailCall(long mobile_No){
      return "the number u have dailed is currently busy plz try again later";
       }
      public String sendSms(long mobile_No, String msg){
      return "the sms has sent succesfully from idea sim2";
      }
  }
      
      class Mobile{
          //public static void main(String args){
          private Sim s;
          public void insertSim(Sim s){      //method creation
          this.s=s;
          }
          public String dailCall(long mobile_No){
              return s.dailCall(mobile_No);
              }
          public String sendSms(long mobile_No, String msg){
              return s.sendSms(mobile_No,msg);
          }
          
      }
      
       
      


OUTPUT:-
the sms has sent succesfully from uninor sim1
the number u have dailed is currently busy please try again later