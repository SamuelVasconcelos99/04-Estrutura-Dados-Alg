public class Principal{

    public static void main(String[] args){
        
        Lista<String> lista = new Lista<String>("Alunos");

        lista.addInicio("Sambas");
        lista.imprimirDados();
        lista.addInicio("Dêd");
        lista.imprimirDados();
        lista.addFinal("Ogust");
        lista.imprimirDados();
        lista.removeInicio();
        lista.imprimirDados();

    }
}