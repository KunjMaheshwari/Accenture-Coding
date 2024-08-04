public class Question38 {
    public static int maxParking(char ch[], int n){
        int maxCars = 0;
        int consecutiveParking = 0;

        for(int i=0;i<ch.length;i++){
            if(ch[i] == 'S'){
                consecutiveParking ++;
            }else{
                maxCars += consecutiveParking/2;
                consecutiveParking = 0;
            }
        }
        maxCars += consecutiveParking/2;
        return maxCars;
    }
    public static void main(String[] args) {
        char[] parkingLot = {'S', 'S', 'X', 'S', 'S', 'S', 'X', 'S', 'S', 'S', 'S'};
        int n = parkingLot.length;


        System.out.println(maxParking(parkingLot, n));
    }
}