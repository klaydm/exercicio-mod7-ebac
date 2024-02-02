public class Main {
    public static void main(String[] args) {

        Celular celular = new Celular("Samsung", "Galaxy S23", "Preto", 128);

        celular.ligar();
        System.out.printf("A marca do celular é %s%n", celular.getMarca());
        celular.fazerLigacao("99988-7766");
        celular.enviarMensagem("99988-7766", "Olá, tudo bem?");
        celular.tirarFoto();
        celular.desligar();
    }
}