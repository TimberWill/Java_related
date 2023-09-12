package com.thread.syn;

/**
 * 作者：whl
 * 日期：2023-09-12 10:47
 * 描述：不安全的取钱，两个人取钱
 */
public class UnsafeBank {
    public static void main(String[] args) {
        //创建共同的账户
        Account account = new Account(100, "结婚基金");

        WithdrawMoney you = new WithdrawMoney(account, 50, "你");
        WithdrawMoney wife = new WithdrawMoney(account, 100, "老婆");

        you.start();
        wife.start();
    }

}

//账户（继承Thread，是因为不涉及多个线程操作同一个对象）
class Account extends Thread {
    int balance;//余额
    String name;//卡名

    public Account(int balance, String name){
        this.balance = balance;
        this.name = name;
    }

}

//银行，模拟取款
class WithdrawMoney extends Thread {
    Account account;//账户
    int withdrawMoney;//取了多少钱
    int nowMoney;//现在手里还有多少钱

    public WithdrawMoney(Account account, int withdrawMoney, String name){
        super(name);//传入父类的名字
        this.account = account;
        this.withdrawMoney = withdrawMoney;
    }

    //取钱：重写run方法
    @Override
    public void run() {

        synchronized (account){
            if (account.balance - withdrawMoney <0){
                System.out.println(Thread.currentThread().getName() + "钱不够，取不了钱。");
                return;
            }

            //模拟延时
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //卡内余额：
            account.balance = account.balance - withdrawMoney;
            //手里有的钱：
            nowMoney = nowMoney + withdrawMoney;

            System.out.println(account.name + "卡内剩余金额：" + account.balance);
            //this.getName() = Thread.currentThread().getName()
            System.out.println(this.getName() +"手中金额：" + nowMoney);
        }

    }
}