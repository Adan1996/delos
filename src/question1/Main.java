package question1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner expected = new Scanner(System.in);
        System.out.print("Enter the expected returned: ");
        String expectedDate = expected.nextLine();
        String[] strToArr1 = null;
        strToArr1 = expectedDate.split(" ");
        
        Scanner actual = new Scanner(System.in);
        System.out.print("Enter the actual returned: ");
        String actualDate = actual.nextLine();
        String[] strToArr2 = null;
        strToArr2 = actualDate.split(" ");
        
        int d1 = Integer.parseInt(strToArr1[0]);
        int m1 = Integer.parseInt(strToArr1[1]);
        int y1 = Integer.parseInt(strToArr1[2]);
        
        int d2 = Integer.parseInt(strToArr2[0]);
        int m2 = Integer.parseInt(strToArr2[1]);
        int y2 = Integer.parseInt(strToArr2[2]);
        
        if(d1 <= d2 && m1 == m2 && y1 == y2) {
            int afterDay = d2 - d1;
            int result = afterDay * 15;
            System.out.println(result);
        } else if(m1 <= m2 && y1 == y2){
            int afterMonth = m2 - m1;
            int result = afterMonth * 500;
            System.out.println(result);
        } else if(y1 <= y2) {
            int afterYear = m2 - m1;
            int result = afterYear * 12000;
            System.out.println(result);
        }
        expected.close();
        actual.close();
    }
}
