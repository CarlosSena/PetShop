import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		int op = 0;
        Scanner sc = new Scanner(System.in);

        Cachorro cachorro1 = new Cachorro("Lobo", "PitBull");
        Gato gato1 = new Gato("Lobo", "Persa");
        
        do {

            System.out.println("1 - Cachorro");
            System.out.println("2 - Gato");
            System.out.println("0 - Sair \n>>");

            op = sc.nextInt();
        
            
            
            switch (op) {
                case 1:
                    System.out.println("Nome: " + cachorro1.nome);
                    System.out.println("Raça: " + cachorro1.raca);
                    cachorro1.emitirSom();
                    //lobo1.formaDe();
                    //System.out.println("Emitir Som: " + );
                    //	
                    break;
                    
                case 2:
                    System.out.println("Nome: " + gato1.nome);
                    System.out.println("Raça: " + gato1.raca);
                    gato1.emitirSom();
                    //lobo1.formaDe();
                    //System.out.println("Emitir Som: " + );
                    //	
                    break;

                
                    
                case 0:
                	
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }
        } while (op != 0);
    }

	}
	
	

