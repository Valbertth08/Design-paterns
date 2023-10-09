package Proxy;

public class VideoProxy implements  BibliotecaYoutube{
    private BibliotecaYoutube bibliotecaYoutube;
    public VideoProxy(BibliotecaYoutube bibliotecaYoutube) {
        this.bibliotecaYoutube= bibliotecaYoutube;
    }
    @Override
    public void ListarVideos() {
        System.out.println("Preparando listagem: ");
        bibliotecaYoutube.ListarVideos();
    }

    @Override
    public void BaixarVideo() {
        System.out.println("Preparando Download: ");
        bibliotecaYoutube.BaixarVideo();
    }
}
