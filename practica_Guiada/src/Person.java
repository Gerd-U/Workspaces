public class Person {
    private String name;
    private int age;
    private PetManager manager;

    public Person(String name, int age, int numbersOfPets){
        this.name = name;
        this.age = age;
        manager = new PetManager(numbersOfPets);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public boolean addPet(Pet pet){
        return manager.addPet(pet);
    }

    public boolean removePet(Pet pet){
        return manager.removePet(pet);
    }

    public Pet[] getPets(){
        return manager.getPets();
    }

    public boolean updatePet(int index, Pet pet){
        return manager.updatePet(pet, index);
    }
}
