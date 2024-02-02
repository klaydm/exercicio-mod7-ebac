public class Celular {
    private String marca;
    private String modelo;
    private String cor;
    private int capacidade;

    public Celular(String marca, String modelo, String cor, int capacidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.capacidade = capacidade;
    }

    public void ligar() {
        System.out.printf("O celular %s %s está ligado!%n", marca, modelo);
    }

    public void desligar() {
        System.out.printf("O celular %s %s está desligado%n", marca, modelo);
    }

    public void fazerLigacao(String numero) {
        System.out.printf("Ligando para %s ...%n", numero);
    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.printf("Enviando mensagem para %s: %s%n", numero, mensagem);
    }

    public void tirarFoto() {
        System.out.println("Foto tirada!");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
