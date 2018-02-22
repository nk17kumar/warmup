package com.warmup.util;

import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.alg.NaiveLcaFinder;
import org.jgrapht.graph.DefaultEdge;

import com.warmup.dao.Person;

/**
 * Utility to find LCAs of two person
 * 
 * @author nk17kumar
 */
public class Solver {
	
	private NaiveLcaFinder<Person, DefaultEdge> solver;
	
	public Set <Person> closestAncestors(Person a,Person b) {
		return solver.findLcas(a, b);
	}
	
	public Solver(Graph <Person , DefaultEdge> graph ) {
		solver = new NaiveLcaFinder<Person, DefaultEdge>(graph);
	}
}
