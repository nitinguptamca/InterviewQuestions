package heakthran.questions;

/**
 * problem statement are.
 * <img src="./img.png"/>
 * <img src="./img_1.png"/>
 */
public class Question1 {

    private static final int s = 1;
    private static final int m = 60;
    private static final int h = 60 * 60;
    private static final int d = 60 * 60 * 24;
    private static final int w = 60 * 60 * 24 * 7;
    static int[] timeArray = {w, d, h, m, s};

    public static void main(String[] args) {
        Question1 question1 = new Question1();
        System.out.println(question1.solutions(100));
        System.out.println(question1.solutions(7263));
        System.out.println(question1.solutions(5));
    }
    public String solutions(int x) {
        int remainder = 0;
        String concatTime = "";
        for (int i = 0; i < timeArray.length; i++) {
              if ( x / timeArray[i] > 0) {
                  concatTime += (x / timeArray[i]) + appendValue(i);
                  remainder = x % timeArray[i];
              }
              if (remainder > 0) {
                  x = remainder;
              }
        }
        return concatTime;
    }

    public String appendValue(int positionValie) {
        if (positionValie == 0) return "w";
        else if (positionValie == 1) return "d";
        else if (positionValie == 2) return "h";
        else if (positionValie == 3) return "m";
        else return "s";
    }


}
