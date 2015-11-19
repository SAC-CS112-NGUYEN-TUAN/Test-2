import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Dice throwing = new Dice();
		Scanner input = new Scanner(System.in);
		int award = 0;
		String again;
		
	do{
				
		System.out.println("Insert dices  : ");
			int d = input.nextInt();	
		
			String mg = throwing.Throw(d);
			System.out.println("throwing result:" + mg);//debug
		
		System.out.println("your guess Hi or Lo  : ");
			String g = input.next();	
			System.out.println("your guess is  : " + g);//debug
		
			
			if ( g.equals(mg)){award ++;
			System.out.println("Player win, your current score is :"+ award);
		
			}
					
			else {award--;
			System.out.println("Player lose, your current score is :"+ award);
		
			}
		
		System.out.println("Do you want to play again ? Y/N");
		again = input.next();
	}while( again.equals("Y"));		
	}
}
