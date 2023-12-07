import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Family {
    private int bbCount;
    private int gbCount;
    private int ggCount;
    public void readAndInitialize(String filename){
        File file = new File(filename);
        try {
            Scanner input  = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                if (line.equals("BB")) {
                    bbCount++;
                } else if (line.equals("GB")) {
                    gbCount++;
                } else if (line.equals("GG")) {
                    ggCount++;
                }
            }
        }
        catch(FileNotFoundException e){

        }
    }
    public void displayResults(){
        int totalNumFamilies = bbCount + gbCount + ggCount;
        double twoBoysPercent = bbCount / (double)totalNumFamilies;
        double twoGirlsPercent = ggCount/ (double)totalNumFamilies;
        double oneBoyOneGirlPercent = gbCount/(double)totalNumFamilies;
        System.out.println(bbCount);
        System.out.println(gbCount);
        System.out.println(ggCount);
        System.out.println("Total Number of Families: " + totalNumFamilies);
        System.out.println("Number of families with:");
        System.out.println("2 Boys: '" + bbCount + "' represents " + twoBoysPercent + " %");
        System.out.println("2 Girls: '" + ggCount + "' represents " + twoGirlsPercent + " %");
        System.out.println("1 Boy & 1 Girl: '" + gbCount + "' represents " + oneBoyOneGirlPercent + " %");
    }
    public static void main(String[] args){
        Family myFamily = new Family();
        myFamily.readAndInitialize("test2.txt");
        myFamily.displayResults();


    }
}
