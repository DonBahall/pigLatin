import java.util.Arrays;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        String check =  pigIt("Hello men");
        System.out.println(check);
    }

    public static String pigIt(String str) {
        return Arrays.stream(str.split(" "))
                .map(x->(x.matches("\\w+")? x.subSequence(1, x.length()).toString().concat(x.charAt(0)+"ay"):x))
                .collect(Collectors.joining(" ")).trim();
    }
}
