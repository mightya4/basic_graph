import java.util.List;
import java.util.Map;
import java.util.ArrayList;
public class BasicGraph {

    //Build Vertex for each node of Graph
    class Vertex {
        String label;
        Vertex(String label) {
            this.label = label;
        }
    }

    class Graph {
        //Map takes parameters Vertex + adjacency list of vertex
        private Map<Vertex, List<Vertex>> adjVertices;

        //Add Vertex while vertex does not exist
        void addVertex(String label) {
          adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
        }

        //Remove specified vertex
        void removeVertex(String label) {
            Vertex v = new Vertex(label);

            adjVertices.values().stream().forEach(e -> e.remove(v));
            adjVertices.remove(new Vertex(label));
        }

        //Add Edge between two Vertex
        void addEdge(String label1, String label2){
            Vertex v1 = new Vertex(label1);
            Vertex v2 = new Vertex(label2);
            adjVertices.get(v1).add(v2);
            adjVertices.get(v2).add(v1);
        }

        //Remove Edge between two Vertex
        void removeEdge(String label1, String label2) {
            Vertex v1 = new Vertex(label1);
            Vertex v2 = new Vertex(label2);
            List<Vertex> eV1 = adjVertices.get(v1);
            List<Vertex> eV2 = adjVertices.get(v2);
            if (eV1 != null) {eV1.remove(v2);}
            if (eV2 != null) {eV2.remove(v1);}
        }

        //Get Adjacent Vertices
        List<Vertex> getAdjVertices(String label) {
            return adjVertices.get(new Vertex(label));
        }

        //Create Sample Graph
        Graph createGraph() {
            Graph graph = new Graph();
            graph.addVertex("Bob");
            graph.addVertex("Alice");
            graph.addVertex("Mark");
            graph.addVertex("Rob");
            graph.addVertex("Maria");
            graph.addEdge("Bob", "Alice");
            graph.addEdge("Bob", "Rob");
            graph.addEdge("Alice", "Mark");
            graph.addEdge("Rob", "Mark");
            graph.addEdge("Alice", "Maria");
            graph.addEdge("Rob", "Maria");
            return graph;
        }
    }
    public static void main(String[] args) {
        
    }
}
