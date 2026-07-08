package encapsulation;

public class internetBankCall {
		   public static void main(String[] args) {
		      internetBank IB = new internetBank();
		      IB.setUserID(0);
		      System.out.println("You User ID is : " + IB.getUserID());
		      IB.setWithDrawing(522);
		      System.out.println("The amount of " + IB.getWithDrawing() + " is Withdrawing.......");
		   }
		}

