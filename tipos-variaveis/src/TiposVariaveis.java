import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class TiposVariaveis {

    public static void main(String[] args) throws Exception {

        String dataAtualFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(System.currentTimeMillis());

        String mensagem = "Bom dia Lara! ";
        int hora = Integer.parseInt(dataAtualFormatada.substring(11, 13));

        if ((hora <= 12) && (hora > 18)) {
            mensagem = "Boa tarde Lara";
        } else if (hora >= 18) {
            mensagem = "Boa noite Lara";
        }

        System.out.println(mensagem);
    }
}
