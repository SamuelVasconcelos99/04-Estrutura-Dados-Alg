public class Lista<T>{
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeLista;

    public Lista(){
        this("Lista");
    }

    public Lista(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;

        }else{
            novoNo.setAux(primeiroNo);
            primeiroNo = novoNo;
        }
    }
    public void addFinal(T dado){
        No<T> novoNo = new No<T>(dado);
        if (ultimoNo == null){
            primeiroNo = novoNo = ultimoNo;
        }
        else {
            ultimoNo.setAux(novoNo);
            ultimoNo = novoNo;
        }
    }
    public void imprimirDados(){
        if(primeiroNo == null){
            System.out.println("Lista vazia");
        }
        else {
            System.out.printf("Dados da Lista %s: \n",nomeLista);
            No<T> noAux = primeiroNo;
            while(noAux != null){
                System.out.printf("{%s}\n", noAux.getDado());
                noAux = noAux.getAux();
            }
        }
    }
    public void removeInicio(){
        if (primeiroNo == null){
            System.out.println("Lista vazia!");
        }
        else{
            System.out.printf("O dado: {%s} está sendo removido da lista!\n",primeiroNo.getDado());
            primeiroNo = primeiroNo.getAux();
        }
    }
    public void removeFinal(){
        if (primeiroNo == null){
            System.out.printf("Lista vazia!");
        }
        else {
            System.out.printf("Dado: {%s} está sendo removido da lista! \n", ultimoNo.getDado());
            No<T> noAux = primeiroNo;
            while (noAux.getAux() != ultimoNo) {
                noAux = noAux.getAux();
            }
            ultimoNo = noAux;
            noAux.setAux(null);

        }
    }
}