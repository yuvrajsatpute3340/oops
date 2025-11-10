package Class_demo;

        public class Car {

			public static void main(String[] args) {
				String colour = "white";
				String model = "Hondaii";
				int year = 2025;
				
				System.out.println("car model:" + model);
				System.out.println("year:" + year);
				System.out.println("colour:" + colour);
				System.out.println("-----------------");

				class Second {
					String colour = "red";
					String model = "Bajaj";
					int year = 2024;
				}

				Second car2 = new Second();
				System.out.println("Second model:" + car2.model);
				System.out.println("year:" + car2.year);
				System.out.println("colour:" + car2.colour);
			}

		}



		


