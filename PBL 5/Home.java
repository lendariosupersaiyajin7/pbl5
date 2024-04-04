public class Home {
    // atributos
    String videos;
    int views;
    String data_upload;
    int duracao_video;
    String filtro_busca;
    String shorts;
    String nome_video;
    String nome_shorts;

    // construtores explicitos
    public Home() {
        String videos = "tem!";
        int views = 0;
        String data_upload = "hoje!";
        int duracao_video = 0;
        String filtro_busca = "sim!";
        String shorts = "muitos!";
        String nome_video = "video1!";
        String nome_shorts = "shorts1!";
    }
    public Home(String videos, int views, String data_upload, int duracao_video, String filtro_busca, String shorts, String nome_video,
    String nome_shorts) {
        //mitei
    }

    // métodos
    public void acessarCanal() {
        // acessar canal da home
    }

    public void abrirVideo(){
        // acessar video da home
    }

    public void verPlaylist() {
        // ver playlists salvas por voce
    }

    public void buscarCategorias() {
        // buscar videos a partir de categorias
    }

    public void pesquisarBarranav() {
        // pesquisar videos a partir da barra de navegação
    }

    public void realizarLogin() {
        // realizar login
    }
}
