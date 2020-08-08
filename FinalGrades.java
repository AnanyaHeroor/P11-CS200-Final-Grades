import java.util.ArrayList;
import java.util.Arrays;
/**
 * This class computes the final grades for everyone in the course
 * @author Ananya Heroor
 */
public class FinalGrades{
    public static void main (String[] args){
    // double [][] grades = {{5,6,7},{0,0,0},{10,12,14}};
    // int [] maxPoints = {10,12,14};
    // double [][] grades = {{1,2,3,4},{2,4,6,8}};
    // int [] maxPoints = {3,6,9,12};
    // double [][] grades = {{0,10},{5,5},{7,3}};
    // int [] maxPoints = {10,10};
    // double [][] grades = {{5,1},{10,20},{30,30},{11,10}};
    // int [] maxPoints = {30,30};
    // double [][] grades = {{4,10,18,19,15,39,21}};
    // int [] maxPoints = {5,10,20,20,20,40,30};
    // double [] [] grades = {{1,2,3},{4,5,6},{8,6,4},{3,2,4},{7,6,5},{6,3,8},{4,4,4},{7,8,9},{9,10,4},{9,9,3}};
    // int [] maxPoints = {7,8,9};
    // double [] [] grades = {{10,9,7,2,0,1,4,5,9},{9,9,4,6,7,8,4,3,2}};
    // int [] maxPoints = {10,10,10,10,10,10,10,10,10};
    // double [] [] grades = {{10,9},{8,9},{4,0},{3,4}};
    // int [] maxPoints = {10,10};
    // double [] [] grades = {{0,3,4,2},{2,2,4,3},{1,2,3,4},{3,2,1,0}};
    // int [] maxPoints = {5,5,5,5};
    // double [] [] grades = {{1,2,3},{4,5,6},{8,6,4},{3,2,4},{7,6,5},{6,3,8},{4,4,4},{7,8,9},{9,10,4},{9,9,3},{8,2,1}};
    // int [] maxPoints = {7,8,9};
    // double [] [] grades = {{10,9,7,2,0,1,4,5,9},{9,9,4,6,7,8,4,3,2}};
    // int [] maxPoints = {10,10,10,10,10,10,10,10,10};
    // double [] [] grades = {{10,9},{8,9},{4,0},{3,4}};
    // int [] maxPoints = {10,10};
    // double [] [] grades = {{0,3,4,2},{2,2,4,3},{1,2,3,4},{3,2,1,0}};
    // int [] maxPoints = {5,5,5,5};
    // double [] [] grades = {{1,2,3},{4,5,6},{8,6,4},{3,2,4},{7,6,5},{6,3,8},{4,4,4},{7,8,9},{9,10,4},{9,9,3},{8,2,1}};
    // int [] maxPoints = {9,10,9};

    // System.out.println(computeRawFinalGrades(grades,maxPoints));
    // double [] temp = {0.8,0.81,0.82,0.83,0.95,0.96,0.77,0.80,0.91,0.85,0.90,0.60};
    // double [] temp = {0.95,0.99,0.55,0.98};
    // double [] temp = {0.1,0.2,0.3,0.15};
    // ArrayList<Double> rawGrades = new ArrayList<Double>();
    // for (int i = 0;i<temp.length;i++){
    //     rawGrades.add(temp[i]);
    // }
    // String [] letters = {"X", "Y", "Z","XY","YX","ZX","ZZ"};
    // // String [] letters = {"A", "AB", "B", "D", "F"};
    // // String [] letters = {"X","Q","LL"};
    // int [] breakdown = {5,1,0,1,3,2};
    // int [] breakdown = {2,1,0,1};
    // int [] breakdown = {2,1,0,0};
    // int [] breakdown = {1,2};
    // int [] breakdown = {4,0};
    // int [] breakdown = {0,4};
    // int [] breakdown = {0,0};
    // String [] r= computeLetterGrades(rawGrades,letters,breakdown);
    // System.out.println(Arrays.toString(r));
    }
    /**
     * This function computes raw scores for each student in the course
     */
    public static ArrayList<Double> computeRawFinalGrades(double[][] grades, int[] maxPoints){
        ArrayList<Double> rawGrades = new ArrayList <Double>();
        for (int i = 0; i<grades.length;i++){
            double tempRawGrades = 0.0;
            double tempMaxGrades = 0.0;
            for (int j = 0; j<grades[i].length;j++){
                tempRawGrades+=grades[i][j];
                tempMaxGrades+=maxPoints[j];
            }
            rawGrades.add(i, tempRawGrades/tempMaxGrades);
        }
        return rawGrades;
    }
    /**
     * This function computes raw letter grades for each student in the course
     */
    public static String [] computeLetterGrades(ArrayList<Double> rawGrades, String[] letters, int[] breakdown){
        String [] finalLetterGrades = new String [rawGrades.size()];
        Double [] sortedRawGrades = new Double[rawGrades.size()];
        sortedRawGrades = rawGrades.toArray(sortedRawGrades);
        Arrays.sort(sortedRawGrades);
        int j=rawGrades.size()-1;
        int c = 0;
        for(int i=0; i<breakdown.length; i++) {
            c = breakdown[i];
            while(c > 0){
                int s = rawGrades.indexOf(sortedRawGrades[j]);
                finalLetterGrades[s] = letters[i];
                c-=1;
                j-=1;
            }
        }
        for(int i=0; i<finalLetterGrades.length; i++){
                if(finalLetterGrades[i] == null) {
                    finalLetterGrades[i] = letters[letters.length-1];
                 }
            }
            return finalLetterGrades;
        }
}