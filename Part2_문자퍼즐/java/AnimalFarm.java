
public class AnimalFarm {
	public static Object animalFarmQuiz() {
		final String pig = "length: 10";
		final String dog = "length: " + pig.length();
		return "Animals are equal: " + pig == dog;
	}
	public static Object animalFarmSolution() {
		final String pig = "length: 10";
		final String dog = "length: " + pig.length();
		return "Animals are equal: " + pig.equals(dog);
	}
	public static void main(String[] args) {
		System.out.println("Quiz");
		System.out.println(AnimalFarm.animalFarmQuiz().toString());
		System.out.println();
		
		System.out.println("Solution");
		System.out.println(AnimalFarm.animalFarmSolution().toString());
		System.out.println();
	}
}
