public class ListaDupla<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private String nomeLista;
    private int tamanho;

    public ListaDupla(){
        this("Lista Duplamente Encadeada");
    }

    public ListaDupla(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }
    
    public void addInicio(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado, 0);
        if(primeiroNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;
        }
        atualizaIndice();
        tamanho++;
    }
    public void addFinal (T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado, tamanho);
        if (primeiroNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            ultimoNo.setProximoNo(novoNo);
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo = novoNo;
        }
        tamanho++;

    }
    public void removeInicio(){
      if (primeiroNo == null){
            System.out.println("Lista vazia");
        }else{
            System.out.println("Dado: " + primeiroNo.getDado() + " removido da lista.");
            primeiroNo = primeiroNo.getProximoNo();
            if (primeiroNo != null){
                primeiroNo.setAnteriorNo(null);
            }else{
                ultimoNo = primeiroNo;
            }
        }
    }

    public void addMeio (T dado, int posicao){
        if(posicao <= 0){
            addInicio(dado);
            return;
        }else if (posicao >= tamanho){
            addFinal(dado);
            return;
        }else{
            NoDuplo<T> novoNo = new NoDuplo<T>(dado, posicao);
            NoDuplo<T> atual = primeiroNo;
            int indice = 0;
            while (atual != null && indice < posicao){
                atual = atual.getProximoNo();
                indice++;
            }
            NoDuplo<T> anterior = atual.getAnteriorNo();
            novoNo.setProximoNo(atual);
            novoNo.setAnteriorNo(anterior);    
            if (anterior != null){
                anterior.setProximoNo(novoNo);
            }
            else{
                primeiroNo = novoNo;
            }
            atualizaIndice();
            tamanho++;
        }
    }

    public void removeMeio(int posicao){
        NoDuplo<T> atual = primeiroNo;
        int indice = 0;
        if (posicao <= 0){
            removeInicio();
            return;
        }else if (posicao >= tamanho - 1){
            removeFinal();
            return;
        }
        while(atual != null && indice < posicao){
            atual = atual.getProximoNo();
            indice++;
        }
    }

    
    public void removeFinal(){
        if (primeiroNo == null){
            System.out.println("Lista vazia");
        }else{
            System.out.println("Dado: " + ultimoNo.getDado() + " removido da lista.");
            ultimoNo = ultimoNo.getAnteriorNo();
            if (ultimoNo != null){
                ultimoNo.setProximoNo(null);
            }else{
                ultimoNo = primeiroNo;
            }
        }
    }

    private void atualizaIndice(){
        NoDuplo<T> atual = primeiroNo;
        int indice = 0;
        while(atual != null){
            atual.setIndice(indice);
            atual = atual.getProximoNo();
            indice++;
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
    