/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rememberfx;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Pinal
 */
public class QuoteClass {
    //Creating the ArrayList that will hold Quotes as String objects. 
  private final ArrayList<String> QuoteArray = new ArrayList<>();
  private final ArrayList<String> CSSthemeArray = new ArrayList<>(); // Store the CSS file names as strings in this array
  //Constructor************************************************************************
  public QuoteClass()
  {

   QuoteArray.add(0, "It does not matter how slowly you go as long as you do not stop. -Confucius"); //Adding a quote at index 0
   QuoteArray.add(1, "Our greatest weakness lies in giving up. The most certain way to succeed is always to try just one more time. -Thomas A. Edison");
   QuoteArray.add(2, "Don't watch the clock; do what it does. Keep going. -Sam Levenson");
   QuoteArray.add(3, "The more we do, the more we can do. -William Hazlitt");
   QuoteArray.add(4, "Always do your best. What you plant now, you will harvest later. -Og Mandino");
   QuoteArray.add(5, "Problems are not stop signs, they are guidelines. -Robert H. Schuller");
   QuoteArray.add(6, "Start where you are. Use what you have. Do what you can. -Arthur Ashe");
   QuoteArray.add(7, "Good, better, best. Never let it rest. 'Til your good is better and your better is best. -St. Jerome");
   QuoteArray.add(8, "Act today and you'll be lucky. Wait until tomorrow and it will be too late. -Unknown");
   QuoteArray.add(9, "The harder the conflict, the more glorious the triumph. -Thomas Paine");
   QuoteArray.add(10,"Motivation will almost always beat mere talent. -Norman Ralph Augustine"); 
   QuoteArray.add(11,"In extreme situations, the entire universe becomes our foe; at such critical times, unity of mind and technique is essential - do not let your heart waver! -Morihei Ueshiba"); 
   QuoteArray.add(12,"What you do today can improve all your tomorrows. -Ralph Marston");
   QuoteArray.add(13,"Who seeks shall find. -Sophocies"); 
   QuoteArray.add(14,"By three methods we may learn wisdom: First, by reflection, which is noblest; Second, by imitation, which is easiest; and third by experience, which is the bitterest. -Confucius");
   QuoteArray.add(15,"Do whatever you do intensely. -Robert Henri");
   QuoteArray.add(16, "If I am walking with two other men, each of them will serve as my teacher. I will pick out the good points of the one and imitate them, and the bad points of the other and correct them in myself. -Confucius");
   
   
   CSSthemeArray.add(0, "ThemeOne.css");
   CSSthemeArray.add(1, "ThemeTwo.css");
   CSSthemeArray.add(2, "ThemeThree.css");
   CSSthemeArray.add(3, "ThemeFour.css");
   CSSthemeArray.add(4, "ThemeFive.css");
  }// *******************************************************************
  

  
 /* Method that returns the string at a random index in the ArrayList */
  public String getRandomQuote()
  {
    Random r = new Random();
    int randomElement = r.nextInt(QuoteArray.size());
    String randomQuote = QuoteArray.get(randomElement);
    return randomQuote;
  }
  
   public String getRandomTheme()
  {
    Random r = new Random();
    int randomIndex = r.nextInt(CSSthemeArray.size());
    String randomTheme = CSSthemeArray.get(randomIndex);
    return randomTheme;
  }
  
  // Method that returns the array in this class
  public ArrayList<String> getArray()
  {
    return QuoteArray;
  }
  
  //Method that returns a string at a specific index of arraylist
  public String getString(int index)
  {
    return QuoteArray.get(index);
  }
    
  

    
    
}
