public class SistemaCadastro {
    public static void main(String[] args ) {
        Pessoa felipe = new Pessoa("324", "Felipe");
        
        felipe.setEndereco("RUA DAS MARIAS");
        
        System.out.println(felipe.getNome() + "-" + felipe.getCPF());
    }
   }
   