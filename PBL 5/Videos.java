public class Videos {

    // construtores explícitos

   protected int qnt_views;
   protected String thumbnail;
   protected String comentarios;
   protected String canal;
   protected String upload;
   protected int qnt_likes;
   protected int qnt_deslikes;
   protected int qnt_inscritos;
   protected String anuncio;
   protected String titulo_video;
   protected int duracao_video;

    public Videos() {
        int qnt_views = 0;
        String thumbnail = "sem thumb";
        String comentarios = "nada";
        String canal = "usuário canal";
        String upload = "upload?";
        int qnt_likes = 0;
        int qnt_deslikes = 0;
        int qnt_inscritos = 0;
        String anuncio = "SEM";
        String titulo_video = "TITULO 1";
        int duracao_video = 0;
    }
    public Videos(int qnt_views, String thumbnail, String comentarios, String canal, int qnt_likes, int qnt_deslikes, int qnt_inscritos, String anuncio, String titulo_video, int duracao_video) {
        //mitei
    }

    // encapsulamento

    // métodos
    public void darPlay(){
        // play nos videos
    }

    private void darLike(int likes) {
        // dar like nos videos
    }

    private void increverCanal(){
        // se inscrever no canal
    }

    private void darDeslike(int deslikes) {
        // dar deslike nos vídeos
    }

    public void selecionarTempo(){
        // selecionar tempo do vídeo
    }

    private void deixarComentario() {
        // deixar comentario no vídeo
    }

    public void pausarVideo() {
        // pausar vídeos
    }

    public void ativarLegenda() {
        // ativar legenda dos vídeos
    }

    public void qualidadeVideo() {
        // ajustar qualidade do vídeo
    }

    public void velocidadeVideo() {
        // aumentar / diminuir velocidade do vídeo
    }

    public void fecharVideo() {
        // fechar / sair do vídeo
    }

    public void modoTeatro() {
        // colocar vídeo em modo teatro
    }

    public void telaCheia(){
        // colocar vídeo em tela cheia
    }
}
