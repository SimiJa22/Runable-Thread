public class RunThread implements Runnable{
  public void run(){
    System.out.print("RunThread");
     }
public static void main(String[] args){
Thread t=new Thread(new RunThread());
t.start();
}
}