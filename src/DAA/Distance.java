package DAA;
import DAA.Vehicle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
										//extends - indicates that a class is inherited from another class
public class Distance extends JFrame {	//JFrame works like the main window where components are added to create a GUI.
JTable jt1;					//make a table jt1
String [] column_headers1={"ZipCode1","ZipCode2", "Distance"};
String [][] team_statistics1={{"64151","64149","10"},{"64151","63210","100"},
		{"","",""},
		{"64149","64230","50"},
		{"","",""},
		{"64230","63210","10"},
		{"","",""},
		{"64372","64230","20"},{"64372","63210","60"},
		{"","",""},
		{"63210","64149","120"}
};


	public Distance()
	{
		jt1=new JTable(team_statistics1,column_headers1);
		jt1.setBounds(50,50,200,230);	//To specify the position and size of the components manually -(x,y,width,height)
		JScrollPane js1 = new JScrollPane(jt1);	//used to make scrollable view of a component.
		this.add(js1);
		this.setSize(800,900);
		this.setVisible(true);	//displaying table
		PrintWriter out1 = null ;	// prints output in readable form
		try {
            //out = new PrintWriter(new FileWriter("C:\\Users\\Pranathi Gopidi\\eclipse-workspace\\DAA\\src\\DAA\min.txt",true),true);
        	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\smrit\\eclipse-workspace\\Emergency-Vehicle-Dispatch\\src\\DAA\\min.txt"));
            } catch (IOException e) {
                  e.printStackTrace();	//prints the same message of e object and also the line number where the exception occurred
            }
        //out1.println(js1);
        //out1.close();
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Distance();
	}

}