import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Academia acad1 = new Academia("World", "Rua José Baka", "34259343");
        Academia acad2 = new Academia("Muscle", "Rua Mario Roque Filho", "34210012");

        acad1.alunos.add(new Aluno("Daniel Garbeto", "Básico", "7/2/2008", "Masculino", 1.80, 123));

        acad1.alunos.add(new Aluno("Asafe Elias", "Básico", "16/5/2007", "Masculino", 1.69, 100));

        acad1.alunos.add(new Aluno("Hanae Rosa", "Básico", "19/9/2007", "Feminino", 1.60, 59));

        acad2.alunos.add(new Aluno("Agatha Letícia", "Básico", "13/8/2007", "Feminino", 1.75, 60));

        acad2.alunos.add(new Aluno("Victor Marques", "Básico", "14/4/2008", "Masculino", 1.78, 57));

        acad2.alunos.add(new Aluno("Morgan Beatrice", "Básico", "04/6/2008", "Fluído", 1.76, 73));

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
    }

}
