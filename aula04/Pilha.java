public class Pilha<T> {
    // push(insere), pop(retira), peek(mostra)
    private String nomePilha;
    private No<T> topo;
    private T dado;

    public Pilha(){
        this("");
    }
    public Pilha(String nomePilha){
        this.nomePilha = nomePilha;
        this.topo = null;

    }
    public void push(T dado){
        No<T> novoNo = new No<T>(dado);
        novoNo.setNextNo(topo);
        topo = novoNo;
    }

    public void imprimePilha (){
        if (topo == null){
            System.out.println("Lista vazia");
        }
        else{
            System.out.printf("Dados da pilha é: %s \n", nomePilha);
            No<T> aux = topo;
            while (aux != null){
                System.out.println("{ " + aux.getDado() + " }");
                aux = aux.getNextNo();
            }
        }

    }
    public T peek(){
        if(topo == null){
            System.out.println("Lista vazia!");
            return null;
        }
            return topo.getDado();
    }
    public T pop(){
        if(topo == null){
            System.out.println("Lista vazia!");
            return null;
        }
        T dadoTemp = topo.getDado();
        topo = topo.getNextNo();
        return dadoTemp;

    }

}
