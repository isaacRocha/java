
package questaoum;

import pessoa.CadernoDeEnderecos;

public class Main {

    public static void main(String[] args) {
        
        CadernoDeEnderecos pessoa = new CadernoDeEnderecos();
        
        pessoa.nome= "isaac";
        pessoa.email = "i@gmail.com";
        pessoa.endereco =" Q 2 lote 12 ";
        pessoa.telefone = "9999999999";
        
        System.out.println(pessoa.getNome());
        
    }
    
}
