
//Problem 1

public class address {
	
	public address(String string) {
		// TODO Auto-generated constructor stub
	}

	public address(java.lang.String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){ 
        address address1 = new address("Perum Puri Arsana JL. Raya Ciputat Parung KM.11");
            System.out.println(address1);

        address address2 = address1;
            System.out.println(address2);

        address address21 = new address("Green Garden M17A no.44 Jakarta Barat -11520");
            System.out.println(address21);

        System.out.println(" " + (address1==address2));
        System.out.println("address1 == address21: " + (address1==address21));
        System.out.println("address.equals(address21): " + address1.equals(address1));
    }

}
