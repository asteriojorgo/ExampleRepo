public class Switch {
    public static void main(String[] args){
        String grade = "C+";
        switch(grade){
            case "A+": case "A":
            case "A-":
                System.out.println("You are top of class");
                break;
            case "B+": case "B":
            case "B-":
                System.out.println("You're an above average student.");
                break;
            case "C+": case "C":
            case "C-":
                System.out.println("You're an average student.");
                break;
            case "D+": case "D":
            case "D-":
                System.out.println("You're a below average student.");
                break;
            case "F":
                System.out.println("You failed the class.");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }
}
