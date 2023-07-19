/**package aula04;

import java.util.Scanner;

public class Aula04 {

    public static void main(String[] args) {
        
        String nomeAlunos[] = new String[5];
        boolean situacaoAlunos[] = new boolean[5];
        double alturaAlunos[] = new double[5];
        int idadeAlunos[] = new int[5];
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            
            System.out.println("Nome:");
            nomeAlunos[i] = leitor.nextLine();
            System.out.println("Você estuda?");
            situacaoAlunos[i] = leitor.nextBoolean();
            System.out.println("Altura:");
            alturaAlunos[i] = leitor.nextDouble();
            System.out.println("Idade:");
            idadeAlunos[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < nomeAlunos.length; i++) {
            System.out.println("Nome: "+nomeAlunos[i]+" Estuda: "+situacaoAlunos[i]+" Altura: "+alturaAlunos+" Idade "+idadeAlunos);
        }
        
        leitor.useDelimiter(",");
    }
    
}*/
