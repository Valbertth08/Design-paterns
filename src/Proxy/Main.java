package Proxy;

public class Main {

    public static void main(String[] args) {

        Video video =new Video();
        VideoProxy videoProxy= new VideoProxy(video);
        System.out.println("----------Proxy--------------");
        //possando o proxy como objeto
        Youtube youtube1 = new Youtube(videoProxy);
        youtube1.mostrarOpcao();
        System.out.println();
        System.out.println("----------Original------------");
        // passando o objeto original
        Youtube youtube2 = new Youtube(video);
        youtube2.mostrarOpcao();

    }

}
