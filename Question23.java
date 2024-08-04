//Rats in food distribution

public class Question23 {
    public static boolean isFoodAvailable(int numberOfRats, int foodPerRat, int foodAvailableInHouses[]){
        int totalFoodRequired = numberOfRats*foodPerRat;

        int totalFoodAvailable = 0;

        for(int food : foodAvailableInHouses){
            totalFoodAvailable += food;
        }
        return totalFoodAvailable >= totalFoodRequired;
    }
    public static void main(String[] args) {
        // Example data
        int numberOfRats = 10;
        int foodPerRat = 5;
        int[] foodAvailableInHouses = {20, 15, 30, 25}; 

        boolean isSufficient = isFoodAvailable(numberOfRats, foodPerRat, foodAvailableInHouses);

        if(isSufficient){
            System.out.println("Food is available for the rats");
        }else{
            System.out.println("Food is not available for the rats.");
        }
    }
}