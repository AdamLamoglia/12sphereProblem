import java.util.Scanner;

public class DesafioDasEsferas {
		int esferaDiferente;
		boolean maisPesada;
		int numPesagens = 1;
		int [] esfera = new int[13];
		
		void defineEsferaDiferente(int esfera, boolean pesada){
			esferaDiferente = esfera;
			
			if(pesada == true){
				this.esfera[esfera] = 1;
				maisPesada = pesada;
			}
			else{
				maisPesada = pesada;
				this.esfera[esfera] = -1;
			}
		}
		
		int pesa1x1(int e1, int d1){
			if(esfera[e1] == esfera[d1])
				return 0;
			
			if(esfera[e1]<esfera[d1]){
				return 1;		
			}
			
			return -1;
				
		}
			
		int pesa2x2(int e1,int e2,int d1,int d2){
			if(esfera[e1] + esfera[e2] == esfera[d1] + esfera[d2]){
				return 0;		
			}
			if(esfera[e1] + esfera[e2] > esfera[d1] + esfera[d2]){
				return -1;			
			}		
			
			return 1;
		
		}
		
		
		int pesa3x3(int e1, int e2, int e3, int d1, int d2, int d3){
			
			if(esfera[e1]+esfera[e2]+esfera[e3] == esfera[d1]+esfera[d2]+esfera[d3]){
				return 0;
			}
			if(esfera[e1]+esfera[e2]+esfera[e3] > esfera[d1]+esfera[d2]+esfera[d3]){
				return -1;
			}
			
				return 1;
		}
		

		int pesa4x4(int e1, int e2, int e3, int e4, int d1, int d2, int d3, int d4){
			
			if(esfera[e1]+esfera[e2]+esfera[e3]+esfera[e4] == esfera[d1]+esfera[d2]+esfera[d3]+esfera[d4]){
				return 0;
			}
			
			if((esfera[e1]+esfera[e2]+esfera[e3]+esfera[e4] > esfera[d1]+esfera[d2]+esfera[d3]+esfera[d4])){
					return -1;
			}
			
			return 1;
		}
		
	
		
	void resolveDesafioDasDozeEsferas(){
		
		System.out.println("Pesagem "+ numPesagens+":"+" "+1+" "+2+" "+3+" "+4+"x"+5+" "+6+" "+7+" "+8);
		
		//1ª pesagem em equilibrio
		if(pesa4x4(1,2,3,4,5,6,7,8) == 0){
			numPesagens++;
			System.out.println("Resultado: (0) balança equilibrada." );
			
			System.out.println("Pesagem "+ numPesagens+":"+" "+1+" "+2+" "+3+" x"+" "+9+" "+10+" "+11);
			
			//1ª pesagem em equilibrio
			//2ª pesagem em equilibrio 
			if(pesa3x3(1,2,3,9,10,11) == 0){
				numPesagens++;
				System.out.println("Resultado: (0) balança equilibrada." );
				
				System.out.println("Pesagem "+ numPesagens+":"+" "+1+"x"+" "+12);
				
				//1ª pesagem em equilibrio
				//2ª pesagem em equilibrio 
				//3ª pesagem em desequilibrio(lado esquerdo mais pesado)
				if(pesa1x1(12,1) == -1){
					numPesagens++;
					System.out.println("Resultado: (-1) lado esquerdo mais pesado.");
					System.out.println("Resposta: esfera "+12+" mais pesada.");
				}
				
				//1ª pesagem em equilibrio
				//2ª pesagem em equilibrio 
				//3ª pesagem em desequilibrio(lado direito mais pesado)
				else if(pesa1x1(12,1) == 1){
					numPesagens++;
					System.out.println("Resultado: (1) lado direito mais pesado.");
					System.out.println("Resposta: esfera "+12+" mais leve.");
				}
			
			}
			
			//1ª pesagem em equilibrio 
			//2ª pesagem em desequilibrio (lado esquerdo mais pesado)
			else if(pesa3x3(1,2,3,9,10,11) == -1){
				numPesagens++;
				System.out.println("Resultado: (-1) lado esquerdo mais pesado.");
				
				System.out.println("Pesagem "+ numPesagens+":"+" "+9+" "+"x"+" "+10);
				
				//1ª pesagem em equilibrio
				//2ª pesagem em desequilibrio (lado esquerdo mais pesado)
				//3ª pesagem em equilibrio
				if(pesa1x1(9,10) == 0){
					numPesagens++;
					System.out.println("Resultado: (0) balança equilibrada." );
					System.out.println("Resposta: esfera "+11+" mais leve.");
				}
				
				//1ª pesagem em equilibrio
				//2ª pesagem em desequilibrio (lado esquerdo mais pesado)
				//3ª pesagem em desequilibrio(lado direito mais pesado)
				else if(pesa1x1(9,10) == 1){
					numPesagens++;
					System.out.println("Resultado: (1) lado direito mais pesado.");
					System.out.println("Resposta: esfera "+9+" mais leve.");
				}
				
				//1ª pesagem em equilibrio
				//2ª pesagem em desequilibrio (lado esquerdo mais pesado)
				//3ª pesagem em desequilibrio(lado esquerdo mais pesado)
				else{
					numPesagens++;
					System.out.println("Resultado: (-1) lado esquerdo mais pesado.");
					System.out.println("Resposta: esfera "+10+" mais leve.");
				}
				
			}
			
			//1ª pesagem em equilibrio
			//2ª pesagem em desequilibrio (lado esquerdo mais pesado)
			else if(pesa3x3(1,2,3,9,10,11) == 1){
				numPesagens++;
				System.out.println("Resultado: (1) lado direito mais pesado.");
				
				System.out.println("Pesagem "+ numPesagens+":"+" "+9+" "+"x"+" "+10);
				
				//1ª pesagem em equilibrio
				//2ª pesagem em desequilibrio (lado direito mais pesado)
				//3ª pesagem em equilibrio
				if(pesa1x1(9,10) == 0){
					numPesagens++;
					System.out.println("Resultado: (0) balança equilibrada." );
					System.out.println("Resposta: esfera "+11+" mais pesada.");
				}
				
				//1ª pesagem em equilibrio
				//2ª pesagem em desequilibrio (lado direito mais pesado)
				//3ª pesagem em desequilibrio (lado esquerdo mais pesado)
				else if(pesa1x1(9,10) == -1){
					numPesagens++;
					System.out.println("Resultado: (-1) lado esquerdo mais pesado.");
					System.out.println("Resposta: esfera "+9+" mais pesada.");
				}
				
				//1ª pesagem em equilibrio
				//2ª pesagem em desequilibrio (lado direito mais pesado)
				//3ª pesagem em desequilibrio (lado direito mais pesado)
				else{
					numPesagens++;
					System.out.println("Resultado: (1) lado direito mais pesado.");
					System.out.println("Resposta: esfera "+10+" mais pesada.");
				}
			}
			
		}
		
		//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
		else if(pesa4x4(1,2,3,4,5,6,7,8) == -1){
			numPesagens++;
			System.out.println("Resultado: (-1) lado esquerdo mais pesado.");
			
			System.out.println("Pesagem "+ numPesagens+":"+" "+1+" "+2+" "+5+" "+6+"x"+7+" "+9+" "+10+" "+11);
			
			//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
			//e 2ª pesagem em equilibrio
			if(pesa4x4(1,2,5,6,7,9,10,11) == 0){
				numPesagens++;
				System.out.println("Resultado: (0) balança equilibrada." );
				
				System.out.println("Pesagem "+ numPesagens+":"+" "+3+" "+8+" "+"x"+" "+9+" "+10);
				
				//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//2ª pesagem em equilibrio
				//3ª pesagem em equilibrio
				if(pesa2x2(3,8,9,10) == 0){
					numPesagens++;
					System.out.println("Resultado: (0) balança equilibrada." );
					System.out.println("Resposta: esfera "+4+" mais pesada.");
				}
				
				//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//2ª pesagem em equilibrio
				//3ª pesagem em desequilibrio (lado esquerdo mais pesado)
				else if(pesa2x2(3,8,9,10) == -1){
					numPesagens++;
					System.out.println("Resultado: (-1) lado esquerdo mais pesado.");
					System.out.println("Resposta: esfera "+3+" mais pesada.");
				}
				
				//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//2ª pesagem em equilibrio
				//3ª pesagem em desequilibrio (lado direito mais pesado)
				else{
					numPesagens++;
					System.out.println("Resultado: (1) lado direito mais pesado.");
					System.out.println("Resposta: esfera "+8+" mais leve.");
				}
				
			}
			
			//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
			//2ª pesagem em desequilibrio(lado direito mais pesado)
			else if(pesa4x4(1,2,5,6,7,9,10,11) == 1){
				numPesagens++;
				System.out.println("Resultado: (1) lado direito mais pesado.");
				
				System.out.println("Pesagem "+ numPesagens+":"+" "+5+" "+"x"+" "+9);
				
				//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//2ª pesagem em desequilibrio(lado direito mais pesado)
				//3ª pesagem em equilibrio
				if(pesa1x1(5,9) == 0){
					numPesagens++;
					System.out.println("Resultado: (0) balança equilibrada." );
					System.out.println("Resposta: esfera "+6+" mais leve.");
				}
				
				//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//2ª pesagem em desequilibrio(lado direito mais pesado)
				//3ª pesagem em desequilibrio(lado direito mais pesado)
				else if(pesa1x1(5,9) == 1){
					numPesagens++;
					System.out.println("Resultado: (1) lado direito mais pesado.");
					System.out.println("Resposta: esfera "+5+" mais leve.");
				}
				
			}
			
			//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
			//2ª pesagem em desequilibrio(lado esquerdo mais pesado)
			else if(pesa4x4(1,2,5,6,7,9,10,11) == -1){
				numPesagens++;
				System.out.println("Resultado: (-1) lado esquerdo mais pesado.");
				
				System.out.println("Pesagem "+ numPesagens+":"+" "+1+" "+7+" "+"x"+" "+9+" "+10);
				
				//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//2ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//3ª pesagem em equilibrio
				if(pesa2x2(1,7,9,10) == 0){
					numPesagens++;
					System.out.println("Resultado: (0) balança equilibrada." );
					System.out.println("Resposta: esfera "+2+" mais pesada.");
				}
				
				//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//2ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//3ª pesagem em desequilibrio (lado esquerdo mais pesado)
				else if(pesa2x2(1,7,9,10) == -1){
					numPesagens++;
					System.out.println("Resultado: (-1) lado esquerdo mais pesado.");
					System.out.println("Resposta: esfera "+1+" mais pesada.");
				}
				
				//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//2ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//3ª pesagem em desequilibrio (lado direito mais pesado)
				else{
					numPesagens++;
					System.out.println("Resultado: (1) lado direito mais pesado.");
					System.out.println("Resposta: esfera "+7+" mais leve.");
				}
			}
		
		}
		
		//1ª pesagem em desequilibrio(lado direito mais pesado)
		else{
			
			numPesagens++;
			System.out.println("Resultado: (1) lado direito mais pesado.");
			
			System.out.println("Pesagem "+ numPesagens+":"+" "+1+" "+2+" "+5+" "+6+"x"+3+" "+9+" "+10+" "+11);
			
			//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
			//2ª pesagem em equilibrio
			if(pesa4x4(1,2,5,6,3,9,10,11) == 0){
				numPesagens++;
				System.out.println("Resultado: (0) balança equilibrada." );
				
				System.out.println("Pesagem "+ numPesagens+":"+" "+7+" "+4+" "+"x"+" "+9+" "+10);
				
				//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//2ª pesagem em equilibrio
				//3ª pesagem em equilibrio
				if(pesa2x2(7,4,9,10) == 0){
					numPesagens++;
					System.out.println("Resultado: (0) balança equilibrada." );
					System.out.println("Resposta: esfera "+8+" mais pesada.");
				}
				
				//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//2ª pesagem em equilibrio
				//3ª pesagem em desequilibrio (lado esquerdo mais pesado)
				else if(pesa2x2(7,4,9,10) == -1){
					numPesagens++;
					System.out.println("Resultado: (-1) lado esquerdo mais pesado.");
					System.out.println("Resposta: esfera "+7+" mais pesada.");
				}
				
				//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//2ª pesagem em equilibrio
				//3ª pesagem em desequilibrio (lado direito mais pesado)
				else{
					numPesagens++;
					System.out.println("Resultado: (1) lado direito mais pesado.");
					System.out.println("Resposta: esfera "+4+" mais leve.");
				}
				
			}
			
			//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
			//2ª pesagem em desequilibrio(lado direito mais pesado)
			else if(pesa4x4(1,2,5,6,3,9,10,11) == 1){
				numPesagens++;
				System.out.println("Resultado: (1) lado direito mais pesado.");
				
				System.out.println("Pesagem "+ numPesagens+":"+" "+1+" "+"x"+" "+9);
				
				//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//2ª pesagem em desequilibrio(lado direito mais pesado)
				//3ª pesagem em equilibrio
				if(pesa1x1(1,9) == 0){
					numPesagens++;
					System.out.println("Resultado: (0) balança equilibrada." );
					System.out.println("Resposta: esfera "+2+" mais leve.");
				}
				
				//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//2ª pesagem em desequilibrio(lado direito mais pesado)
				//3ª pesagem em desequilibrio(lado direito mais pesado)
				else if(pesa1x1(1,9) == 1){
					numPesagens++;
					System.out.println("Resultado: (1) lado direito mais pesado.");
					System.out.println("Resposta: esfera "+1+" mais leve.");
				}
				
			}
			
			//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
			//2ª pesagem em desequilibrio(lado esquerdo mais pesado)
			else if(pesa4x4(1,2,5,6,3,9,10,11) == -1){
				numPesagens++;
				System.out.println("Resultado: (-1) lado esquerdo mais pesado.");
				System.out.println("Pesagem "+ numPesagens+":"+" "+3+" "+5+" "+"x"+" "+9+" "+10);
				
				//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//2ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//3ª pesagem em equilibrio
				if(pesa2x2(3,5,9,10) == 0){
					numPesagens++;
					System.out.println("Resultado: (0) balança equilibrada." );
					System.out.println("Resposta: esfera "+6+" mais pesada.");
				}
				
				//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//2ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//3ª pesagem em desequilibrio(lado esquerdo mais pesado)
				else if(pesa2x2(3,5,9,10) == -1){
					numPesagens++;
					System.out.println("Resultado: (-1) lado esquerdo mais pesado.");
					System.out.println("Resposta: esfera "+5+" mais pesada.");
				}
				
				//1ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//2ª pesagem em desequilibrio(lado esquerdo mais pesado)
				//3ª pesagem em desequilibrio(lado direito mais pesado)
				else{
					numPesagens++;
					System.out.println("Resultado: (1) lado direito mais pesado.");
					System.out.println("Resposta: esfera "+3+" mais leve.");
				}
			}
			
			
		}
		
	}
	
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		
		for(int i = 1;i <= 12;i++){
			DesafioDasEsferas dde = new DesafioDasEsferas();
			
			
			dde.defineEsferaDiferente(i, false);
			
			System.out.println("Inicio do Desafio: esfera "+dde.esferaDiferente+" mais leve.");
			System.out.println();
			
			dde.resolveDesafioDasDozeEsferas();
			System.out.println();
			
		}
		
		for(int i = 1;i <= 12;i++){
			DesafioDasEsferas dde = new DesafioDasEsferas();
			
			
			dde.defineEsferaDiferente(i, true);
			
			System.out.println("Inicio do Desafio: esfera "+dde.esferaDiferente+" mais pesada.");
			System.out.println();
			
			dde.resolveDesafioDasDozeEsferas();
			
			System.out.println();
		}
	}
		
}
