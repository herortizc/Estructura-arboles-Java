public class Main {

    public static void main(String[] args) {

        BST arbol = new BST();

        // =========================
        // INSERTAR VALORES
        // =========================
        arbol.insert(50);
        arbol.insert(30);
        arbol.insert(70);
        arbol.insert(20);
        arbol.insert(40);
        arbol.insert(60);
        arbol.insert(80);

        System.out.println("Recorrido InOrder (ordenado):");
        arbol.inOrder();

        System.out.println("Recorrido PreOrder:");
        arbol.preOrder();

        System.out.println("Recorrido PostOrder:");
        arbol.postOrder();

        // =========================
        // BUSCAR
        // =========================
        System.out.println("\nBuscar 40: " + arbol.search(40));
        System.out.println("Buscar 100: " + arbol.search(100));

        // =========================
        // ELIMINAR
        // =========================
        System.out.println("\nEliminar nodo 20 (sin hijos)");
        arbol.delete(20);
        arbol.inOrder();

        System.out.println("Eliminar nodo 30 (un hijo)");
        arbol.delete(30);
        arbol.inOrder();

        System.out.println("Eliminar nodo 50 (dos hijos)");
        arbol.delete(50);
        arbol.inOrder();
    }
}