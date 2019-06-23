package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread
                        	cal.calculateCalories(bread);
                        	
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread & jam
                        	cal.calcuateCalories(bread, jam);
                        	System.out.println();
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for  bread,jam & butter
                        	cal.calculateCalories(bread,jam,butter);
                        	System.out.println();
                        	break;
                        }
                        //System.out.printf("%.3f",ca.calculateEnergy());
                        //System.out.println(" kJ of energy generated from "+ca.returnCalories()+" calories");
            }
}
class Calories {
            
            int calculateCalories() {
            //you have to overload this function for three parameters refer the question
            	return -1;
            }
            
            void calculateCalories(int bread)
            {
            	double total_calories = 74 * bread;
            	double energy= total_calories * 4.1868;
            	
            	
            	System.out.println(  String.format("%.3f", energy)
            			+"kJ of energy generated from "+ total_calories + " calories");
            }
            
            void calcuateCalories(int bread, int jam) 
            {
            	double total_calories = 74 * bread + 26 * jam;
            	double energy= total_calories * 4.1868;
            	
                System.out.println(  String.format("%.3f", energy)
            			+"kJ of energy generated from "+ total_calories + " calories");
            	
            }
            
            void calculateCalories(int bread, int jam, int butter) 
            {
            	double total_calories = 74 * bread + 26 * jam + 102 * butter;
            	double energy= total_calories * 4.1868;
            	
            	System.out.println(  String.format("%.3f", energy)
            			+"kJ of energy generated from "+ total_calories + " calories");
            }
            
            
}
