package Hello;

/**
 * Created by MingDong on 2017/5/16.
 */
public class Hello {
    public static void main(String [] args){
        System.out.println("+++++++++++++++");
        Bank bank = new Bank("会计","出纳");
        Thread account,cashier;
        account = new Thread(bank);
        cashier = new Thread(bank);
        account.setName("会计");
        cashier.setName("出纳");
        account.start();
        cashier.start();
    }
}
