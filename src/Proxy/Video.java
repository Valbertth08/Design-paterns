package Proxy;

public class Video  implements BibliotecaYoutube{

    @Override
    public void ListarVideos() {
        System.out.println("Listando os videos");
    }
    @Override
    public void BaixarVideo() {
        System.out.println("Baixando o video");
    }


}
