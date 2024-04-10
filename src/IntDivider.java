public class IntDivider {
    public int divide(String[] skaiciai) throws ArgumentIsZero {
        int dalyba = 0;

        try {
            if (Integer.parseInt(skaiciai[1]) == 0){
                throw new ArgumentIsZero("");
            }
            dalyba = Integer.parseInt(skaiciai[0]) / Integer.parseInt(skaiciai[1]);
        } catch (ArgumentIsZero e) {
            System.out.println(e);

        }
        return dalyba;

    }


    public class ArgumentIsZero extends Exception{

        @Override
        public String toString(){
            return "Dalyba is nulio negalima." + getMessage();
        }
        public ArgumentIsZero(String message){
            super(message);
        }

    }
}
