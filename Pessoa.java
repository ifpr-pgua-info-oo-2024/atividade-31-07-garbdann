import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Pessoa {
    private String nome;
    private String genero;
    private Date nascimento;
    private double peso;
    private double altura;

    public Pessoa(String nome, String nascimento, String genero, double peso, double altura) throws ParseException {
        this.nome = nome;
        this.genero = genero;
        this.nascimento = nascimentoToDate(nascimento);
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIdade(Date nascimento) {
        Date today = new Date();

        long diffInMillies = Math.abs(today.getTime() - nascimento.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        return (int) diff / 365;
    }

    public String nascimentoToString(Date nascimento) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(nascimento);
    }

    public Date nascimentoToDate(String nascimento) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.parse(nascimento);
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nData de nascimento: " + nascimentoToString(nascimento) +
                "\nIdade: " + calcularIdade(nascimento) +
                "\nGênero: " + genero +
                "\nAltura: " + altura +
                "\nPeso: " + peso;
    }

}
