import java.util.Random;

public class AccountHolder{
   protected int ID;
   protected String address;
   public AccountHolder(int ID, String address){
      this.ID = ID;
      this.address = address;
   }
   public int getNextID(){
      Random rand = new Random();
      return rand.nextInt(1000000) + 1;
   }

}