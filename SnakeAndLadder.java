public class SnakeAndLadder {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    public static void main(String[] args) {
        int position = 0;
        while (position <= 100) {
            int roll = (int) Math.floor((Math.random() * 10) % 3);
            int dice = (int) Math.floor((Math.random() * 10) % 6) + 1;
            switch (roll) {
                case SNAKE:
                    System.out.println("player got snake : " + position);
                    position = position - dice;
                case LADDER:
                    System.out.println("player goes to next position : " + position);
                    position = position + dice;
                    break;
                case NO_PLAY:
                    System.out.println("no Play");
                    break;
            }
        }
    }
}
