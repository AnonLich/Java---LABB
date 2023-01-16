
public class test {

	
    public static boolean isValidPNR(String number) {
    	
    	int siffra = 0;
		for (int i = 0; i < number.length(); i++) {
    		if (i % 2 == 0) {
    			siffra = (Character.digit(number.charAt(i), 10) * 2);

    		} else {
    			siffra = Character.digit(number.charAt(i), 10);
    		}
			System.out.println(siffra);
		}
    			return false;
    	
	
    }
    

		    public static void main(String[] args) {
		        String personNummer = "9103259876";
		        

		        if (isValidPNR(personNummer)) {
		            System.out.println("Giltigt nummer.");
		        } else {
		            System.out.println("Ej ett giltigt nummer.");
		        }
		    }
		}
