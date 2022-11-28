package Tasks;

public class Name {
    public static void main(String[] args) {
        char[] name = {83, 101, 114, 103, 101, 121};

        StringBuilder sb = new StringBuilder();
        for (char ch : name) {
            sb.append(ch);
        }

        String s = sb.toString();
        System.out.println(s);

    }

}
