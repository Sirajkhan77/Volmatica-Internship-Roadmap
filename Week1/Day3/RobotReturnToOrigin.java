package Week1.Day3;

public class RobotReturnToOrigin {

    public static boolean judgeCircle(String moves) {
        int r = 0, l = 0, u = 0, d = 0;

        for (char c : moves.toCharArray()) {

            // if      (c == 'R') r++;
            // else if (c == 'L') l++;
            // else if (c == 'U') u++;
            // else               d++;

            switch (c) {
                case 'R':
                    r++;
                    break;
                case 'L':
                    l++;
                    break;
                case 'U':
                    u++;
                    break;
                case 'D':
                    d++;
                    break;
                default:
                    break;
            }
        }

        return r == l && u == d;
    }

    public static void main(String[] args) {
        String moves = "UDLR";

        boolean answer = judgeCircle(moves);

        System.out.println(answer);
    }
}
