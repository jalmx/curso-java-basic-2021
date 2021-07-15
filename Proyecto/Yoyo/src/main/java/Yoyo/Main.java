package Yoyo;

import javax.swing.JOptionPane;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) throws Exception {

        String rutaFinal = JOptionPane.showInputDialog(null, "Dar la ruta");
        System.out.println(rutaFinal);
        
        if(rutaFinal.isEmpty()){
            rutaFinal = "https://listado.mercadolibre.com.mx/iphone-8#D[A:iphone%208,L:undefined]";
        }
        
        System.out.println("Leyendo el sitio ...");
        Document doc = Jsoup.connect(rutaFinal).get();
        
        Save.createFile(doc.title().replace(" ", ""));

        Elements sectionMain = doc.select("#root-app > div > div > section");

        Elements blockArticles = sectionMain.select("div > div.andes-card");

        StringBuilder st = new StringBuilder();
        st.append("titulo,precio,link\n");

        System.out.println("Construyendo datos");
        for (Element block : blockArticles) {
            String titleArticle = block.select("h2").text();
            String priceArticle = block.select("span.price-tag-fraction").get(0).text().replace(",", "");
            String linkArticle = block.select("div.ui-search-result__image > a").attr("href");
            String row = String.format("%s,%s,%s\n", titleArticle, priceArticle, linkArticle);
            st.append(row);
        }

        System.out.println("Datos listos");
        if (Save.write(st.toString())) {
            System.out.println("Archivo guardado en " + Save.path);
            JOptionPane.showMessageDialog(null, "Archivo guardado en " + Save.path);
        } else {
            System.out.println("Fallo el guardado");
        }

    }

}
