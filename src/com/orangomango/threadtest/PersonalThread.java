package com.orangomango.threadtest;

public class PersonalThread implements Runnable{

   public int x;
   
   public PersonalThread(int x){
      this.x = x;
   }
  
   @Override
   public void run(){
      System.out.println("Running thread "+x);
   }
}
