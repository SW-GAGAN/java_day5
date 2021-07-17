    public class FlipCoin {
        public static void main(String[] args) {
            System.out.println("Enter how many times you need to flip"); // args[]
            int flipCount = Utility.getUserInteger();// flipCount12
            int headCount = 0; // headCount:0
            int tailCount = 0; // tailCount:0
            for (int i = 0; i <= flipCount; i++) {//flipCount:12 i:1 I:1
                double random = Math.random();
                if (random > 0.5) {
                    headCount++;
                } else {
                    tailCount++;
                }
            }
            System.out.println("Headcount is :" + headCount + "% =" + calculatePercentage(flipCount, headCount));
            System.out.println("Tailcount is :" + tailCount + "% =" + calculatePercentage(flipCount, tailCount));
        }

        private static double calculatePercentage(int flipCount, int count) {
            return (double)count / flipCount * 100;
        }
    }

