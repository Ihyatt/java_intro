public class And {
	public static void main(String[] args) {

		System.out.println(1 < 2 && 3 < 4);
		
	}
}

public class Or {
	public static void main(String[] args) {

		System.out.println(4 > 4 || 1 < 3);
		
	}
}


public class Not {
	public static void main(String[] args) {

		System.out.println(!false);
		System.out.println(!(5 >= 1));
		
	}
}

public class Precedence {
	public static void main(String[] args) {

		boolean riddle = !( 1 < 8 || (5 > 2 && 3 < 5));
		System.out.println(riddle);

	}
}

public class If {
	public static void main(String[] args) {

		if (2 > 1) {

			System.out.println("Access granted.");

		}
		
	}
}

public class IfElse {
	public static void main(String[] args) {

		if (7 < 7) {

			System.out.println("Try again...");

		} else {

			System.out.println("Success!");

		}
		
	}
}

public class IfElseIf {
	public static void main(String[] args) {

		int round = 5;

		if (round > 12) {

			System.out.println("The match is over!");

		} else if (round > 0) {

			System.out.println("The match is underway!");

		}	else {

			System.out.println("The boxing match hasn't started yet.");

		}	
	}
}

public class Ternary {
	public static void main(String[] args) {
		
		int fuelLevel = 3;

		char canDrive = (fuelLevel > 0) ? 'Y' : 'N';
		System.out.println(canDrive);

	}
}

public class Switch {
	public static void main(String[] args) {
		
		char penaltyKick = 'L';

		switch (penaltyKick) {

			case 'L': System.out.println("Messi shoots to the left and scores!");
								break; 
			case 'R': System.out.println("Messi shoots to the right and misses the goal!");
								break;
			case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
								break;
			default:
				System.out.println("Messi is in position...");

		}

	}
}


public class Switch {
	public static void main(String[] args) {
		
		char penaltyKick = 'L';

		switch (penaltyKick) {

			case 'L': System.out.println("Messi shoots to the left and scores!");
								break; 
			case 'R': System.out.println("Messi shoots to the right and misses the goal!");
								break;
			case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
								break;
			default:
				System.out.println("Messi is in position...");

		}

	}
}



