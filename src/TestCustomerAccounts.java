public class TestCustomerAccounts {

  public static void main(String[] args) {

    AbstractBankAccount[] bankAccounts = new
        AbstractBankAccount[5];

    // Instantiate 2 credit accounts using constructor with
    bankAccounts[0] = new Account("Sanjay Gupta", 11556, 300);
    bankAccounts[1] = new Account("He Xai", 22338, 500);
    bankAccounts[2] = new Account("Ilya Mustafana", 44559, 1000);
// Instantiate 2 credit accounts using constructor with
    bankAccounts[3] = new CreditAccount("A.N Other", 88776, 500);
    bankAccounts[4] = new CreditAccount("Another", 66778, 1000, 500);

    showAllCustomerAccounts(bankAccounts);
    showAllAccounts(bankAccounts);
    showAllCreditAccounts(bankAccounts);


  }//end method main

  public static void showAllCustomerAccounts(AbstractBankAccount[]
      bankAccounts) {
    System.out.print("\nAll Customer Accounts******");
    for (AbstractBankAccount act : bankAccounts) {
      System.out.println(act);
    }
    //endfor
  }//end method showAllCustomerAccounts

  public static void showAllAccounts(AbstractBankAccount[] bankAccounts) {
    System.out.print("\nAll Account types******");
    for (AbstractBankAccount act : bankAccounts) {
      if (act instanceof Account) {
        System.out.println(act);
      }
    }
    //endfor
  }//end method getAllAccounts

  public static void showAllCreditAccounts(AbstractBankAccount[]
      bankAccounts) {
    System.out.print("\nAll Credit Account types******");
    for(AbstractBankAccount act: bankAccounts)
      if (act instanceof CreditAccount)
        System.out.println(act);
//endif
//endfor
  }//end method getAllCreditAccounts


}//end class TestCustomerAccounts

