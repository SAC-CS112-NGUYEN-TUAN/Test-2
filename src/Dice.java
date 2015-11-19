
public class Dice {
			
	private String result;
	private int randomnum = 0;
		
			public String Throw(int dices){
			
			for ( int i = 0; i < dices;i++){
				randomnum += 1 + (int) (Math.random()*6);
			}
			
			if (randomnum > (dices*6)/2){result = "hi";
			}
			
			else {result = "lo";
			}
			
			System.out.println("random number: "+ randomnum);//debug
			return result;
		}
}
