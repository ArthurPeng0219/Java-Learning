public class AccountDemo {
    public static void main(String[] args) {
        Account a =
                new Account(1001,
                        "Arthur",
                        1000);

        System.out.println(a);

        a.deposit(500);

        System.out.println(a);

        a.withdraw(300);

        System.out.println(a);

        a.withdraw(2000);
    }
}
class Account{
    private int id;
    private String name;
    private double balance;
    //无参构造
    public Account(){
        this.id = -1;
        this.name = " ";
        this.balance = 0;
    }
    //有参构造
    public Account(int id,String name,double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    //存款
    public void deposit(double money){
        balance += money;
    }
    //取款
    public void withdraw(double money){
        if( balance >= money)
            this.balance = balance - money;
        else System.out.println("余额不足");
    }
    @Override
    public String toString(){
        return "id:" + " " + id + " " + "name:" + name + " " + "balance:" + balance;
    }
}
