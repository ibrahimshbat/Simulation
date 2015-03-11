package RandomACKs;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ServerRandomAckWithFourServers {
	
	public static void main(String [] args) throws IOException{
	

	    PrintWriter outFile = new PrintWriter(new BufferedWriter(new FileWriter("d://data.txt",true)));
	    int totalAckGenerated=0;
	    int totalNonAckGenerated=0;
	    int maxSequentialAck=0;
	    int maxSequentialNonAck=0;
	    int totalSucceed = 0;
	    int totalUnsucceed = 0;
	    int twoAck=0;
	    int threeAck = 0;
	    int fourAck=0;
	    int oneNAck=0;
	    int oneAck=0;
	    int zeroAck=0;
	    int serverNumber;
	    int iterationNumber;
	    double rand;
		Random random=new Random();
		Scanner readNumber= new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#.#");
		int tempMaxAck=0;
		int tempMaxNonAck=0;
		
		//System.out.println("Enter server number ");
		serverNumber = 4;
		
		//System.out.println("Enter iteration number ");
		//iterationNumber =readNumber.nextInt();;
		
		
		
		for (int i=1;i<=1000;i++){
			System.out.println("Iteration (" + i + ")");

			totalAckGenerated = 0;
			totalNonAckGenerated = 0;
			//Loop to obtain 4 random number
			for (int j = 1; j <= 4; j++){
				
				rand=random.nextDouble();
				System.out.println(rand);
				
				//TO check if the majority are vote
				if (rand > 0.366 ) {
					totalAckGenerated ++;	
				}
				
				else {
					totalNonAckGenerated ++;	
					
				}
				
			
			}
			   if (totalAckGenerated == 2){
			    	twoAck ++;
			    }
			    
			    else if (totalAckGenerated == 3){
			    	threeAck ++;
			    }
			    		    
			    else if (totalAckGenerated == 4){
			    	fourAck ++;
			    }
			    else if (totalAckGenerated == 1){
			    	oneAck ++;
			    }
				else if (totalAckGenerated == 0){ 
			    	zeroAck ++;
			    }
			
			System.out.println("Total "+totalAckGenerated);
 

		    
			if (totalAckGenerated >= 2){
				System.out.println("Succeed, Majority generate ACK --> ACKS = " + totalAckGenerated);
				totalSucceed ++;
				if (tempMaxNonAck != 0){
					System.out.println("UnSucceed number seqentual up to " + tempMaxNonAck);
		        }
				tempMaxNonAck = 0;
			    tempMaxAck ++;
			    
			    if (tempMaxAck > maxSequentialAck){
			    	maxSequentialAck = tempMaxAck; 	
			    }
			    
			    

			    
			    
			}
			
			
			else {
				
				System.out.println("fail, Not Majority generate ACK --> ACKS = " + totalNonAckGenerated);
			     totalUnsucceed ++;
			     //System.out.println("Succeed number seqentual up to " + tempMaxAck);
			     tempMaxAck=0;
			     tempMaxNonAck ++;
				    if (tempMaxNonAck > maxSequentialNonAck){
				    	maxSequentialNonAck = tempMaxNonAck; 	
				    }
				    
//				    if (totalNonAckGenerated == 4){
//				    	zeroAck ++;
//				    	//twoNAck ++;
//				    }
//				    else if(totalNonAckGenerated == 3){
//				    	oneNAck ++;
//				    	
//				    }
			     
	
			}
			
				
		}
		 
		 
//		System.out.println("Total succeed = " + totalSucceed + " out of 1000");
 		outFile.print("" + totalSucceed);
//		System.out.println("Total Unsucceed = " + totalUnsucceed + " out of 1000");
     	outFile.print(" " + totalUnsucceed);
//		outFile.println();
		//System.out.println("Max obtain majority ACK = " + maxSequentialAck);
		//outFile.print(" " + totalUnsucceed);
		//System.out.println("Max obtain majority NonACK = " + maxSequentialNonAck);
		//outFile.print("       " + maxSequentialNonAck);
		System.out.println("Total number of servers vote 2 = " + twoAck);
		outFile.print(" " + 	zeroAck);
		outFile.print(" " + 	oneAck);
		outFile.print(" " + twoAck);
		System.out.println("Total number of servers vote 3 = " + threeAck);
		outFile.print(" " + threeAck);
		System.out.println("Total number of servers vote 4 = " + fourAck);
		outFile.print(" " + fourAck);
		System.out.println("Total number of servers vote 1 = " + oneAck);
		System.out.println("Total number of servers vote 0 = " + zeroAck);
		System.out.println("Total number of servers vote 0 = " + (zeroAck+oneAck+twoAck+threeAck+fourAck));


		//outFile.print("     " + twoNAck);
		
		outFile.println();
		outFile.close();


	
}
	}