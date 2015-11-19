
public class Dice {
			
			
		public String Throw(int dices, int bounces){
			String result;
			int randomnum = 0;
			for ( int e = 0; e < dices;e++){
			
				for ( int i = 0; i < bounces;i++){
				randomnum += 1 + (int) (Math.random()*6);
				}
			}
			if (randomnum > (dices * bounces*6)/2){result = "Hi";
			}
			else {result = "Lo";
			}
			return result;
		}
}
