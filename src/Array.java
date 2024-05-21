public class Array {
    public static void main(String[] args){
        String[] userNames;
        userNames = new String[]{"John", "Mike", "Joe", "Ashley", "Kim", "Jose"};
        int[] userAges = new int[]{21, 26, 31, 29, 20, 34};
        String[] userMajor = new String[6];
        userMajor[0] = "Computer Science";
        userMajor[1] = "Philosophy";
        userMajor[2] = "Electrical Engineering";
        userMajor[3] = "Biology";
        userMajor[4] = "PreMed";
        userMajor[5] = "Math";

        System.out.println("Username: " + userNames[0] + ", Age: " + userAges[0] + ", Major: " + userMajor[0]);
        System.out.println("Username: " + userNames[1] + ", Age: " + userAges[1] + ", Major: " + userMajor[1]);
        System.out.println("Username: " + userNames[2] + ", Age: " + userAges[2] + ", Major: " + userMajor[2]);
        System.out.println("Username: " + userNames[3] + ", Age: " + userAges[3] + ", Major: " + userMajor[3]);
        System.out.println("Username: " + userNames[4] + ", Age: " + userAges[4] + ", Major: " + userMajor[4]);
        System.out.println("Username: " + userNames[5] + ", Age: " + userAges[5] + ", Major: " + userMajor[5]);
    }
}
