public class BasicGraph {

    //Build Vertex for each node of Graph
    class Vertex {
        String label;
        Vertex(String label) {
            this.label = label;
        }
    }

    class Graph {
        private Map<Vertex, List<Vertex>> adjVertices;
    }
    public static void main(String[] args) {}
}
