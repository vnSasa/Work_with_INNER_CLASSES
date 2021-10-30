package ua.yaremechko.lesson17;

public class PersonFactory {

	private class SportsMan implements Personable {

		@Override
		public void eat() {
			System.out.println("Sportsman is eatig");
		}

		@Override
		public void move() {
			System.out.println("sportsman is moving");
		}

		@Override
		public void sleep() {
			System.out.println("sportsman is sleeping");
		}

	}

	public SportsMan createSportsMan() {
		return new SportsMan();
	}

	public Personable createHouseWifeLocal() {
		class HouseWife implements Personable {

			@Override
			public void eat() {
				System.out.println("HouseWife is eating");
			}

			@Override
			public void move() {
				System.out.println("HouseWife is moving");
			}

			@Override
			public void sleep() {
				System.out.println("HouseWife is sleeping");
			}

		}

		return new HouseWife();

	}
	
	public Personable createAnonymous() {
		return new Personable() {
			
			@Override
			public void eat() {
				System.out.println("Anonymous is eating");
			}

			@Override
			public void move() {
				System.out.println("Anonymous is moving");
			}

			@Override
			public void sleep() {
				System.out.println("Anonymous is sleeping");
			}
		};
	}

	private static class GolfPlayer implements Personable {

		@Override
		public void eat() {
			System.out.println("GolfPlayer is eating");
		}

		@Override
		public void move() {
			System.out.println("GolfPlayer is moving");
		}

		@Override
		public void sleep() {
			System.out.println("GolfPlayer is sleeping");
		}
		
	}
	
	public static GolfPlayer createGolfPlayer() {
		return new GolfPlayer();
	}
	
	
}
