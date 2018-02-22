package warmup.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.io.DOTImporter;
import org.jgrapht.io.EdgeProvider;
import org.jgrapht.io.ImportException;
import org.jgrapht.io.VertexProvider;

import warmup.dao.Person;
import warmup.dao.Relation;

public class GotGraphBuilder {
	/**
     * Imports the specified dot file and builds the Graph from it
     *
     * @param dotFileName denotes a string containing the .dot file name
     * @return a Graph based on dot file input
     */
	public Graph < Person, DefaultEdge > buildGraph(String dotFileName) {
		// creating a default directed graph
		Graph<Person, DefaultEdge> g = new DefaultDirectedGraph<Person, DefaultEdge>(DefaultEdge.class);
		
		// Reader buffer to load dot file
		Reader in = null;
		
		try {
			// importing file from the resource package
			in = new FileReader("src/main/resources/"+dotFileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		VertexProvider <Person> node = new Person();
		EdgeProvider <Person,DefaultEdge> edge = new Relation();
		DOTImporter<Person,DefaultEdge> fetch = new DOTImporter<Person , DefaultEdge>(node,edge);
		
		try {
			// importing the dot file 
			fetch.importGraph(g, in);
		} catch (ImportException e) {
			e.printStackTrace();
		}
		
		return g;
	}
}
