public class PetMachine {
    private Pet pet;
    private int water = 30;
    private int shampoo = 10;
    private boolean hasPet = false;
    private boolean isClean = true;

    public void cleanPet(){
        if(this.hasPet){
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
        else{
            System.out.println("Não há pet na máquina");
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

    public Pet getPet(){
        return this.pet;
    }

    public int getShampoo(){
        return this.shampoo;
    }

    public boolean hasPetInPetMachine(){
        return this.hasPet;
    }

    public void setPet(Pet pet){
        if(this.hasPet){
            System.out.println("Retire o pet primeiro para poder adicionar outro!");
        }
        else{
            this.pet = pet;
            System.out.println("O pet " + pet + " foi adicionado à máquina");
            this.hasPet = true;
        }
    }

    public void removePet(){
        if(this.hasPet){
            System.out.println("O pet " + this.pet + " foi removido da máquina");
            this.isClean = this.pet.isClean();
            this.pet = null;
        }
        else {
            System.out.println("Não há pet para ser tirado");
        }
    }

    public void cleanPetMachine(){
        if(!this.hasPet){
            if(this.water >=3 && this.shampoo >= 1){
            this.water -= 3;
            this.shampoo -= 1;
            this.isClean = true;
            System.out.println("A máquina foi limpa!");
            }
            else{
                System.out.println("Água/shampoo insuficiente, abasteça para poder usar a máquina!");
            }
        }
        else{
            System.out.println("Espera! " + this.pet.getNome() + " está na máquina!");
        }
    }

}
