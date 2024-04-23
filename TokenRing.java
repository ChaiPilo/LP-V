import java.util.Scanner;

class TokenRing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of nodes");
        int n = sc.nextInt();
        int token = 0;
        
        // Print nodes
        System.out.println("Nodes:");
        for (int i = 0; i < n; i++)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Token: " + token);

        try {
            while (true) {
                System.out.print("ENTER SENDER:");
                int s = sc.nextInt();
                System.out.print("ENTER RECEIVER:");
                int r = sc.nextInt();
                System.out.print("ENTER DATA:");
                String d = sc.next();
                System.out.println("TOKEN PASSING");
                
                // Token passing
                for (int i = token, j = token; (i % n) != s; i++, j = (j + 1) % n) {
                    System.out.print("  " + j + "-->");
                }
                System.out.println(" " + s);
                System.out.println("Sender:" + s + " Data:" + d);
                
                // Forwarding data
                for (int i = (s + 1) % n; i != r; i = (i + 1) % n) {
                    System.out.println("  Data " + d + " Forwarded by " + i);
                }
                System.out.println("  Receiver " + r + " received data " + d);
                token = s;
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
