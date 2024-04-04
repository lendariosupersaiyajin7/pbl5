import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("---- Bem-vindo!!! ---- 😂");
        System.out.println("O que você deseja fazer?");
        System.out.println("-----------------------------");
        System.out.println("1 - Adicionar Vídeo");
        System.out.println("2 - Acessar Canal");
        System.out.println("3 - Registrar Canal");
        System.out.println("4 - Sair do programa");
        System.out.println("5 - Adicionar Shorts");
        System.out.println("6 - Melhorar suas habilidades");
        System.out.println("-----------------------------");
        System.out.print("Digite o que você deseja fazer: ");

        int response = scanner.nextInt();

        switch (response) {
            case 1:
                System.out.println("Você escolheu adicionar um vídeo.");
                Videos video = new Videos();

                System.out.println("insira a quantidade de views:");
                int view = scanner.nextInt();
                System.out.println("insira a thumbnail do video:");
                String thumbnail = scanner.nextLine();

                System.out.println("insira comentarios:");
                String comentarios = scanner.nextLine();

                System.out.println("insira o nome do canal:");
                String canal = scanner.nextLine();

                System.out.println("insira a quantidade de likes:");
                int likes = scanner.nextInt();

                System.out.println("insira a quantidade de deslikes:");
                int deslikes = scanner.nextInt();

                System.out.println("insira a quantidade de inscritos no canal que postou o video ta bom?:");
                int inscritos = scanner.nextInt();

                System.out.println("insira o anuncio do video:");
                String anuncio = scanner.nextLine();

                System.out.println("insira o TITULO do video:");
                String titulo = scanner.nextLine();

                System.out.println("insira a duracao do vídeo:");
                int duracao = scanner.nextInt();

                Videos video1 = new Videos(view, thumbnail, comentarios, canal, likes, deslikes, inscritos, anuncio, titulo, duracao);

                System.out.println("O Vídeo adicionado foi:");
                System.out.println("<--- TITULO --->");
                System.out.println(titulo);
                System.out.println("<<< VIEWS >>>");
                System.out.println(view);
                System.out.println("Thumbnail>>>");
                System.out.println(thumbnail);
                System.out.println("likes > " + likes + " deslikes > " + deslikes + " inscritos > " + inscritos);
                System.out.println("anuncio > " + anuncio);
                System.out.println("duracao > " + duracao);

                System.out.println("ESSES SÃO OS DADOS DO SEU VÍDEO 🤣");
                System.out.println(video1);
                System.out.println("__________________________________________________");



                break;
            case 2:
                System.out.println("Você escolheu acessar um canal.");
                break;
            case 3:
                System.out.println("Você escolheu registrar um canal.");

                break;
            case 4:
                System.out.println("Saindo do programa...");
                break;
            case 5:
                System.out.println("Você escolheu adicionar Shorts.");
                break;
            case 6:
                System.out.println("Você escolheu melhorar suas habilidades.");
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
                break;
        }
    }
}