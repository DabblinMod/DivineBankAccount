public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
  private double interestRate;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
  }

  public void getAccountInformation(){
    System.out.println("Money in account: " + this.getBalance());
    System.out.println("Next Month's Interest: " + this.calculateNextMonthInterest());

  }

  private int getBalance(){
    return this.balance;
  }

  // Write the calculateNextMonthInterest() here
  private double calculateNextMonthInterest(){
    return this.balance * this.interestRate;
  }
  
  public void withdraw(int takeMoney){//removing money from bank
	  this.balance -= takeMoney;
	  System.out.println("Your balance is: " +this.getBalance());
  }
  
  public void addBalance(int adding){//adding balance money
	  this.balance += adding;
	  System.out.println("Your balance is: " +this.getBalance());
  }
}