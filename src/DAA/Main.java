package DAA;
import DAA.Vehicle;
import DAA.Vertex;
import DAA.Distance;
import DAA.Edge;
import DAA.mainy;
import DAA.Dijkstra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import javax.swing.JOptionPane;
  

public class Main extends Dijkstra {

	public static Vertex Zip = null;
	
	public Main(Vertex argTarget, double argWeight) {
		super(argTarget, argWeight);

	}



	public static void main(String[] args) throws IOException{
		
		//step-1 - creating tables
		new Vehicle();
		new Distance();
		
		//step-2 - input zip code
		String zipcode = JOptionPane.showInputDialog("Enter the zipcode");
		System.out.print("Given zipcode is: "+zipcode+"\n");
		
		//step-3 - finding shortest path
		
		Vertex Zip = new Vertex(zipcode);
		System.out.println("\n"+"Using Dijkstra's Algo,"+"\n"+"shortest paths from given zipcodes are displayed below");
		Zip.vertexrun(Zip);
		
		//step-4
		//mainy call
		//selected vehicle %d is available at _
		new mainy().run();
		
		Zip.dispatchVehicle();
		
	}
	
}
