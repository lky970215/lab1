package welcome;
//bnm,fffffff
import java.util.*;
public class Graph {
	
	private List<Vertex> vertexList;
	private Map<String,List<Edge>> ve_Map;
	
	public Graph(List<Vertex> vertexList, Map<String,List<Edge>> ve_Map) {
		super();
		this.vertexList = vertexList;
		this.ve_Map = ve_Map;
	}
	
	public List<Vertex> getVertexList() {
		return vertexList;
	}
	
	public void setVertexList(List<Vertex> vertexList) {
		this.vertexList = vertexList;
	}
	
	public Map<String,List<Edge>> get_ve_Map() {
		return ve_Map;
	}
	
	public void set_ve_Map(Map<String,List<Edge>> ve_Map) {
		this.ve_Map = ve_Map;
	}
	
	static class Edge {
//		private Vertex start;
		private Vertex end;
		private int weight;
	    
		public Edge(/*Vertex start, */Vertex end, int weight) {
			super();
//			this.start = start;
			this.end = end;
			this.weight = weight;
		}
		
		public Edge() {}
		
//		public Vertex getStart() {
//			return start;
//		}
//		
//		public void setStart(Vertex start) {
//			this.start = start;
//		}
		
		public Vertex getEnd() {
			return end;
		}
		
		public void setEnd(Vertex end) {
			this.end = end;
		}
		
		public int getWeight() {
			return weight;
		}
		
		public void upWeight() {
			this.weight++;
		}
	}
	
	static class Vertex{
		private final static int INF = Integer.MAX_VALUE;
		
		private String name;
		private boolean visited;
		private int adj;
		private Vertex parent;
		
		public Vertex(String name) {
			this.visited = false;
			this.adj = INF;
			this.parent = null;
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public int getAdj() {
			return adj;
		}
		
		public Vertex getParent() {
			return parent;
		}

	}
}
