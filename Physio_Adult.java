import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Physio_Adult{
    static void dog(float Temperature, int Heart_rate, int Respiratory_rate){
        if(Temperature < 37.5f ){
            System.out.println("Hypothermia suspected");}
        else if(Temperature> 39.5f){
            System.out.println("Hyperthermia suspected");}
        else if(Temperature >=37.5f && Temperature <= 39.5f){
            System.out.println("Temperature in normal range");}
        else{
            System.out.println("Something went wrong in temperature input");
        }
        if(Heart_rate < 70){
            System.out.println("Bradycardy is suspected");}
        
        else if(Heart_rate > 120){
            System.out.println("Tachycardy is suspected");
        }
        else if(Heart_rate >= 70 && Heart_rate <= 120){
            System.out.println("Heart rate is in normal range");
        }
        else{
            System.out.println("Something went wrong in heart rate input");
        }
        if(Respiratory_rate < 14 ){
            System.out.println("Bradypnea suspected");
        }
        else if(Respiratory_rate > 16){
            System.out.println("Tachypnea suspected");
        }
        else if(Respiratory_rate >= 14 && Respiratory_rate <= 16){
            System.out.println("Respiratory rate is in normal range");
        }
        else{
           System.out.println("Something went wrong: Check input values"); 
        }
    }
    
    static void cat(float Temperature, int Heart_rate, int Respiratory_rate){
        if(Temperature < 37.7f ){
            System.out.println("Hypothermia suspected");}
        else if(Temperature> 39.4f){
            System.out.println("Hyperthermia suspected");}
        else if(Temperature >=37.7f && Temperature <= 39.4f){
            System.out.println("Temperature in normal range");}
        else{
            System.out.println("Something went wrong in temperature input");
        }
        if(Heart_rate < 140){
            System.out.println("Bradycardy is suspected");}
        
        else if(Heart_rate > 240){
            System.out.println("Tachycardy is suspected");
        }
        else if(Heart_rate >= 140 && Heart_rate <= 240){
            System.out.println("Heart rate is in normal range");
        }
        else{
            System.out.println("Something went wrong in heart rate input");
        }
        if(Respiratory_rate < 20 ){
            System.out.println("Bradypnea suspected");
        }
        else if(Respiratory_rate > 24){
            System.out.println("Tachypnea suspected");
        }
        else if(Respiratory_rate >= 20 && Respiratory_rate <= 24){
            System.out.println("Respiratory rate is in normal range");
        }
        else{
           System.out.println("Something went wrong: Check input values"); 
        }
    }
    
    
    static void horse(float Temperature, int Heart_rate, int Respiratory_rate){
        if(Temperature < 37.2f ){
            System.out.println("Hypothermia suspected");}
        else if(Temperature> 38.2f){
            System.out.println("Hyperthermia suspected");}
        else if(Temperature >=37.2f && Temperature <= 38.2f){
            System.out.println("Temperature in normal range");}
        else{
            System.out.println("Something went wrong in temperature input");
        }
        if(Heart_rate < 28){
            System.out.println("Bradycardy is suspected");}
        
        else if(Heart_rate > 40){
            System.out.println("Tachycardy is suspected");
        }
        else if(Heart_rate >= 28 && Heart_rate <= 40){
            System.out.println("Heart rate is in normal range");
        }
        else{
            System.out.println("Something went wrong in heart rate input");
        }
        if(Respiratory_rate < 10 ){
            System.out.println("Bradypnea suspected");
        }
        else if(Respiratory_rate > 14){
            System.out.println("Tachypnea suspected");
        }
         else if(Respiratory_rate >= 10 && Respiratory_rate <= 14){
            System.out.println("Respiratory rate is in normal range");
        }
        else{
           System.out.println("Something went wrong: Check input values"); 
        }
    }
    
    static void cattle(float Temperature, int Heart_rate, int Respiratory_rate){
        if(Temperature < 38.0f ){
            System.out.println("Hypothermia suspected");}
        else if(Temperature> 39.0f){
            System.out.println("Hyperthermia suspected");}
        else if(Temperature >=38.0f && Temperature <= 39.0f){
            System.out.println("Temperature in normal range");}
        else{
            System.out.println("Something went wrong in temperature input");
        }
        if(Heart_rate < 60){
            System.out.println("Bradycardy is suspected");}
        
        else if(Heart_rate > 80){
            System.out.println("Tachycardy is suspected");
        }
        else if(Heart_rate >= 60 && Heart_rate <= 80){
            System.out.println("Heart rate is in normal range");
        }
        else{
            System.out.println("Something went wrong in heart rate input");
        }
        if(Respiratory_rate < 15 ){
            System.out.println("Bradypnea suspected");
        }
        else if(Respiratory_rate > 30){
            System.out.println("Tachypnea suspected");
        }
    
        else if(Respiratory_rate >= 15 && Respiratory_rate <= 30){
            System.out.println("Respiratory rate is in normal range");
        }
        else{
           System.out.println("Something went wrong: Check input values"); 
        }
    }
    
    
    static void sheep(float Temperature, int Heart_rate, int Respiratory_rate){
        if(Temperature < 38.5f ){
            System.out.println("Hypothermia suspected");}
        else if(Temperature> 40.0f){
            System.out.println("Hyperthermia suspected");}
        else if(Temperature >=38.5f && Temperature <= 40.0f){
            System.out.println("Temperature in normal range");}
        else{
            System.out.println("Something went wrong in temperature input");
        }
        if(Heart_rate < 70){
            System.out.println("Bradycardy is suspected");}
        
        else if(Heart_rate > 90){
            System.out.println("Tachycardy is suspected");
        }
        else if(Heart_rate >= 70 && Heart_rate <= 90){
            System.out.println("Heart rate is in normal range");
        }
        else{
            System.out.println("Something went wrong in heart rate input");
        }
        if(Respiratory_rate < 20 ){
            System.out.println("Bradypnea suspected");
        }
        else if(Respiratory_rate > 30){
            System.out.println("Tachypnea suspected");
        }
        else if(Respiratory_rate >= 20 && Respiratory_rate <= 30){
            System.out.println("Respiratory rate is in normal range");
        }
        else{
           System.out.println("Something went wrong: Check input values"); 
        }
    }
    
    static void goat(float Temperature, int Heart_rate, int Respiratory_rate){
        if(Temperature < 39.0f ){
            System.out.println("Hypothermia suspected");}
        else if(Temperature> 40.5f){
            System.out.println("Hyperthermia suspected");}
        else if(Temperature >=39.0f && Temperature <= 40.5f){
            System.out.println("Temperature in normal range");}
        else{
            System.out.println("Something went wrong in temperature input");
        }
        if(Heart_rate < 70){
            System.out.println("Bradycardy is suspected");}
        
        else if(Heart_rate > 100){
            System.out.println("Tachycardy is suspected");
        }
        else if(Heart_rate >= 70 && Heart_rate <= 100){
            System.out.println("Heart rate is in normal range");
        }
        else{
            System.out.println("Something went wrong in heart rate input");
        }
        if(Respiratory_rate < 15 ){
            System.out.println("Bradypnea suspected");
        }
        else if(Respiratory_rate > 30){
            System.out.println("Tachypnea suspected");
        }
        else if(Respiratory_rate >= 15 && Respiratory_rate <= 30){
            System.out.println("Respiratory rate is in normal range");
        }
        else{
           System.out.println("Something went wrong: Check input values"); 
        }
    }
    
    public static void main(String [] args){
        System.out.println("Enter species name:(Dog/Cat/Horse/Cattle/Sheep/Goat");
        Scanner myObj = new Scanner(System.in);
        String species = myObj.nextLine();
        System.out.println("Enter Temperature value:");
        float temperature = myObj.nextFloat();
        System.out.println("Enter Heart rate in beats/mn: ");
        int heart_rate = myObj.nextInt();
        System.out.println("Enter Respiratory rate in breaths/mn: ");
        int respiratory_rate = myObj.nextInt();
        
        Pattern pattern_dog = Pattern.compile("dog", Pattern.CASE_INSENSITIVE);
        Matcher matcher_dog = pattern_dog.matcher(species);
        boolean matchFound_dog = matcher_dog.find();
        
        Pattern pattern_cat = Pattern.compile("cat", Pattern.CASE_INSENSITIVE);
        Matcher matcher_cat = pattern_cat.matcher(species);
        boolean matchFound_cat = matcher_cat.find();
        
        Pattern pattern_horse = Pattern.compile("horse", Pattern.CASE_INSENSITIVE);
        Matcher matcher_horse = pattern_horse.matcher(species);
        boolean matchFound_horse = matcher_horse.find();
        
        Pattern pattern_cattle = Pattern.compile("cattle", Pattern.CASE_INSENSITIVE);
        Matcher matcher_cattle = pattern_cattle.matcher(species);
        boolean matchFound_cattle = matcher_cattle.find();
        
        Pattern pattern_sheep = Pattern.compile("sheep", Pattern.CASE_INSENSITIVE);
        Matcher matcher_sheep = pattern_sheep.matcher(species);
        boolean matchFound_sheep = matcher_sheep.find();
        
        Pattern pattern_goat = Pattern.compile("goat", Pattern.CASE_INSENSITIVE);
        Matcher matcher_goat = pattern_goat.matcher(species);
        boolean matchFound_goat = matcher_goat.find();
        
        if(matchFound_dog){
            dog(temperature, heart_rate,respiratory_rate);}
        else if(matchFound_cat){
            cat(temperature, heart_rate, respiratory_rate);
        }
        else if(matchFound_horse){
            horse(temperature, heart_rate, respiratory_rate);
        }
        
        else if(matchFound_cattle){
            cattle(temperature, heart_rate, respiratory_rate);
        }
        
        else if(matchFound_sheep){
            sheep(temperature, heart_rate, respiratory_rate);
        }
        
        else if(matchFound_goat){
            goat(temperature, heart_rate, respiratory_rate);
        }
        else{
            System.out.println("Something went wrong in given species");
        }
        }
        
        
        }