import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        int op;
        boolean end = false;

        Academia acad1 = new Academia("World", "Rua José Baka", "34259343");
        Academia acad2 = new Academia("Muscle", "Rua Mario Roque Filho", "34210012");

        /*
         * acad1.alunos.add(new Aluno("Daniel Garbeto", "Básico", "7/2/2008",
         * "Masculino", 1.80, 123));
         * 
         * acad1.alunos.add(new Aluno("Asafe Elias", "Básico", "16/5/2007", "Masculino",
         * 1.69, 100));
         * 
         * acad1.alunos.add(new Aluno("Hanae Rosa", "Básico", "19/9/2007", "Feminino",
         * 1.60, 59));
         * 
         * acad2.alunos.add(new Aluno("Agatha Letícia", "Básico", "13/8/2007",
         * "Feminino", 1.75, 60));
         * 
         * acad2.alunos.add(new Aluno("Victor Marques", "Básico", "14/4/2008",
         * "Masculino", 1.78, 57));
         * 
         * acad2.alunos.add(new Aluno("Morgan Beatrice", "Básico", "04/6/2008",
         * "Fluído", 1.76, 73));
         */

        do {
            System.out.println("1) Cadastrar novo aluno");
            System.out.println("2) Listar alunos");
            System.out.println("3) Deletar aluno");
            System.out.println("0) Sair");
            System.out.print("> ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1:
                    String nome, nivel, nasc, genero, altura, peso;
                    int dia, mes, ano, acad;

                    System.out.print("Insira o nome: ");
                    nome = scan.nextLine();
                    System.out.print("Insira o nível: ");
                    nivel = scan.nextLine();
                    System.out.print("Insira o dia do nascimento: ");
                    dia = scan.nextInt();
                    System.out.print("Insira o mês de nascimento: ");
                    mes = scan.nextInt();
                    System.out.print("Insira o ano de nascimento: ");
                    ano = scan.nextInt();
                    scan.nextLine();
                    nasc = dia + "/" + mes + "/" + ano;
                    System.out.print("Insira o genero: ");
                    genero = scan.nextLine();
                    System.out.print("Insira a altura: ");
                    altura = scan.nextLine();
                    double alt = Double.parseDouble(altura);
                    System.out.print("Insira o peso: ");
                    peso = scan.nextLine();
                    double pes = Double.parseDouble(peso);

                    System.out.println("Selecione a academia que deseja cadastrar o aluno: ");
                    System.out.println("1) " + acad1.toString());
                    System.out.println("2) " + acad2.toString());
                    System.out.print("> ");
                    acad = scan.nextInt();
                    if (acad == 1) {
                        acad1.alunos.add(new Aluno(nome, nivel, nasc, genero, alt, pes));
                    } else if (acad == 2) {
                        acad2.alunos.add(new Aluno(nome, nivel, nasc, genero, alt, pes));
                    }

                    break;
                case 2:
                    System.out.println("\nObjeto 1");
                    System.out.println(acad1.toString());
                    System.out.println("\nAlunos da academia: " + acad1.getNome());

                    for (Aluno aluno : acad1.getAlunos()) {
                        System.out.println(aluno.toString());
                        System.out.println();
                    }

                    System.out.println("\nObjeto 2");
                    System.out.println(acad2.toString());
                    System.out.println("\nAlunos da academia: " + acad2.getNome());

                    for (Aluno aluno : acad2.getAlunos()) {
                        System.out.println(aluno.toString());
                        System.out.println();
                    }

                    break;
                case 3:
                    int id;
                    System.out.println("\n1)" + acad1.toString());
                    System.out.println("2)" + acad2.toString());
                    System.out.print("\nInsira o ID da academia que deseja remover um aluno: ");
                    acad = scan.nextInt();
                    if (acad == 1) {
                        int v1 = 1;
                        for (Aluno aluno : acad1.getAlunos()) {
                            System.out.println(v1 + ")" + aluno.toString() + "\n");
                            v1++;
                        }

                        System.out.print("Digite o ID do aluno que deseja remover: ");
                        id = scan.nextInt();
                        acad1.alunos.remove(id - 1);
                    } else if (acad == 2) {
                        int v1 = 1;
                        for (Aluno aluno : acad2.getAlunos()) {
                            System.out.println(v1 + ")" + aluno.toString() + "\n");
                            v1++;
                        }

                        System.out.print("Digite o ID do aluno que deseja remover: ");
                        id = scan.nextInt();
                        acad2.alunos.remove(id - 1);
                    }

                    break;
                case 0:
                    end = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (!end);

        System.out.println("Olá mundo!");

        scan.close();
    }
}
