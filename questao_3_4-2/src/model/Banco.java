package model;

public class Banco {
	public String nome;
	public String cnpj;
	
	public Banco(){
	}
	
	public Banco(String nome, String cnpj){
		this.nome = nome;
		this.cnpj = cnpj;
	}
        
        public String imprimirBanco(){
            return "Nome do banco: " + this.nome +" CNPJ: "+this.cnpj;
        }
}