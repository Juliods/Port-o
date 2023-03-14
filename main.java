package project_00;
import java.util.Scanner;




public class main {
	public static void main(String[] args) {
		// This part of the code tells the user how to use the system

		
		int i = 1;
				
		System.out.println("Gate software V:0.1");
		//perguntas sobre o status atual do portão
		while (i == 1){ 
		System.out.println("Is the gate open?");
		Scanner scn = new Scanner(System.in);
		System.out.println("0 = gate closed | 1 = gate open \n");
		int gate_state = scn.nextInt();
		
		if ( gate_state == 1) {
			System.out.println("You typed: " + gate_state);
		} else if (gate_state == 0){
			System.out.println("You typed: " + gate_state);
		} else {
			System.out.println("You typed: " + "Invalid number, try again");
		}
		System.out.println("Type 0 to close the gate or 1 to open the gate\n");
		int gate_action = scn.nextInt();
		/* inicialmente o software receberia um sinal de um sensor, mas não foi
		possível implementar isso, mas para tal, basta subistituir este bloco com a entrada do sensor
		*/
		if ( gate_action == 1 && gate_state == 0) {
			System.out.println("The gate will now open\n To run this program again, type 1 or to exit type 0");
			//E é aqui que o comando para abrir o portão iria
			i = scn.nextInt();
		} else if (gate_action == 1 && gate_state == 1){
			System.out.println("The gate should be already open\n To run this program again, type 1 or to exit type 0\n If the gate is still closed, run the program again and inform that the gate is open\n If problem persists, the gate's motor might be broken or stuck");
			i = scn.nextInt();
		} else if (gate_action == 0 && gate_state == 1){
			System.out.println("The gate will now close\n To run this program again, type 1 or to exit type 0");
			//This is where the signal to close the gate would go
			i = scn.nextInt();
		} else if (gate_action == 0 && gate_state == 0){
			System.out.println("The gate should be already closed\n To run this program again, type 1 or to exit type 0\n If the gate is still open, run the program again and inform that the gate is open\n If problem persists, the gate's motor might be broken or stuck");
			i = scn.nextInt();
		} else {
			System.out.println("You typed: " + "Invalid number\\n To run this program again, type 1 or to exit type 0");
			i = scn.nextInt();
		}
		
		}
	}
}
