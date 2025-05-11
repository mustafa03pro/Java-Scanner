import java.util.Arrays;

public class ForEachDemo2 {
    public static void main(String[] args) {
        Object []ob={"mustafa","asher","ravi","raju"};
        Arrays.sort(ob);
        for (Object obj : ob) {
            System.out.println(obj);
            
        }
    }
}
