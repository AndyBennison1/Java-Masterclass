public class WarriorMain {

    public static void main(String[] args) {
        Warrior BruceLee = new Warrior("Bruce Lee");

        BruceLee.experience = 500;
        System.out.println(BruceLee.experience);
        System.out.println(BruceLee.Name);
        System.out.println((BruceLee.experience / 100));
        System.out.println(BruceLee.level);
        System.out.println(BruceLee.rank);


/*
        System.out.println(BruceLee.rank);
        BruceLee.experience = 400;
        System.out.println("Test");
        System.out.println(BruceLee.level);
        System.out.println(BruceLee.experience);
        System.out.println(BruceLee.rank);


*/
    }

}
