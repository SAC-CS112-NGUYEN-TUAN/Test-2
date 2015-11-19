
public class Dice {
			
			
		public String Throw(int dices){
			String result;
			int randomnum = 0;
			for ( int e = 0; e < dices;e++){
			
				{
				randomnum += 1 + (int) (Math.random()*6);
				}
			}
			if (randomnum > (dices*6)/2){result = "Hi";
			}
			else {result = "Lo";
			}
			System.out.println("random number: "+ randomnum);//debug
			return result;
		}
}
