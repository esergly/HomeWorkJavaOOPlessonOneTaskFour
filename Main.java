package HomeWorkLessonOneTaskFour;

public class Main {
    public static void main(String[] args) {

    Network mobile = new Network();

    Phone subOne = new Phone("Nokia", 123456);
    Phone subTwo = new Phone("Siemens", 121212);
    Phone subThree = new Phone("Apple", 125566);
    Phone subFour = new Phone("Alcatel", 127777);
    Phone subFive = new Phone("Sony", 123333);

        subOne.registration(mobile);
        subTwo.registration(mobile);
        subThree.registration(mobile);
        subFour.registration(mobile);
        subTwo.registration(mobile);

        subOne.call(127777);
        subTwo.call(121255);
        subThree.call(123333);

        subFive.registration(mobile);
        subThree.call(123333);
    }
}
