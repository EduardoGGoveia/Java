package idiomaeresolução;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;

public class IdiomaEResolução {


    public static void main(String[] args) {
    Locale idioma = Locale.getDefault();
        System.out.println("A linguagem do sistema é:");
        System.out.println(idioma.getLanguage());
        System.out.println("A resolução do sistema é:");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension resolucao = tk.getScreenSize();
        System.out.println(resolucao.width + "x" + resolucao.height);  
    }
    
}
