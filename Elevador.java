public class Elevador {

    public int andarAtual = 0;
    public int totalAndares = 5;
    public int totalPessoas = 0;
    public int capacidade = 10;

    public void entra(int quantidade) { 
        if  (this.totalPessoas < this.capacidade) {
            this.totalPessoas += quantidade;
            System.out.println("ha " + this.totalPessoas + " pessoas no elevador");
            
        } else {
            System.out.println("Elevador atingiu a capacidade maxima");
        }
    }    

    public void sai(int quantidade) { 
        if  (this.totalPessoas > 0) {
            this.totalPessoas -= quantidade;
            System.out.println("ha " + this.totalPessoas + " pessoas no elevador");
        } else {
            System.out.println("Elevador esta vazio");
        }
    } 

    public void sobe(int quantidade) {
        if (this.andarAtual < 5){
            this.andarAtual += quantidade;
            System.out.println("o elevador esta no " +  this.andarAtual + " andar");
        } else {
             System.out.println("ultimo andar");
        }
    }     

    public void desce(int quantidade) {
        if (this.andarAtual > 0){
            this.andarAtual -= quantidade;
            System.out.println("o elevador esta no " +  this.andarAtual + " andar");
        } else {
            System.out.println("primerio andar");
        }
    }          

    public static void main( String[] args ) {


        System.out.println("Entrada");
        Elevador entrada = new Elevador();
        entrada.entra(6);
        entrada.sobe(2);
        entrada.sai(3);
        entrada.entra(5);
        entrada.sobe(3);
        entrada.desce(5);
        System.out.println("");

        System.out.println("Atrio");
        Elevador atrio = new Elevador();
        atrio.entra(10);
        atrio.sobe(4);
        atrio.entra(1);
        atrio.sai(7);
        atrio.entra(1);
        atrio.sobe(1);
        atrio.desce(5);
        System.out.println("");

        System.out.println("Biblioteca");
        Elevador biblioteca = new Elevador();
        biblioteca.entra(8);
        biblioteca.sobe(5);
        biblioteca.sai(8);
        biblioteca.entra(5);
        biblioteca.desce(5);

    }
}
