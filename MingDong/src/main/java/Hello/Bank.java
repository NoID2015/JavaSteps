package Hello;

/**
 * Created by MingDong on 2017/5/16.
 */
public class Bank implements Runnable{
    int money = 300;
    String accountName,cashierName;
    public Bank(String s1,String s2){
        accountName = s1;
        cashierName = s2;
    }
    public void run(){
        saveOrTake(30);
    }
    public synchronized void saveOrTake(int number){
        if(Thread.currentThread().getName().equals(accountName)) {
            for (int i = 1; i <= 3; i++) {
                money = money + number;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println("我是" + accountName + "目前账上有" + money + "万");
            }
        }else if(Thread.currentThread().getName().equals(cashierName)){
            for(int i=1;i<=2;i++){
                money=money -number/2;
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){}
                System.out.println("我是"+cashierName+"目前账上有"+money+"万");
            }
        }
    }
}