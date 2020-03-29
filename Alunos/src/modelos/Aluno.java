package modelos;

public class Aluno {
    
    private int ra;
    private String email;
    private String nome;
    
    public Aluno() {}
    
    public Aluno(int ra, String email, String nome) {
    	this.ra = ra;
    	this.email = email;
    	this.nome = nome;
    }

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
   
	
	public String toString(){
		   
		return "RA: " + this.ra 
		 + " " + "Nome: " + this.nome
		 + " " + "Email: "+ this.email;
	   
	   }
	   
	public static void main(String args[]){
		
		Aluno vetor[] = new Aluno[7];
		vetor[0] = new Aluno(1101,"maria@gmail.com","Maria Aparecida");
		vetor[1] = new Aluno(1488,"jose@outlook.com","Joé Carlos");
		vetor[2] = new Aluno(1784,"joao@gmail.com","João Rodrigues");
		vetor[3] = new Aluno(1111,"Aline@hotmail.com","Aline Moraes");
		vetor[4] = new Aluno(1458,"mariana@yahoo.com.br","Mariana Arnaldo");
		vetor[5] = new Aluno(1100,"jonathan@gmail.com","Jonathan Rodrigues");
		vetor[6] = new Aluno(1998,"lucas@hotmail.com","Lucas silva");

	    Aluno aux = new Aluno();
	    int i = 0;
	     
	     
	    for(i = 0; i < 7; i++){
	        for(int j = 0; j < 6; j++){
	            if(vetor[j].getRa() > vetor[j + 1].getRa()){
	                aux = vetor[j];
	                vetor[j] = vetor[j+1];
	                vetor[j+1] = aux;
	            }
	        }
	    }
	    System.out.println("Vetor Ordenado:");
	    for(i = 0; i< 7; i++){
	        System.out.println(" "+vetor[i]);
	    }
	}	
	
	
	
	
	
}
