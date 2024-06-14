package apple;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NaveadorDeInternet;
import funcionalidades.ReprodutorMusical;

public class Celular implements NaveadorDeInternet, ReprodutorMusical, AparelhoTelefonico {   

        public void selecionarMusica(String musica) {
            System.out.println("Você selecionou a música: " + musica);
        }

        public void tocar() {
            System.out.println("Tocando música");
        }

        public void pausar() {
            System.out.println("Música pausada");
        }
        public void exibirPagina(String url){
            System.out.println("Exibindo página: " + url);
        }   
        public void adicionarNovaAba(){ 
            System.out.println("Nova aba adicionada");
            }
        public void atualizarPagina(){
            System.out.println("Página atualizada");
            }

        public void ligar(String numero){
            System.out.println("Ligando para: " + numero);
            }
        public void atender(){
            System.out.println("Atendendo ligação");
        }
        public void iniciarCorreioDeVoz(){
            System.out.println("Iniciando correio de voz");
        }
}
