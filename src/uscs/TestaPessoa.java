package uscs;
public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa P1 = new Pessoa();
        Pessoa P2 = new Pessoa();
        Pessoa P3 = new Pessoa();
        Pessoa P4 = new Pessoa();
        
        P1.setNome("Ana Souza");
        P1.setIdade(31);
        P2.setNome("Bia Nunes");
        P2.setIdade(25);
        P3.setNome("Paulo Santos");
        P3.setIdade(45);
        P4.setNome("Rui Matos");
        P4.setIdade(13);
        
        P1.Imprime();
        P2.Imprime();
        P3.Imprime();
        P4.Imprime();
        
    }
    
}
