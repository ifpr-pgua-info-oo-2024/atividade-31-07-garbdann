public class Main {
    public static void main(String[] args) {
        Academia acad1 = new Academia ("World", "Rua José Baka", "34259343");
        Academia acad2 = new Academia ("Muscle", "Rua Mario Roque Filho", "34210012");

        System.out.println ("\nObjeto 1"); 
        System.out.println (acad1.toString());
        System.out.println ("\nObjeto 2");
        System.out.println (acad2.toString());
        
        acad1.setNome ("Aquatikus");
        acad1.setEndereco ("Rua das Rosas");
        acad1.setTelefone ("4199512-3213");

        acad2.setNome ("Worship");
        acad2.setEndereco ("Rua das Calêndulas");
        acad2.setTelefone ("4192131-4239");

        System.out.println ("\nObjeto 1");
        System.out.println (acad1.toString());
        System.out.println ("\nObjeto 2");
        System.out.println (acad2.toString());
    }
}
