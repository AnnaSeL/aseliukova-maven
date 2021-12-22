package HWToLes21;

public class ThreadClass extends Thread{
    @Override
    public void run() {
        ATM atm = new ATM();
        for (int i = 0; i < 10; i++) {
            atm.doing();
        }
    }
}
