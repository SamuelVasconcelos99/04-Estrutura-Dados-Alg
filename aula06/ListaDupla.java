public class ListaDupla<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private String nomeLista;

    public ListaDupla(){
        this("Lista Duplamente Encadeada");
    }

    public ListaDupla(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }
    
    public void addInicio(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if(primeiroNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;
        }
    }
    public void addFinal (T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if (primeiroNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            ultimoNo.setProximoNo(novoNo);
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo = novoNo;

        }
    }

    public void imprimeLista(){
        if (primeiroNo == null){
            System.out.printf("Lista Vazia!");
        }else{
            System.out.printf("Dados da lista de %s:\n", nomeLista);
            NoDuplo<T> aux = primeiroNo;
            while(aux != null){
                System.out.printf(" %s ", aux.toString());
                aux = aux.getProximoNo();
            }
        }     
    }
}
    