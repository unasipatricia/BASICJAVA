public class Nestedif {
    public static void main(String[] args) {
        String address = "Kla, India";

        if(address.endsWith("Congo")) {
            if(address.contains("Meerut")) {
                System.out.println("Your city is Meerut");
            }else if(address.contains("Noida")) {
                System.out.println("Your city is Noida");
            }else {
                System.out.println(address.split(",")[0]);
            }
        }else {
            System.out.println("You are not living in Congo");
        }
    }

}
