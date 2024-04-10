import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {
    private int insertDigit(){
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        try {
            System.out.println("Iveskite skaiciu: ");
            a = scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Bolgai. Iveskite skaiciu dar karta: ");
            insertDigit();
        }
        return a;
    }
    public String[] askForInput(){
        String[] abuSkaiciai = new String[2];
        abuSkaiciai[0] = String.valueOf(insertDigit());
        abuSkaiciai[1] = String.valueOf(insertDigit());
        return abuSkaiciai;

    }
}
