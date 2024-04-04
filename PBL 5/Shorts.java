public class Shorts extends Videos {
    String formatoTela = "EM Pé🤣";
    // heranca🤣🤣🤣🤣
    public Shorts (int qnt_views, String thumbnail, String comentarios, String canal, int qnt_likes, int qnt_deslikes, int qnt_inscritos, String anuncio, String titulo_video, int duracao_video, String formatoTela) {

        super(qnt_views, thumbnail, comentarios, canal, qnt_likes, qnt_deslikes, qnt_inscritos, anuncio, titulo_video, duracao_video);
        this.formatoTela = "pé";

    }


    // métodos
    public void darPlay() {
        // dar play no shorts
    }

    private void darLike() {
        // dar like no shorts
    }

    private void inscreverCanal() {
        // se inscrever no canal
    }

    private void darDeslike() {
        // dar deslike no shorts
    }

    public void selecionarTempo() {
        // selecionar tempo do shorts
    }

    private void deixarComentario() {
        // deixar comentário no shorts
    }

    public void pausarVideo() {
        // pausar o shorts
    }

    public void passarVideo() {
        // passar para o proximo shorts
    }

    public void compartilharVideo() {
        // publicar shorts
    }
}
