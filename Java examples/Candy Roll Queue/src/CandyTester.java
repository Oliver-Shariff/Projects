public class CandyTester {
    public static void main(String[] args) {
       CandyRoll roll = new CandyRoll();
        for (int i = 0; i < 10; i++){
            Candy candy = new Candy("Sweet");
            roll.addCandy(candy);
        }
        System.out.println("The back candy is " + roll.lookAtBackCandy().getKind());
        while(roll.hasMoreCandy()){
            System.out.println("The front candy is " + roll.lookAtFrontCandy().getKind());
            roll.removeCandy();
        }
        System.out.println("The roll is now empty again.");

    }
}