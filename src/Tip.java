public class Tip {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)

        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */

        double one = 10;
        double two = 12;
        double three = 9;
        double four = 8;
        double five = 7;
        double six = 15;
        double seven = 11;
        double eight = 30;

        double tax = 0.05;
        double tip = 0.15;

        System.out.println((one*tax)+(one*tip)+one);
        System.out.println((two*tax)+(two*tip)+two);
        System.out.println((three*tax)+(three*tip)+three);
        System.out.println((four*tax)+(four*tip)+four);
        System.out.println((five*tax)+(five*tip)+five);
        System.out.println((six*tax)+(six*tip)+six);
        System.out.println((seven*tax)+(seven*tip)+seven);
        System.out.println((eight*tax)+(eight*tip)+eight);


    }

}
