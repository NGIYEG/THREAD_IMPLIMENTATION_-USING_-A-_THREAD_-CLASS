//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread=new MyThread();
        thread.start(); //starts a new thread, This internally invokes the run() method in a separate thread.
//      thread.run();    this is wrong, does not create a new thread. Instead, it simply calls the run() method in the same thread where main() is running.


    }


}