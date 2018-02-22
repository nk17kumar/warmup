package warmup.dao;

import java.util.Map;

import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.io.Attribute;
import org.jgrapht.io.EdgeProvider;

/**
 * Depicts the relation between the two Person
 * Acts as Edge object in the GOT family tree graph
 *  
 * @author nk17kumar
 */
public class Relation extends DefaultEdge implements EdgeProvider<Person, DefaultEdge> {
	
	private static final long serialVersionUID = 1L;
	
	// Stores the ancestor in the directed edge
	private Person start;
	
	// Stores the descendant in the directed edge
	private Person end;
	
	// Unique String to identify an edge
	private String id;
	
	public Person getStart() {
		return start;
	}

	public void setStart(Person start) {
		this.start = start;
	}

	public Person getEnd() {
		return end;
	}

	public void setEnd(Person end) {
		this.end = end;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Relation(Person start, Person end, String id) {
		super();
		this.start = start;
		this.end = end;
		this.id = id;
	}

	public Relation() {
		super();
	}

	/* Builds the edge from the specified parameters
	 * 
	 * @see org.jgrapht.io.EdgeProvider#buildEdge(java.lang.Object, java.lang.Object, java.lang.String, java.util.Map)
	 * @param from  ancestor node in the edge
	 *        to  descendant node in the edge
	 *        label unique id for an edge
	 *        attributes additional features of the edge
	 * @return Relation edge from the specified parameters 
	 */
	public Relation buildEdge(Person from, Person to, String label, Map<String, Attribute> attributes) {
		return new Relation(from, to, label);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Relation)) {
			return false;
		}

		Relation edge = (Relation) obj;
		return id.equals(edge.id);
	}

}
