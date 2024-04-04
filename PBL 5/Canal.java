public class Canal {
    // atributos
    private String nome;
    private String descricao;
    private String data_criacao;
    private String foto_perfil;
    private String canais_relacionados;
    private String foto_banner;
    private int qnt_inscritos;
    private int qnt_videos;
    private String playlist;

 public String getNome() {
    return nome;
}


public String getDescricao() {
    return descricao;
}


public String getDataCriacao() {
    return data_criacao;
}


public String getFotoPerfil() {
    return foto_perfil;
}


public String getCanaisRelacionados() {
    return canais_relacionados;
}


public String getFotoBanner() {
    return foto_banner;
}


public int getQntInscritos() {
    return qnt_inscritos;
}


public int getQntVideos() {
    return qnt_videos;
}


public String getPlaylist() {
    return playlist;
}
    

 // construtores explicitos
 public Canal() {
     String nome = "canal!";
     String descricao = "descrito!";
     String data_criacao = "hoje!";
     String foto_perfil = "tem!";
     String canais_relacionados = "coisadenerd!";
     String foto_banner = "tem!";
     int qnt_inscritos = 0;
     int qnt_videos = 0;
     String playlist = "tem!";
}
public Canal(String nome, String descricao, String data_criacao, String foto_perfil, String canais_relacionados, String foto_banner, int qnt_inscritos, int qnt_videos, String playlist) {
    //mitei
}

    // metodos
    private void publicarVideo() {
        // publicar um vídeo no seu canal
    }

    private void apagarCanal() {
        // apagar canal
    }

    private void alterarImagem() {
        // alterar imagem do canal
    }

    private void alterarBanner() {
        // aletar imagem do banner
    }

    private void alterarDescricao() {
        // alterar descricao do canal
    }

    private void criarPlaylist() {
        // cirar playlist com vídeos do seu ou de outros canais
    }

    public void apagarVideo() {
        // apagar vídeo do seu canal
    }

    private void apagarPlaylist() {
        // apagar playlista criada por voce
    }

    private void publicarShort() {
        // publicar short no seu canal
    }

    private void canaisInscritos() {
        // ver canais inscritos
    }
}

