public class Main {
    public static void main(String[] args) {
        /*int[] numbers = {10,20,30,40,50};
        String[] fruits = new String[3];
        
        System.out.println(numbers[2]);
        System.out.println(fruits[2]);
        */
        Person p = new Person("Gerald", 19, 5);

        System.out.println(p.getPets());

        for (Pet pet : p.getPets()) {
            System.out.println(pet.getPetName());
        }
    }
}
