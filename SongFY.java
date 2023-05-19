import java.util.Scanner;

public class SongFY {
  private static final String PlayList = null;

  public static void main(String[] args) {
    boolean continuar = true;
    int opc;
    int resp;
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("***Menu do SongFY***\n");
      System.out.println("1 – Listar as Playlists \n");
      System.out.println("2 – Listar os Álbuns \n");
      System.out.println("3 – Listar os Artistas \n");
      System.out.println("4 – Cadastrar uma nova Playlist \n");
      System.out.println("5 – Cadastrar um novo álbum \n");
      System.out.println("6 – Escolher Plano \n");
      System.out.println("7 – Encerrar o Programa\n");
      System.out.println("Digite a opção desejada");
      opc = sc.nextInt();

      if (opc == 4) {

        System.out.println("============================================");

        System.out.println("Você escolheu cadastrar uma nova playlist.");
        System.out.println(" ");

        System.out.println("*Você deseja continuar a cadastar uma nova playlist?*");
        String resposta = sc.nextLine();

        if (resposta.equals("sim")) {
          System.out.println(" ");
          break;
        }
        for (int nalbuns = 5; nalbuns != 9; nalbuns++) {

          System.out.println("Preencha os campos com as informações corretas.");

          
          // Coleta de informações

          System.out.println(" ");
          String lol = sc.nextLine();

          System.out.println("Digite o nome do Playlist: ");

          String playlist = sc.nextLine();

          System.out.println(" ");

          System.out.println("Digite o genero da Playlist: ");

          String genero = sc.nextLine();

          System.out.println(" ");

          System.out.println(" ==== VOCÊ CADASTROU UMA NOVA PLAYLIST COM SUCESSO ==== ");

          System.out.println(" ");

          String newAlbum = ( "Playlist: \n" + playlist + "." + " \nGênero: " + genero + ".");

          System.out.println(newAlbum);

          if (nalbuns == 6) {
            System.out.println(" ");
            System.out.println("Você atingiu um máximo de 6 Playlists");
            System.out.println(" ");
          }

          System.out.println("\nVocê deseja continuar?");
          System.out.println("Digite 1 para continuar ou 2 para encerrar");
          resp = sc.nextInt();
          if (resp == 1) {
            continuar = true;
          }
          if (resp == 2)
            break;
        }

      }
      

      if (opc == 7) {
        continuar = false;
        System.out.println("Obrigado!");
      }

      if (opc == 1) {
        System.out
            .println("1- Mix relax \n2- Dia de jogo \n3- Astrothunder \n4- Vida loka\n5- Mix kay\n6-Dia de baile");
        continuar = false;
        System.out.println("Digite a opção desejada");
        opc = sc.nextInt();
        System.out.println("\nBOA ESCOLHA");
        System.out.println("\nVocê deseja continuar?");
        System.out.println("Digite 1 para continuar ou 2 para encerrar");
        resp = sc.nextInt();
        if (resp == 1) {
          continuar = true;

        }

      }
      if (opc == 2) {
        System.out.println(
            "1- Dos predios\n2- Rock Danger\n3- Astrothunder \n4- Certified lover boy\n5- ETPM\n6- Contradições\n7- Sobrevivendo no inferno");
        continuar = false;
        System.out.println("Digite a opção desejada");
        opc = sc.nextInt();
        System.out.println("\nBOA ESCOLHA");
        System.out.println("\nVocê deseja continuar?");
        System.out.println("Digite 1 para continuar ou 2 para encerrar");
        resp = sc.nextInt();
        if (resp == 1) {
          continuar = true;
        }
      }

      if (opc == 3) {
        System.out.println("1- Veigh\n2- Kayblack\n3- Travis Scott\n4- Drake\n5-Jovem dex\n");
        continuar = false;
        System.out.println("Digite a opção desejada");
        opc = sc.nextInt();
        System.out.println("\nBOA ESCOLHA");
        System.out.println("\nVocê deseja continuar?");
        System.out.println("Digite 1 para continuar ou 2 para encerrar");
        resp = sc.nextInt();
        if (resp == 1) {
          continuar = true;

        }
      }
      if (opc == 5) {

        System.out.println("============================================");

        System.out.println("Você escolheu cadastrar um novo álbum.");
        System.out.println(" ");

        System.out.println("*Você deseja continuar a cadastar um novo álbum?*");
        String resposta = sc.nextLine();

        if (resposta.equals("sim")) {
          System.out.println(" ");
          break;
        }
        for (int nalbuns = 5; nalbuns != 9; nalbuns++) {

          System.out.println("Preencha os campos com as informações corretas.");

          System.out.println(" ");

          // Coleta de informações

          System.out.println(" ");

          System.out.println("Digite o nome do artista: ");

          String nomeArtista = sc.nextLine();

          System.out.println(" ");

          System.out.println("Digite o nome da música: ");

          String nomeMusica = sc.nextLine();

          System.out.println(" ");

          System.out.println("Digite o nome do álbum: ");

          String album = sc.nextLine();

          System.out.println(" ");

          System.out.println("Digite o genero da musica: ");

          String genero = sc.nextLine();

          System.out.println(" ");

          System.out.println(" ==== VOCÊ CADASTROU UM NOVO ÁLBUM COM SUCESSO ==== ");

          System.out.println(" ");

          String newAlbum = ("\nÁlbum - " + album + "." + "\nMúsica: " + nomeMusica + "." + "\nArtista: "

              + nomeArtista + "." + " \nGênero: " + genero + ".");

          System.out.println(newAlbum);

          if (nalbuns == 8) {
            System.out.println(" ");
            System.out.println("Você atingiu um máximo de 8 álbuns");
            System.out.println(" ");
          }
          System.out.println("\nVocê deseja continuar?");
          System.out.println("Digite 1 para continuar ou 2 para encerrar");
          resp = sc.nextInt();
          if (resp == 1) {
            continuar = true;
          }
          if (resp == 2)
            break;
        }

      }

      if (opc == 6) {
        System.out.println("6 - Escolha um Plano \n");
        continuar = false;
        System.out.println("Qual desses planos você deseja?");
        System.out.println("Digite 5 para encerrar");
        System.out.println("1 - Plano Basic (R$9,90)");
        System.out.println("2 - Plano Duo (R$13,99)");
        System.out.println("3 - Plano Silver (R$15,00)");
        System.out.println("4 - Plano Premium (R$18,75)");
        resp = sc.nextInt();

        double valorPlano = 0.0;
        String formaPagamento = "";

        if (resp >= 1 && resp <= 4) {
          continuar = true;
          if (resp == 1) {
            valorPlano = 9.90;
          } else if (resp == 2) {
            valorPlano = 13.99;
          } else if (resp == 3) {
            valorPlano = 15.00;
          } else if (resp == 4) {
            valorPlano = 18.75;
          }

          System.out.println("Escolha a forma de pagamento:");
          System.out.println("1 - PIX");
          System.out.println("2 - Transferência Bancária");
          System.out.println("3 - Cartão de Crédito");
          System.out.println("4 - Cartão de Débito");
          int respPagamento = sc.nextInt();

          if (respPagamento == 1) {
            formaPagamento = "PIX";
            valorPlano *= 0.95; // Desconto de 5% para PIX
          } else if (respPagamento == 4) {
            formaPagamento = "Cartão de Débito";
            valorPlano *= 0.95; // Desconto de 5% para cartão de débito
          } else if (respPagamento == 3) {
            formaPagamento = "Cartão de Crédito";
            valorPlano *= 1.1; // Acréscimo de 10% para cartão de crédito
          } else {
            formaPagamento = "Transferência Bancária";
          }

          System.out.println("Plano escolhido: Plano " + resp);
          System.out.println("Forma de pagamento: " + formaPagamento);
          System.out.println("Valor a ser pago: R$" + valorPlano);

          System.out.println("Deseja finalizar a compra? Digite:");
          System.out.println("1 - Sim");
          System.out.println("2 - Não");
          int respCompra = sc.nextInt();

          if (respCompra == 1) {
            continuar = false;
          } else if (respCompra == 2) {
            continuar = true;
          }
        } else if (resp == 2) {
          continuar = false;
        }
      }

      if (!continuar) {
        System.out.println("Obrigado!");
      }

    } while (continuar);

    sc.close();
  }
}


