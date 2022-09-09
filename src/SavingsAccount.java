import java.util.Random;

public class SavingsAccount {
    long accountNumber;
    String accountHolderName;
    String accountStatus;
    long bankBalance;
    int age;
    public long getAccountNumber(){
        long randomNum;
        Random ran = new Random();
        randomNum = ran.nextLong();
        return  randomNum;

    }

    public String checkAccountStatus(){
        return accountStatus;
    }

    public long checkAccountBalance(){
        return bankBalance;
    }
    public String checkAge(int age){
        String result = "";
        if (age >= 18){
            result = "Eligible for Account";
        } else {
            result = "Not Eligible for Account";
        }
        return result;
    }
    public float withdraw(float bankBalance, float witdraamount ){
        float finalBalance= bankBalance - witdraamount;
        return finalBalance;
    }

    public float deposit(float bankBalance, float depositamount){
        float finalBalance= bankBalance + depositamount;
        return finalBalance;
    }

    public float transfer(float bankBalance, float transferamount) {
        float finalBalance = bankBalance -transferamount;
        return finalBalance;
    }
}

