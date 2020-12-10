package com.orangomango.threadtest;

public class ThreadTest {

  public static Thread[] threads = new Thread[10];

  public static void main(String[] args) {
  
     //create threads
     for (int x = 0; x <10 ; x++){
       threads[x] = new Thread(new PersonalThread(x));
     }
     
     //start all threads
     for (Thread t : threads){
       t.start();
     }
     
     //stop all threads
     for (Thread t : threads){
       while (t.isAlive()){
         try {
           t.join(); // Join thread to main thread
         } catch (InterruptedException e){
           continue; // if something goes wrong repeat this block
         }
       }
     }
  }
}
