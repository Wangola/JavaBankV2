public abstract class AbstractBankAccount {
  public final String BANK= "JavaBank";
  // class variables
  String accountName;
  int accountNum;
  int balance;


  AbstractBankAccount(String name, int num, int amt) {
    accountName = name;
    accountNum = num;
    balance = amt;
  }


  public abstract void deposit(int amt);

  //make a withdrawal from the balance
  public void withdraw(int amt) {
    balance = balance - amt;
  }

  // Methods from interface
  public int getBalance() { return balance; }

  public String getBankName() { return InterfaceBankAccount.BANK; }

  //modifier to set the accountname
  public void setAccountName(String name) {
    accountName = name;
  }

  //modifier to set the accountnumber
  public void setAccountNum(int num) {
    accountNum = num;
  }

  //modifier to set the balance
  public void setBalance(int num) {
    balance = num;
  }

  //accessor to get the accountname
  public String getAccountName() { return accountName; }

  //accessor to get the accountnumber
  public int getAccountNum() { return accountNum; }

  @Override
  public String toString()
  {
    return "\n\nBank Name : " + getBankName() +
        "\nAccount Holder : " + accountName +
        "\nAccount Number : " + accountNum +
        "\nAccount balance: " + balance;
  }//end method toString


}//end class AbstractBankAccount
