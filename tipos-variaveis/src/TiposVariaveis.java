import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class TiposVariaveis {

    public static void main(String[] args) throws Exception {
        
        String dataAtualFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(System.currentTimeMillis());
        String mensagem = "Bom dia Lara! ";
        int hora = Integer.parseInt(dataAtualFormatada.substring(11,12));
        if (hora <= 12){
        mensagem = "Boa tarde lara";
        }

        System.out.println(mensagem);
    }
}
