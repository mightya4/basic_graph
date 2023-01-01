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
    }
    public static void main(String[] args) {}
}
