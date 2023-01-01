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

        void addVertex(String label) {
          adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
        }

        void removeVertex(String label) {
            Vertex v = new Vertex(label);

            adjVertices.values().stream().forEach(e -> e.remove(v));
            adjVertices.remove(new Vertex(label));
        }
    }
    public static void main(String[] args) {}
}
