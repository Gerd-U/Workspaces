

public class Main {
    public static void main(String[] args) {
        /*int[] numbers = {10,20,30,40,50};
        String[] fruits = new String[3];
        
        System.out.println(numbers[2]);
        System.out.println(fruits[2]);
        */
        Person p = new Person("Gerald", 19, 5);
        Pet pet1  = new Pet("Goldie", "Fish");
        Pet pet2  = new Pet("Rocky", "Fish");

        if (p.addPet(pet1)) {
            IOManager.printMessage("Pet added successfully.");

        }else{
            IOManager.printMessage("Failed to add pet.");
        }
        if (p.addPet(pet2)) {
            IOManager.printMessage("Pet added successfully.");

        }else{
            IOManager.printMessage("Failed to add pet.");
        }

        if (p.removePet(pet1)) {
          IOManager.printMessage("Pet remove successfully.");

        }else{
            IOManager.printMessage("Failed to remove pet.");
        }

        if (p.getPets().length == 0) {
            IOManager.printMessage("No pets found.");
        }else{
            for (Pet pet : p.getPets()) {
                  IOManager.printMessage(pet.getPetName());
            }
        }
        
        if (p.updatePet(0, pet2)) {
         IOManager.printMessage("Pet update successfully.");

        }else{
            IOManager.printMessage("Failed to update pet.");
        }
        
    }
}
