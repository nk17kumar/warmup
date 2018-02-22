package com.warmup.demo;

import java.util.Set;

import org.jgrapht.*;
import org.jgrapht.graph.DefaultEdge;

import com.warmup.dao.Input;
import com.warmup.dao.Person;
import com.warmup.util.GotGraphBuilder;
import com.warmup.util.Solver;

/**
 * @author nk17kumar
 *
 */

public class Demo {
	
	// holds the input data
	private Input info;
	
	/**
     * Validates the command line argument
     *
     * @param args String array containing 3 command line arguments
     * @return a graph based on URL objects.
     */
	public boolean checkCommandLineArgs(String[] args) {
		if(args.length != 3) 
			return false;
		else
			return true;
	}
	
	/**
     * Initializes the info data
     *
     * @param args String array containing 3 command line arguments
     */
	public void setInputDetaills(String[] args) {
		this.info = new Input();
		this.info.setFileName(args[0]);
		this.info.setPerson1(args[1]);
		this.info.setPerson2(args[2]);
	}
	
	
	/**
     * Main driver code starts here
     *
     * @param args three space separated Strings denoting 
     * dot file name,person 1 and person 2 respectively
     */
	public static void main(String args[]) {
		
		Demo obj = new Demo();
		
		// checking for valid command line arguments
		boolean ok = obj.checkCommandLineArgs(args);
		
		if(ok == false) {
			System.out.println("invalid command line input");
		}
		else {
			// fetch the input values
			obj.setInputDetaills(args);
			
			// building graph from the input file
			GotGraphBuilder gotGraph = new GotGraphBuilder();
			Graph < Person , DefaultEdge > g = gotGraph.buildGraph(obj.info.getFileName());
			
			// creating object for Solver class
			Solver executer = new Solver(g);
			
			// fetching LCAs for given input
			Set <Person> lca = executer.closestAncestors(obj.info.getPerson1(),obj.info.getPerson2());
			
			if(lca == null || lca.size() == 0) {
				System.out.println("no common ancestor exists");
			}
			else {
				// iterating on all common ancestors for person 1 and person 2
				for(Person p : lca) {
					System.out.println(p);
				}
			}
		}
		
	}

}
