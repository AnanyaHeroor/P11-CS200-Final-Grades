import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;
/**
 * This class represents the grading script for FinalGrades.java
 * @author Ananya Heroor
 */
public class GradeP11{
    public static void main (String[] args){
//RAW GRADES
        int A = 0; //Passed Tests
        int B = 0; //Total Tests
        int testNumber = 0; //for print statements
        int testNumberLetters = 0; //for print statements
        //TEST 1:
        testNumber++;
        double [] temp1 = {0.5,0,1};
        double [] [] grades1 = {{5,6,7},{0,0,0},{10,12,14}};
        int [] maxPoints1 = {10,12,14};
        ArrayList<Double> rawGrades1 = new ArrayList<Double>();
        for (int i = 0;i<temp1.length;i++){
            rawGrades1.add(temp1[i]);
        }
            ArrayList<Double> test1 = FinalGrades.computeRawFinalGrades(grades1,maxPoints1);
            if (rawGrades1.equals(test1)){
                System.out.println("computeRawFinalGrades: Test #"+testNumber+ " passed!");
                A++;
            } else{
                System.out.println("computeRawFinalGrades: Test #"+testNumber+ " failed!");
                
            }
            B++;
        //TEST 2:
        testNumber++;
        double [] temp2 = {0.3333333333, 0.6666666666};
        double [] [] grades2 = {{1,2,3,4},{2,4,6,8}};
        int [] maxPoints2 = {3,6,9,12};
        ArrayList<Double> rawGrades2 = new ArrayList<Double>();
        for (int i = 0;i<temp2.length;i++){
            rawGrades2.add(temp2[i]);
        }
        ArrayList<Double> test2 = FinalGrades.computeRawFinalGrades(grades2,maxPoints2);
        for (int i = 0; i<rawGrades2.size();i++){
         if (Math.abs(test2.get(i)-rawGrades2.get(i))>0.00001){
                System.out.println("computeRawFinalGrades: Test# "+testNumber+ " failed!");
            }   
        }
        System.out.println("computeRawFinalGrades: Test #"+testNumber+ " passed!");
        A++;
        B++;
        //TEST 3: 
        testNumber++;
        double [] temp3 = {0.5, 0.5, 0.5};
        double [] [] grades3 = {{0,10}, {5,5}, {7,3}};
        int [] maxPoints3 = {10,10};
        ArrayList<Double> rawGrades3 = new ArrayList<Double>();
        for (int i = 0;i<temp3.length;i++){
            rawGrades3.add(temp3[i]);
        }
        ArrayList<Double> test3 = FinalGrades.computeRawFinalGrades(grades3,maxPoints3);
        for (int i = 0; i<rawGrades3.size();i++){
         if (Math.abs(test3.get(i)-rawGrades3.get(i))>0.00001){
                System.out.println("computeRawFinalGrades: Test #"+testNumber+ " failed!");
            }   
        }
        System.out.println("computeRawFinalGrades: Test #"+testNumber+ " passed!");
        A++;
        B++;
        //TEST 4:
        testNumber++;
        double [] temp4 = {0.1, 0.5, 1.0, 0.35};
        double [] [] grades4 = {{5,1}, {10,20}, {30,30}, {11,10}};
        int [] maxPoints4 = {30,30};
        ArrayList<Double> rawGrades4 = new ArrayList<Double>();
        for (int i = 0;i<temp4.length;i++){
            rawGrades4.add(temp4[i]);
        }
        ArrayList<Double> test4 = FinalGrades.computeRawFinalGrades(grades4,maxPoints4);
        for (int i = 0; i<rawGrades4.size();i++){
         if (Math.abs(test4.get(i)-rawGrades4.get(i))>0.00001){
                System.out.println("computeRawFinalGrades: Test #"+testNumber+ " failed!");
            }   
        }
        System.out.println("computeRawFinalGrades: Test #"+testNumber+ " passed!");
        A++;
        B++;
        //TEST 5:
        testNumber++;
        double [] temp5 = {0.86896551724};
        double [] [] grades5 = {{4,10,18,19,15,39,21}};
        int [] maxPoints5 = {5,10,20,20,20,40,30};
        ArrayList<Double> rawGrades5 = new ArrayList<Double>();
        for (int i = 0;i<temp5.length;i++){
            rawGrades5.add(temp5[i]);
        }
        ArrayList<Double> test5 = FinalGrades.computeRawFinalGrades(grades5,maxPoints5);
        for (int i = 0; i<rawGrades5.size();i++){
         if (Math.abs(test5.get(i)-rawGrades5.get(i))>0.00001){
                System.out.println("computeRawFinalGrades: Test #"+testNumber+ " failed!");
            }   
        }
        System.out.println("computeRawFinalGrades: Test #"+testNumber+ " passed!");
        A++;
        B++;
        //TEST 6: more than 10 students
        testNumber++;
        double [] temp6 = {0.21428571428571427, 0.5357142857142857, 0.6428571428571429, 0.32142857142857145, 0.6428571428571429, 0.6071428571428571, 0.42857142857142855, 0.8571428571428571, 0.8214285714285714, 0.75, 0.39285714285714285};
        double [] [] grades6 = {{1,2,3},{4,5,6},{8,6,4},{3,2,4},{7,6,5},{6,3,8},{4,4,4},{7,8,9},{9,10,4},{9,9,3},{8,2,1}};
        int [] maxPoints6 = {9,10,9};
        ArrayList<Double> rawGrades6 = new ArrayList<Double>();
        for (int i = 0;i<temp6.length;i++){
            rawGrades6.add(temp6[i]);
        }
        ArrayList<Double> test6 = FinalGrades.computeRawFinalGrades(grades6,maxPoints6);
        for (int i = 0; i<rawGrades6.size();i++){
         if (Math.abs(test6.get(i)-rawGrades6.get(i))>0.00001){
                System.out.println("computeRawFinalGrades: Test #"+testNumber+ " failed!");
            }   
        }
        System.out.println("computeRawFinalGrades: Test #"+testNumber+ " passed!");
        A++;
        B++;
        //TEST 7: more than 8 assignments
        testNumber++;
        double [] temp7 = {0.5222222222222223, 0.5777777777777777};
        double [] [] grades7 = {{10,9,7,2,0,1,4,5,9},{9,9,4,6,7,8,4,3,2}};
        int [] maxPoints7 = {10,10,10,10,10,10,10,10,10};
        ArrayList<Double> rawGrades7 = new ArrayList<Double>();
        for (int i = 0;i<temp7.length;i++){
            rawGrades7.add(temp7[i]);
        }
        ArrayList<Double> test7 = FinalGrades.computeRawFinalGrades(grades7,maxPoints7);
        for (int i = 0; i<rawGrades7.size();i++){
         if (Math.abs(test7.get(i)-rawGrades7.get(i))>0.00001){
                System.out.println("computeRawFinalGrades: Test #"+testNumber+ " failed!");
            }   
        }
        System.out.println("computeRawFinalGrades: Test #"+testNumber+ " passed!");
        A++;
        B++;
        //TEST 8: my choice
        testNumber++;
        double [] temp8 = {0.95, 0.85, 0.2, 0.35};
        double [] [] grades8 = {{10,9},{8,9},{4,0},{3,4}};
        int [] maxPoints8 = {10,10};
        ArrayList<Double> rawGrades8 = new ArrayList<Double>();
        for (int i = 0;i<temp8.length;i++){
            rawGrades8.add(temp8[i]);
        }
        ArrayList<Double> test8 = FinalGrades.computeRawFinalGrades(grades8,maxPoints8);
        for (int i = 0; i<rawGrades8.size();i++){
         if (Math.abs(test8.get(i)-rawGrades8.get(i))>0.00001){
                System.out.println("computeRawFinalGrades: Test #"+testNumber+ " failed!");
            }   
        }
        System.out.println("computeRawFinalGrades: Test #"+testNumber+ " passed!");
        A++;
        B++;
        //TEST 9: my choice
        testNumber++;
        double [] temp9 = {0.45, 0.55, 0.5, 0.3};
        double [] [] grades9 = {{0,3,4,2},{2,2,4,3},{1,2,3,4},{3,2,1,0}};
        int [] maxPoints9 = {5,5,5,5};
        ArrayList<Double> rawGrades9 = new ArrayList<Double>();
        for (int i = 0;i<temp9.length;i++){
            rawGrades9.add(temp9[i]);
        }
        ArrayList<Double> test9 = FinalGrades.computeRawFinalGrades(grades9,maxPoints9);
        for (int i = 0; i<rawGrades9.size();i++){
         if (Math.abs(test9.get(i)-rawGrades9.get(i))>0.00001){
                System.out.println("computeRawFinalGrades: Test #"+testNumber+ " failed!");
            }   
        }
        System.out.println("computeRawFinalGrades: Test #"+testNumber+ " passed!");
        A++;
        B++;
        System.out.println("computeRawFinalGrades: Total number passed: "+A+"/"+B);
//LETTER GRADES
        //TEST 1:
        testNumberLetters++;
        String [] expected1 = {"B","C","A"};
        String [] letters1 = {"A","B","C","F"};
        ArrayList<Double> rawGradesL1 = new ArrayList<Double>();
        rawGradesL1.add(0.5);
        rawGradesL1.add(0.0);
        rawGradesL1.add(1.0);
        int [] breakdown1 = {1,1,1};
        String[] tester1 = FinalGrades.computeLetterGrades(rawGradesL1,letters1,breakdown1);
         if (Arrays.equals(tester1,expected1)){
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " passed!");
        } else{
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " failed!");
        }
        //TEST 2:
        testNumberLetters++;
        String [] expected2 = {"AB" , "A" , "D" , "A"};
        String [] letters2 = {"A" , "AB" , "B" ,"D" , "F" };
        ArrayList<Double> rawGradesL2 = new ArrayList<Double>();
        rawGradesL2.add(0.95);
        rawGradesL2.add(0.99);
        rawGradesL2.add(0.55);
        rawGradesL2.add(0.98);
        int [] breakdown2 = {2,1,0,1};
        String[] tester2 = FinalGrades.computeLetterGrades(rawGradesL2,letters2,breakdown2);
         if (Arrays.equals(tester2,expected2)){
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " passed!");
        } else{
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " failed!");
        }
        //TEST 3:
        testNumberLetters++;
        String [] expected3 = {"AB" , "A" , "F" , "A"};
        String [] letters3 = {"A" , "AB" , "B" ,"D" , "F" };
        ArrayList<Double> rawGradesL3 = new ArrayList<Double>();
        rawGradesL3.add(0.95);
        rawGradesL3.add(0.99);
        rawGradesL3.add(0.55);
        rawGradesL3.add(0.98);
        int [] breakdown3 = {2,1,0,0};
        String[] tester3 = FinalGrades.computeLetterGrades(rawGradesL3,letters3,breakdown3);
         if (Arrays.equals(tester3,expected3)){
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " passed!");
        } else{
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " failed!");
        }
        //TEST 4:
        testNumberLetters++;
        String [] expected4 = {"LL" , "Q" , "X" , "Q" };
        String [] letters4 = {"X" , "Q" , "LL"};
        ArrayList<Double> rawGradesL4 = new ArrayList<Double>();
        rawGradesL4.add(0.1);
        rawGradesL4.add(0.2);
        rawGradesL4.add(0.3);
        rawGradesL4.add(0.15);
        int [] breakdown4 = {1,2};
        String[] tester4 = FinalGrades.computeLetterGrades(rawGradesL4,letters4,breakdown4);
         if (Arrays.equals(tester4,expected4)){
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " passed!");
        } else{
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " failed!");
        }
        //TEST 5:
        testNumberLetters++;
        String [] expected5 = {"X" , "X" , "X" , "X"};
        String [] letters5 = {"X" , "Q" , "LL"};
        ArrayList<Double> rawGradesL5 = new ArrayList<Double>();
        rawGradesL5.add(0.1);
        rawGradesL5.add(0.2);
        rawGradesL5.add(0.3);
        rawGradesL5.add(0.15);
        int [] breakdown5 = {4,0};
        String[] tester5 = FinalGrades.computeLetterGrades(rawGradesL5,letters5,breakdown5);
         if (Arrays.equals(tester5,expected5)){
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " passed!");
        } else{
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " failed!");
        }
        //TEST 6:
        testNumberLetters++;
        String [] expected6 = {"Q" , "Q" , "Q" , "Q"};
        String [] letters6 = {"X" , "Q" , "LL"};
        ArrayList<Double> rawGradesL6 = new ArrayList<Double>();
        rawGradesL6.add(0.1);
        rawGradesL6.add(0.2);
        rawGradesL6.add(0.3);
        rawGradesL6.add(0.15);
        int [] breakdown6 = {0,4};
        String[] tester6 = FinalGrades.computeLetterGrades(rawGradesL6,letters6,breakdown6);
         if (Arrays.equals(tester6,expected6)){
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " passed!");
        } else{
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " failed!");
        }
        //TEST 7:
        testNumberLetters++;
        String [] expected7 = {"LL" , "LL" , "LL" , "LL"};
        String [] letters7 = {"X" , "Q" , "LL"};
        ArrayList<Double> rawGradesL7 = new ArrayList<Double>();
        rawGradesL7.add(0.1);
        rawGradesL7.add(0.2);
        rawGradesL7.add(0.3);
        rawGradesL7.add(0.15);
        int [] breakdown7 = {0,0};
        String[] tester7 = FinalGrades.computeLetterGrades(rawGradesL7,letters7,breakdown7);
         if (Arrays.equals(tester7,expected7)){
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " passed!");
        } else{
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " failed!");
        }
        //TEST 8: more than 10 students + more than 5 grades (11 students, 6 grades)
        testNumberLetters++;
        String [] expected8 = {"D", "C", "B", "C", "D", "BC", "C", "A", "AB", "AB", "AB"}; 
        String [] letters8 = {"A" , "AB" , "B","BC","C","D"};
        ArrayList<Double> rawGradesL8 = new ArrayList<Double>();
        rawGradesL8.add(0.25);
        rawGradesL8.add(0.625);
        rawGradesL8.add(0.75);
        rawGradesL8.add(0.3);
        rawGradesL8.add(0.75);
        rawGradesL8.add(0.714);
        rawGradesL8.add(0.5);
        rawGradesL8.add(1.0);
        rawGradesL8.add(0.96);
        rawGradesL8.add(0.87);
        rawGradesL8.add(0.90);
        int [] breakdown8 = {1,4,1,1,3};
        String[] tester8 = FinalGrades.computeLetterGrades(rawGradesL8,letters8,breakdown8);
         if (Arrays.equals(tester8,expected8)){
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " passed!");
        } else{
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " failed!");
        }
        //TEST 9: more than 10 students + more than 5 grades (11 students, 7 grades)
        testNumberLetters++;
        String [] expected9 = {"A", "A", "F", "C", "D", "BC", "F", "B", "A","F","AB"}; 
        String [] letters9 = {"A", "AB", "B","BC","C","D","F"};
        ArrayList<Double> rawGradesL9 = new ArrayList<Double>();
        rawGradesL9.add(0.9);
        rawGradesL9.add(0.8);
        rawGradesL9.add(0.7);
        rawGradesL9.add(0.75);
        rawGradesL9.add(0.73);
        rawGradesL9.add(0.76);
        rawGradesL9.add(0.71);
        rawGradesL9.add(0.77);
        rawGradesL9.add(0.82);
        rawGradesL9.add(0.80);
        rawGradesL9.add(0.79);
        int [] breakdown9 = {4,1,1,1,1,1,};
        String[] tester9 = FinalGrades.computeLetterGrades(rawGradesL9,letters9,breakdown9);
         if (Arrays.equals(tester9,expected9)){
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " passed!");
        } else{
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " failed!");
        }
        //TEST 10: more than 10 students + more than 5 grades (12 students, 6 grades)
        testNumberLetters++;
        String [] expected10 = {"V", "U", "T", "T", "T", "T","S","R","Q","Q","Q","S"}; 
        String [] letters10 = {"Q", "R", "S","T","U","V"};
        ArrayList<Double> rawGradesL10 = new ArrayList<Double>();
        rawGradesL10.add(0.1);
        rawGradesL10.add(0.2);
        rawGradesL10.add(0.3);
        rawGradesL10.add(0.4);
        rawGradesL10.add(0.5);
        rawGradesL10.add(0.6);
        rawGradesL10.add(0.7);
        rawGradesL10.add(0.8);
        rawGradesL10.add(0.9);
        rawGradesL10.add(0.92);
        rawGradesL10.add(0.95);
        rawGradesL10.add(0.73);
        int [] breakdown10 = {3,1,2,4,1};
        String[] tester10 = FinalGrades.computeLetterGrades(rawGradesL10,letters10,breakdown10);
         if (Arrays.equals(tester10,expected10)){
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " passed!");
        } else{
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " failed!");
        }
        //TEST 11: more than 10 students + more than 5 grades (12 students, 7 grades)
        testNumberLetters++;
        String [] expected11 = {"YX", "YX", "XY", "Y", "X", "X","ZX", "ZZ","X","X","X","ZX"}; 
        String [] letters11 = {"X", "Y", "Z","XY","YX","ZX","ZZ"};
        ArrayList<Double> rawGradesL11 = new ArrayList<Double>();
        rawGradesL11.add(0.80);
        rawGradesL11.add(0.81);
        rawGradesL11.add(0.82);
        rawGradesL11.add(0.83);
        rawGradesL11.add(0.95);
        rawGradesL11.add(0.96);
        rawGradesL11.add(0.77);
        rawGradesL11.add(0.80);
        rawGradesL11.add(0.91);
        rawGradesL11.add(0.85);
        rawGradesL11.add(0.90);
        rawGradesL11.add(0.60);
        int [] breakdown11 = {5,1,0,1,3,2};
        String[] tester11 = FinalGrades.computeLetterGrades(rawGradesL11,letters11,breakdown11);
         if (Arrays.equals(tester11,expected11)){
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " passed!");
        } else{
                System.out.println("computeLetterGrades: Test #"+testNumberLetters+ " failed!");
        }



        

        


    }
        

    
}