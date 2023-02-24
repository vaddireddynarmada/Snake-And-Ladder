public class SnakeAndLadder {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;

    public static void main(String[] args) {
        int position = 0;
        while (position != 100) {
            int roll = (int) Math.floor((Math.random() * 10) % 3);
            int dice = (int) Math.floor((Math.random() * 10) % 6) + 1;
            switch (roll) {
                case SNAKE:
                    if (position < 0) {
                        position = 0;
                        System.out.println("start from zero: " + position);
                    } else {
                        System.out.println("player got snake : " + position);
                        position = position - dice;
                    }
                case LADDER:
                    if (position > 100) {
                        System.out.println("player got extra number : " + position);
                        position = position - dice;
                    } else {
                        System.out.println("player is in next position : " + position);
                        position = position + dice;
                    }
                    break;
                case NO_PLAY:
                    System.out.println("no Play");
                    break;
            }
        }
        System.out.println("winning position : " + position);
    }
}
