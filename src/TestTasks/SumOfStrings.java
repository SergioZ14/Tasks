package TestTasks;

public class SumOfStrings {
    public static void main(String[] args) {
        System.out.println(sumUpStrings("a", "b", "c"));
    }

    static String sumUpStrings(String ...args) {
        StringBuilder result = new StringBuilder();
        if (args.length == 0) {
            return result.append("").toString();
        }

        for (String s : args) {
            result.append(s);
            result.append(" ");
        }
        return result.toString();
    }
}
