import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class Base64Encode {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\n\nREQUEST: Enter the client ID and client secret...");
        System.out.println();
        
        final Scanner in = new Scanner(System.in);
        
        System.out.print("Client ID: ");
        final String clientId = in.nextLine();
        
        System.out.print("Client Secret: ");
        final String clientSecret = in.nextLine();
        System.out.println();

        String keyAndSecret = String.format("%s:%s", new Object[] {clientId, clientSecret});
        byte[] keyBytes = Base64.getEncoder().encode(keyAndSecret.getBytes(Charset.forName("UTF-8")));
        String value = new String(keyBytes, StandardCharsets.UTF_8);
    
        System.out.println("Base64Encoded String: " + value);
        System.out.println();

    }
}
