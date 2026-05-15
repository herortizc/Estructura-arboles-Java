public class BST {

    private Nodo raiz;

    public BST() {
        raiz = null;
    }

    // =========================
    // INSERT
    // =========================
    public void insert(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo actual, int valor) {

        if (actual == null) {
            return new Nodo(valor);
        }

        if (valor < actual.valor) {
            actual.izquierdo = insertarRec(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRec(actual.derecho, valor);
        }

        return actual;
    }

    // =========================
    // SEARCH
    // =========================
    public boolean search(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Nodo actual, int valor) {

        if (actual == null) {
            return false;
        }

        if (valor == actual.valor) {
            return true;
        }

        if (valor < actual.valor) {
            return buscarRec(actual.izquierdo, valor);
        } else {
            return buscarRec(actual.derecho, valor);
        }
    }

    // =========================
    // DELETE
    // =========================
    public void delete(int valor) {
        raiz = eliminarRec(raiz, valor);
    }

    private Nodo eliminarRec(Nodo actual, int valor) {

        if (actual == null) {
            return null;
        }

        if (valor < actual.valor) {
            actual.izquierdo = eliminarRec(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = eliminarRec(actual.derecho, valor);
        } else {

            // Caso 1: sin hijos
            if (actual.izquierdo == null && actual.derecho == null) {
                return null;
            }

            // Caso 2: un hijo
            if (actual.izquierdo == null) {
                return actual.derecho;
            }

            if (actual.derecho == null) {
                return actual.izquierdo;
            }

            // Caso 3: dos hijos
            int menorValor = encontrarMinimo(actual.derecho);
            actual.valor = menorValor;
            actual.derecho = eliminarRec(actual.derecho, menorValor);
        }

        return actual;
    }

    private int encontrarMinimo(Nodo nodo) {
        while (nodo.izquierdo != null) {
            nodo = nodo.izquierdo;
        }
        return nodo.valor;
    }

    // =========================
    // RECORRIDOS
    // =========================

    public void inOrder() {
        inOrderRec(raiz);
        System.out.println();
    }

    private void inOrderRec(Nodo nodo) {
        if (nodo != null) {
            inOrderRec(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inOrderRec(nodo.derecho);
        }
    }

    public void preOrder() {
        preOrderRec(raiz);
        System.out.println();
    }

    private void preOrderRec(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preOrderRec(nodo.izquierdo);
            preOrderRec(nodo.derecho);
        }
    }

    public void postOrder() {
        postOrderRec(raiz);
        System.out.println();
    }

    private void postOrderRec(Nodo nodo) {
        if (nodo != null) {
            postOrderRec(nodo.izquierdo);
            postOrderRec(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
}