package apple;
public class Iphone {
    public static void main(String[] args) {
        String musica = "Stairway to Heaven";
        String url = "https://www.youtube.com/watch?v=xbhCPt6PZIU";
        String numero = "123456789";
        Celular iphone = new Celular();
        iphone.selecionarMusica(musica);
        iphone.tocar();
        iphone.pausar();
        iphone.exibirPagina(url);
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.ligar(numero);
        iphone.atender();
        iphone.iniciarCorreioDeVoz();
    }
}
