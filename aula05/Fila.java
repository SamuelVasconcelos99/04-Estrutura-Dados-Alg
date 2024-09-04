public class Fila<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeFila;

    public Fila(){
        this("");
    }
    public Fila(String nomeFila){
        this.nomeFila = nomeFila;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }
    public void enfileirar(T dado){
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null){
            primeiroNo = ultimoNo = novoNo;
        }
        else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }    
    }
    public void imprimeFila(){
        if (primeiroNo == null){
            System.out.println("Fila vazia!");
        }
        else{
            System.out.println("Dados da fila " + nomeFila);
            No<T> aux = primeiroNo;
            while (aux != null){
                System.out.printf("{" + aux.getDado() + "}");
                aux = aux.getNextNo();
            }
            System.out.println();
        }
    }

}
