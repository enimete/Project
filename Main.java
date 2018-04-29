import java.util.Scanner;
import java.io.*;
public class Main {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int v = 10;
		AdjacencyListADT newList = new AdjacencyListADT(v);
		AdjacencyListADT.addEdge(newList, 0, 1, 1);
		AdjacencyListADT.addEdge(newList, 0, 2, 2);
		AdjacencyListADT.addEdge(newList, 1, 3, 1);
		AdjacencyListADT.addEdge(newList, 3, 4, 1);
		AdjacencyListADT.addEdge(newList, 3, 6, 3);
		AdjacencyListADT.addEdge(newList, 4, 6, 1);
		AdjacencyListADT.addEdge(newList, 6, 8, 2);
		AdjacencyListADT.addEdge(newList, 8, 9, 1);
		AdjacencyListADT.addEdge(newList, 2, 5, 3);
		AdjacencyListADT.addEdge(newList, 5, 7, 1);
		AdjacencyListADT.addEdge(newList, 7, 9, 3);
		
		
		
		AdjacencyListADT.printGraph(newList);
		
		System.out.print("What is the weight between ");
		int first = scan.nextInt();
		System.out.print(" and ");
		int second = scan.nextInt();
		System.out.print("\n");
		System.out.print("The weight between " + first + " and " + second + " is " + AdjacencyListADT.edgeWeight(newList, first, second));
		
	}

}
