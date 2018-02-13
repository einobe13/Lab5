import java.security.KeyStore;
import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {

        String hexaNumber;
        int length;
        int space;
       double asciiNumber;
        int numberLocation;
       double finalNumber;
        Scanner scnr = new Scanner(System.in);
        double sum;


        System.out.println("Enter a hexadecimal number: ");
        hexaNumber = scnr.nextLine();
        length = hexaNumber.length() - 1;
        space = length;
        sum = 0;
        int zero = 0;


        // if hexaNumber begins with an 0x this goes through
        if((((int)hexaNumber.charAt(0)) == 48) && ((int)hexaNumber.charAt(1) == 120)) {

           while (space >= 2) {
               numberLocation = (int) hexaNumber.charAt(space);
               //System.out.println(numberLocation);


               if ((numberLocation > 64) && (numberLocation < 91)) {

                   asciiNumber = numberLocation - 55;
                   finalNumber = asciiNumber * Math.pow(16, (zero++));
                   sum += finalNumber;
                   space--;

               }

               if ((numberLocation > 96) && (numberLocation < 123)) {

                   asciiNumber = numberLocation - 87;
                   finalNumber = asciiNumber * Math.pow(16, (zero++));
                   sum += finalNumber;
                   space--;
               }
               if ((numberLocation >= 48) && (numberLocation < 58)) {

                   asciiNumber = numberLocation - 48;
                   finalNumber = asciiNumber * Math.pow(16, (zero++));
                   sum += finalNumber;
                   space--;


                }
           }
        }

        if(!((((int)hexaNumber.charAt(0)) == 48) && ((int)hexaNumber.charAt(1) == 120))) {

        while (space >= 0) {
            numberLocation = (int) hexaNumber.charAt(space);
            //System.out.println(numberLocation);

            if ((numberLocation > 64) && (numberLocation < 91)) {

                asciiNumber = numberLocation - 55;
                finalNumber = asciiNumber * Math.pow(16, (zero++));
                sum += finalNumber;
                space--;

            }

            if ((numberLocation > 96) && (numberLocation < 123)) {

                asciiNumber = numberLocation - 87;
                finalNumber = asciiNumber * Math.pow(16, (zero++));
                sum += finalNumber;
                space--;
            }
            if ((numberLocation >= 48) && (numberLocation < 58)) {

                asciiNumber = numberLocation - 48;
                finalNumber = asciiNumber * Math.pow(16, (zero++));
                sum += finalNumber;
                space--;

            }
        }
        }

            System.out.print("Your number is ");
        System.out.printf("%.0f", sum);
        System.out.print(" in decimal");



        }
    }




