
public class Gato extends Animal{
	
	
	public String nome;
	public String raca;
	  


	   public Gato(String nome, String raca ){
	    super();
	    this.nome = nome;
	    this.raca = raca;
	    
	    
	    
	    
	}

	 @Override    
	   public void emitirSom(){
	       System.out.println("Emitir Som: Mia ");
	   }
	
	
}
