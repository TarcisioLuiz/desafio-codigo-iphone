public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    @Override
    public void browseInternet() {
        System.out.println("Carregando Google");    }

    @Override
    public void play() {
        System.out.println("Iniciando música");    }

    @Override
    public void pause() {
        System.out.println("Pausando música");
    }

    @Override
    public void skip() {
        System.out.println("Pulando música");
    }

    @Override
    public void call() {
        System.out.println("Ligando");    }

    @Override
    public void answerCall() {
        System.out.println("Atendendo chamada");    }

    @Override
    public void endCall() {
        System.out.println("Desligando chamada");    }

    @Override
    public void loadPage() {
        System.out.println("Carregando Google");    }

    @Override
    public void goBack() {
        System.out.println("Página anterior");    }

    @Override
    public void goForward() {
        System.out.println("Próxima página");    }
}
