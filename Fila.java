

public class Fila {

    private Cliente[] fila;
    private int quantidade;
    private int prioritariosAtendidos;


    public Fila(){
        fila = new Cliente[10];
        quantidade = 0;
        prioritariosAtendidos = 0;
    }

    public void enfileirar (Cliente cliente) {

        if (quantidade == fila.length) {
            System.out.println("Fila cheia!");
            return;
        }
        fila[quantidade] = cliente;
        quantidade++;
    }
    public Cliente espiar() {

        if (quantidade == 0 ) {
            System.out.println("Fila vazia!");
            return null;
        }
        return fila[0];
    }
    public Cliente desenfileirar() {

        if (quantidade == 0) {
            System.out.println("Fila vazia!");
            return null;
        }

        int indice = 0;

        if (temPrioridade() && prioritariosAtendidos < 3) {

            for (int i = 0; i < quantidade; i++) {
                if (fila[i].isPrioridade()) {
                    indice = i;
                    break;
                }
            }

            prioritariosAtendidos++;

        } else if (temNormal()) {

            for (int i = 0; i < quantidade; i++) {
                if (!fila[i].isPrioridade()) {
                    indice = i;
                    break;
                }
            }

            prioritariosAtendidos = 0;

        } else {

            for (int i = 0; i < quantidade; i++) {
                if (fila[i].isPrioridade()) {
                    indice = i;
                    break;
                }
            }

            prioritariosAtendidos++;
        }

        Cliente cliente = fila[indice];

        for (int i = indice; i < quantidade - 1; i++) {
            fila[i] = fila[i + 1];
        }

        fila[quantidade - 1] = null;
        quantidade--;

        return cliente;
    }
    public void listar() {
        if (quantidade == 0) {
            System.out.println("Fila vazia!");
            return;
        }
        System.out.println(" === Pacientes na fila === ");

        for (int i = 0; i < quantidade; i++){
            System.out.println(fila[i]);
        }
    }

    private boolean temPrioridade() {
        for (int i = 0; i < quantidade; i++){
            if (fila[i].isPrioridade()){
                return true;
            }
        }
        return false;
    }
    private boolean temNormal(){
        for (int i = 0; i < quantidade; i++ ){
            if (!fila[i].isPrioridade()){
                return true;
            }
        }
        return false;
    }

}

