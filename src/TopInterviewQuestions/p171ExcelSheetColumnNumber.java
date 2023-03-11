package TopInterviewQuestions;

public class p171ExcelSheetColumnNumber {
    public static void main(String[] args) {

        System.out.println(titleToNumber("AB"));
    }

    public static int titleToNumber(String columnTitle) {
        if (columnTitle == null) return -1;
        int sum = 0;
        // for each loop so we don't need to mess with index values.
        for (char c : columnTitle.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;

    }
}
