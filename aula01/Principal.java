import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Pessoa objPessoa = new Pessoa();
        ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();

        System.out.println("Dados de pessoa!");
        System.out.println("Nome: ");
        // String nome = input.nextLine();
        objPessoa.setNome(input.nextLine());
        System.out.println("Idade: ");
        objPessoa.setIdade(input.nextInt());
        
        System.out.println(objPessoa.toString());
        
        listaPessoa.add(objPessoa);
        listaPessoa.add(new Pessoa ("Joseph", 55));
        listaPessoa.add(new Pessoa ("Mary", 15));
    }
}