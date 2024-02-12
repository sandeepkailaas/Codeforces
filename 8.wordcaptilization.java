import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = Character.toUpperCase(s.charAt(0)) + s.substring(1);

        System.out.println(a);
    }
}

