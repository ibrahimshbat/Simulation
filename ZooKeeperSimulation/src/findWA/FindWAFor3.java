package findWA;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FindWAFor3 {

	public static void main(String [] args) throws IOException{
		Scanner read = new Scanner(System.in);
	    //PrintWriter outFile = new PrintWriter(new BufferedWriter(new FileWriter("d://FindWA.csv",true)));
		double A=0, W=0, P=0, q00=0, q01=0, q110, numA=0.0, demA=0.0,numW=0.0, demW=0.0, startP=0,endP=0, j=0.0;
		int ensembleSize=0;
		//System.out.println("Enter P value:");
		startP= 0.2;
		endP=1.0;
		
		for (double i = 0.0; i <=1.05; i+=0.05) {
		
			j =Double.parseDouble(new DecimalFormat("##.##").format(i));
			findAW(j);			
			System.out.println("i=: "+j);
		}
		
	}
	public static void findAW(double P) throws IOException{
	   PrintWriter outFile = new PrintWriter(new BufferedWriter(new FileWriter("d://FindWA.csv",true)));
		double A=0, W=0, numA=0.0, demA=0.0,numW=0.0, demW=0.0;
		//Compute A
		numA = 2*P;
		demA = (1-(Math.pow((1-P),2)));
		numW=(Math.pow((1-P),2));
		demW=(1-(Math.pow((1-P),2)));
		if (demA==0.0 && numA==0.0){
			A=0.0;
		}
		else if(demA==0.0 && numA!=0.0){
			A=Double.POSITIVE_INFINITY;
		}
		else{
			A= numA/demA;
		}
		//Compute W
		if (demW==0.0 && numW==0.0){
			W=0.0;
		}
		else if(demW==0.0 && numW!=0.0){
			W=Double.POSITIVE_INFINITY;
		}
		else{
			W = numW/demW;
		}
		System.out.println("A=: "+A+" W=: "+W+" 1+W=: "+(1+W));
		//outFile.println("P,A,W,1+W");
		outFile.println(P+","+A+","+W+","+(1+W));
		outFile.close();
	}
}