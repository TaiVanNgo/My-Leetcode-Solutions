package problem_1342;

class solution {

    public static int numberOfSteps(int num) {
        int step = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                step++;
            } else if (num != 0) {
                num--;
                step++;
            }
        }

        return step;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));

    }

}