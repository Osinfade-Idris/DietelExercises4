public class LoopingTable {
    public static void main(String[] args) { // begin the main method
        int counter=1; // initialize variables


        System.out.printf("N\t10*N\t100*N\t1000*N\n\n", counter, counter*10,
                counter*100, counter*1000); // display header

        while (counter <=5){
            // loop five times, 1 to 5
            System.out.printf("%d\t%d\t%d\t%d\n", counter, counter*10, counter*100,
                    counter*1000); // display the table of values
            counter++;
        }
    }
}
