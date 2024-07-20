import java.util.Scanner;


public class x_arbogast_assembly{

	//-------
	static public int[] registers={0,0,0,0};
	static public String[] code=new String[100];
	static public int line_number;
	//-------
	
	
	static void Register_print(){

		for(int i=0;i< registers.length;i++){
			System.out.println("R" + (i+1)+ "=" + registers[i]);
		}
	}
	
	static void Usser_input(){
		Scanner input=new Scanner(System.in);

		System.out.print("R1=");
		registers[0]=input.nextInt();

		System.out.print("R2=");
		registers[1]=input.nextInt();

		System.out.print("R3=");
		registers[2]=input.nextInt();

		System.out.print("R4=");
		registers[3]=input.nextInt();

		System.out.println("");

		System.out.print("How long should you code be?:");
		int code_leaght=input.nextInt();

		for(int i=0;i<code_leaght;i++){
			System.out.print((i+1)+".");
			code[i]=input.next();
			
		}



	}

	
	public static void main(String[] arg){
		
		Usser_input();
		


		while(true){
			
			
			//E funktions
			if(code[line_number].charAt(0)- '0' == 21){
				break;

			}

			//P
			if(code[line_number].charAt(0)- '0' == 32){
				registers[(code[line_number].charAt(1)- '0')-1]++;
				line_number++;
				continue;
			}

			//M
			if(code[line_number].charAt(0)- '0' == 29){
				registers[(code[line_number].charAt(1)- '0')-1]--;
				line_number++;
				continue;
			}

			//J funfktions
			if(code[line_number].charAt(0)- '0' == 26){
				line_number=(code[line_number].charAt(1)- '0')-1;
				continue;
			}

			//C
			if(code[line_number].charAt(0)- '0' == 19){

				if(registers[(code[line_number].charAt(1)- '0')-1] > 0 ){
					line_number++;
					continue;
				}

				if(registers[(code[line_number].charAt(1)- '0')-1] <= 0 ){
					line_number+=2;
					continue;
				}

				
			}

			
		}
		
		System.out.println("");
		System.out.println("Output:");
		Register_print();
	}
}