public class NoDuplo<T> {
    private T dado;
    private int indice;
    private NoDuplo<T> proximoNo; 
    private NoDuplo<T> anteriorNo;
    
    public NoDuplo(T dado, int indice){
        this.dado = dado;
        this.indice = indice;
        this.anteriorNo = null;
        this.proximoNo = null;
    }

    //Getter e setter Dado
    public T getDado(){
        return dado;
    }

    public void setDado(T dado){
        this.dado = dado;
    }
    //Getter e setter proximoNo
    public NoDuplo<T> getProximoNo(){
        return proximoNo;
    }
    public void setProximoNo(NoDuplo<T> proximoNo){
        this.proximoNo = proximoNo;
    }
        //Getter e setter anteriorNo
    public NoDuplo<T> getAnteriorNo(){
        return anteriorNo;
    }

    public void setAnteriorNo(NoDuplo<T> anteriorNo){
        this.anteriorNo = anteriorNo;
    }
    public void setIndice(int indice){
        this.indice = indice;
    }
    public int getIndice (){
        return indice;
    }
    @Override
    public String toString(){
        return "{ Indice: " + getIndice() + ", Dado: " +  getDado() + " }";

    }

}
