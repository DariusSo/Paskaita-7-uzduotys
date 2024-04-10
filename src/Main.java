import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IntDivider.ArgumentIsZero {
        InputManager ivesk = new InputManager();
        IntDivider daliklis = new IntDivider();
        String[] skaiciai = ivesk.askForInput();
        int padalinus = daliklis.divide(skaiciai);
        System.out.println(skaiciai[0] + "/" + skaiciai[1] + "=" + padalinus);

        }
    }
