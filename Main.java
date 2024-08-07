import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        Academia acad1 = new Academia("World", "Rua José Baka", "34259343");
        Academia acad2 = new Academia("Muscle", "Rua Mario Roque Filho", "34210012");

        Date data = convertStringToDate(7, 2, 2008);
        acad1.alunos.add(new Aluno("Daniel Garbeto", "Básico", data, "Masculino", 1.80, 123));

        data = convertStringToDate(16, 5, 2007);
        acad1.alunos.add(new Aluno("Asafe Elias", "Básico", data, "Masculino", 1.69, 100));

        data = convertStringToDate(19, 9, 2007);
        acad1.alunos.add(new Aluno("Hanae Rosa", "Básico", data, "Feminino", 1.60, 59));

        data = convertStringToDate(13, 8, 2007);
        acad2.alunos.add(new Aluno("Agatha Letícia", "Básico", data, "Feminino", 1.75, 60));

        data = convertStringToDate(14, 4, 2008);
        acad2.alunos.add(new Aluno("Victor Marques", "Básico", data, "Masculino", 1.78, 57));

        data = convertStringToDate(04, 06, 2008);
        acad2.alunos.add(new Aluno("Morgan Beatrice", "Básico", data, "Fluído", 1.76, 73));

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

    public static Date convertStringToDate(int dia, int mes, int ano) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date data = format.parse(dia + "/" + mes + "/" + ano);

        return data;
    }
}
