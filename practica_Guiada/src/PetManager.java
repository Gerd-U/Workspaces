public class PetManager {
    private int petCount;
    private Pet[] pets;

    public PetManager(int numbersOfPets){
        this.petCount = 0;
        this.pets = new Pet[numbersOfPets];
    }

    public boolean addPet(Pet pet){
        for(int i = 0; i<pets.length;i++){
            if (pets[i] == null) {
                pets[i] = pet;
                petCount++;
                return true;
            }
        }
        return false;
    }

    public boolean removePet(Pet pet){
        for(int i = 0; i<pets.length;i++){
            if (pets[i] != null && pets[i].equals(pet)) {
                for (int j = i; j < pets.length - 1; j++){
                    pets[j] = pets[j + 1];
                }
                pets[pets.length-1] = null;
                petCount--;
                return true;
            }
        }
        return false;
    }

    public Pet[] getPets(){
        Pet[] pets = new Pet[this.petCount];
            for (int i = 0; i < this.petCount; i++){
                pets[i] = this.pets[i];
            }
        return pets;
    }
    
    public boolean updatePet(Pet pet, int index){
        if (pet != null && index >= 0 && index <= this.petCount) {
            pets[index] = pet;
            return true;
        }
        return false;
    }

}
