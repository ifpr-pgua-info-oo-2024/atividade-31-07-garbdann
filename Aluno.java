import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {
    private String nome;
    private String nivel;
    private Date nascimento;
    private String genero;
    private double altura;
    private double peso;

    public Aluno(String nome, String nivel, Date nascimento, String genero, double altura, double peso) {
        this.nome = nome;
        this.nivel = nivel;
        this.nascimento = nascimento;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    public Aluno(String nome, String nivel, Date nascimento) {
        this(nome, nivel, nascimento, "", 0, 0);
    }

    public String getNome() {
        return nome;
    }

    public String getNivel() {
        return nivel;
    }

    public Date getDataNascimento() {
        return nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        return "\nNome: " + nome +
                "\nNível: " + nivel +
                "\nData de nascimento: " + simpleDateFormat.format(nascimento) +
                "\nGênero: " + genero +
                "\nAltura: " + altura +
                "\nPeso: " + peso;
    }

}
