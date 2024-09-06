public class Principal {
    public static void main(String[] args) {
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");

        lista.imprimeLista();
        lista.addInicio("Sambas");
        lista.imprimeLista();
        lista.addInicio("Ogusto");
        lista.imprimeLista();
        lista.addFinal("Miguel");
        lista.imprimeLista();
        lista.removeFinal();
        lista.imprimeLista();
        lista.removeInicio();
        lista.imprimeLista();
    }
}