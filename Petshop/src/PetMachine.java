public class PetMachine {
    private Pet pet;
    private int water = 30;
    private int shampoo = 10;
    private boolean hasPet = false;
    private boolean isClean = true;

    public void cleanPet(){
        if(this.water >=10 && this.shampoo >= 2){
            this.pet.setClean(true);
            this.isClean = true;
            this.shampoo -= 2;
            this.water -= 10;
            System.out.println("O pet " + pet.getNome() + " está limpo e a máquina também!");
        }
        else{
            System.out.println("Água/shampoo insuficiente, abasteça para poder usar a máquina!");
        }
    }

    public void refillWater(){
        if (this.water == 30)
            System.out.println("O limite de água foi atingido");
        else
            this.water += 2;
            System.out.println("Água abastecida, sua capacidade agora está em " + this.water + " litros");
    }

    public void refillShampoo(){
        if (this.shampoo == 10)
            System.out.println("O limite de shampoo foi atingido");
        else
            this.shampoo += 2;
            System.out.println("Shampoo abastecido, sua capacidade agora está em " + this.shampoo + " litros");
    }

    public int getWater(){
        return this.water;
    }

    public int getShampoo(){
        return this.shampoo;
    }

    public boolean hasPetInPetMachine(){
        return this.hasPet;
    }

    public void setPet(Pet pet){
        this.pet = pet;
    }

    public void removePet(){
        this.pet = null;
    }


}
