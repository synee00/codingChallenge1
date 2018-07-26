/*Jasmine Allen, Louis Privette
 * July 26, 2018
 * Program: Create an ArrayList of rectangles or circles. Find the largest
 * 			one (by area) and print the dimensions or radius. Also find smallest.
 */

package codingChallenge1;
import java.util.*;

public class CodeChallenge_1 {

    public static void main(String[] args) {
        
        ArrayList <Rectangles> shapes = new ArrayList <Rectangles>();
        
        shapes.add(new Rectangles(5,5));
        shapes.add(new Rectangles(5,4));
        shapes.add(new Rectangles(5,3));
        
        int largest = 0;
        int largestIndex = 0;
        int smallest = Integer.MAX_VALUE;
        int smallestIndex = 0;
        
        for(int i = 0; i < shapes.size(); i++)
        {
            System.out.println("The dimisions for shape " + i + " are: " +
                    shapes.get(i).getLength() + " " + shapes.get(i).getWidth());
            System.out.println("The area of " + i + " is: " + shapes.get(i).getArea());
            
            //checks for largest
            if(largest < shapes.get(i).getArea())
            {
                largestIndex = i;
                largest = shapes.get(i).getArea();
            }
            
            //checks for smallest
            if(smallest > shapes.get(i).getArea())
            {
                smallestIndex = i;
                smallest = shapes.get(i).getArea();

            }
        }
        
        System.out.println("The largest shape is " + shapes.get(largestIndex)
        + " with an area of " + shapes.get(largestIndex).getArea());
        System.out.println("The smallest shape is " + shapes.get(smallestIndex) 
        + " with an area of " + shapes.get(smallestIndex).getArea());

    }

}