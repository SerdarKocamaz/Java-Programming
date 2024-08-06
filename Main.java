package abstractClasses;

public abstract class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WomanGameCalculator womenGameCalculater = new WomanGameCalculator();
		womenGameCalculater.calculate();
		womenGameCalculater.gameOver();

		GameCalculator manGameCalculater = new ManGameCalculator();

	/*	GameCalculator gameCalculator = new GameCalculator() {
			@Override
			public void calculate() {                             
				
			}
		};*/
	}

}
