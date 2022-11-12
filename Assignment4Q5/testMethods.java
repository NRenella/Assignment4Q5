public class testMethods{

   public static void main(String args[]){
      AccountHolder h1 = new AccountHolder(91010,"Noah Street");
      AccountHolder h2 = new AccountHolder(89052,"Andre Alley");
      
      Account noahs = new Account(200, h1);
      noahs.withdraw(100);
      noahs.deposit(11);
      System.out.println(noahs.getBalance());
      
      IndividualHolder comp = new IndividualHolder(91010, "test road", "Big Company", "8905223");
      System.out.println(comp.getName());
      System.out.println(comp.getSSN());
      comp.setName("nice try");
      comp.setSSN("1234567");
      System.out.println(comp.convertNameUpperCase("test road"));
      System.out.println(comp.getSSN());
      
      CorporateHolder comp2 = new CorporateHolder(91010, "test road", "555-555-5555");
      System.out.println(comp2.getContact());
      System.out.println(comp2.ID);
      comp2.setContact("888-888-8888");
      System.out.println(comp2.getContact());
   }

}