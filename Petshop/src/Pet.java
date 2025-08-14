public class Pet {
    private String nome;
    private boolean isClean = false;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setClean(boolean isClean) {
        this.isClean = isClean;
    }

    public String getNome() {
        return nome;
    }

    public boolean isClean(){
        return isClean;
    }
}
