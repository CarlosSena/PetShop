
public class Cachorro extends Animal {

	
	
	
	public String nome;
	public String raca;
	  


	   public Cachorro(String nome, String raca ){
	    super();
	    this.nome = nome;
	    this.raca = raca;
	    
	    
	    
	    
	}
	
	
	 @Override    
	   public void emitirSom(){
	       System.out.println("Emitir Som: Late ");
	   }
	
}
