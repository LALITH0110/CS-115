public class DieGame {
	public static void main(String[] args) {
	// add your code here
		Die player1 = new Die();
		Die player2 = new Die();
		
		player1.roll();
		int player1Value1 = (player1.getSide());
		
		player1.roll();
		int player1Value2 = (player2.getSide());
		
		player2.roll();
		int player2Value1 = (player1.getSide());
		
		player2.roll();
		int player2Value2 = (player2.getSide());
		
		System.out.println(player1Value1 + " " + player1Value2);
		System.out.println(player2Value1 + " " + player2Value2);
		System.out.println(Winner(player1Value1,player1Value2,player2Value1,player2Value2));
	
	}
	
	public static String Winner(int player1Value1,int player1Value2,int player2Value1,int player2Value2) {
	
		int player1WinCount = 0;
		int player2WinCount = 0;
		
		if (player1Value1>player2Value1){
			player1WinCount = player1WinCount + 1;
		}
		else if(player1Value1==player2Value1) {
			player1WinCount=player1WinCount+0;
		}
		else {
			player2WinCount=player2WinCount+1;
		}
		
		if(player1Value2>player2Value2) {
			player1WinCount=player1WinCount+1;
		}
		else if(player1Value2==player2Value2) {
			player1WinCount=player1WinCount+0;
		}
		else {
			player2WinCount=player2WinCount+1;
		}
		return (player1WinCount+" "+player2WinCount);

		}
		
	}