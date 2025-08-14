import java.util.Scanner;

public class App {
    
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int opc = -1;
        PetMachine petMachine = new PetMachine();

        while (opc != 0){
            System.out.println("*** Pet Shop ***");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer com água");
            System.out.println("3 - Abastecer com shampoo");
            System.out.println("4 - Verificar nível de água");
            System.out.println("5 - Verificar nível de shampoo");
            System.out.println("6 - Verificar se tem pet na máquina");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");

            opc = scanner.nextInt();

            switch (opc) {
                case 1 -> petMachine.cleanPet();
                case 2 -> petMachine.refillWater();
                case 3 -> petMachine.refillShampoo();
                case 4 -> showWaterLevel(petMachine);
                case 5 -> showShampooLevel(petMachine);
                case 6 -> checkIfHasPetInThePetMachine(petMachine);
                case 7 -> putPetInPetMachine(petMachine);
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.cleanPetMachine();
            }
        }
        return;
    }

    static void showWaterLevel(PetMachine petMachine)
    {
        System.out.println("O seu nível de água está em " + petMachine.getWater() + " litros");
    }

    public static void showShampooLevel(PetMachine petMachine) {
        System.out.println("O seu nível de shampoo está em " + petMachine.getShampoo() + " litros");
    }

    public static void checkIfHasPetInThePetMachine(PetMachine petMachine) {
        if (petMachine.hasPetInPetMachine()){
            System.out.println("Há um pet na máquina, o(a) " + petMachine.getPet().getNome());
        }
        else{
            System.out.println("Não há nenhum pet");
        }
    }

    public static void putPetInPetMachine(PetMachine petMachine) {
        if(petMachine.hasPetInPetMachine()){
            System.out.println("Já há um pet na máquina!");
            return;
        }
        Pet pet = new Pet();
        System.out.print("Escreva o nome do pet: ");
        String nomePet = scanner.next();
        pet.setNome(nomePet);
        petMachine.setPet(pet);
        System.out.println(nomePet + " foi colocado(a) na máquina!");
    }
}
