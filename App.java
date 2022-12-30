import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Random random = new Random();
        List<Product> list = new ArrayList<>();

        //=============gerados====================
        String path = "C:\\Users\\Zeturiell\\Desktop\\Nova pasta\\inGerado.txt";

        for (int i = 0; i < 12000; i++) {//gera 12 mil produtos aleatorios e valores aleatorios
            Double randNum = Double.parseDouble(String.format("%.2f",random.nextDouble(99999)));
            list.add(new Product(rand.generateRandWord(), randNum));
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {//escreve em um txt

            for (Product product : list) {
                bw.write(product.getName() + "," + product.getPrice());
                bw.newLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //===================Nome=================
        String pathOrg = "C:\\Users\\Zeturiell\\Desktop\\Nova pasta\\inNome.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathOrg))) {//escreve em um txt separado a lista oganizada por nome

            list.sort((p1,p2)->p1.getName().compareTo(p2.getName()));//lambda que organiza por nome
            
            for (Product product : list) {
                bw.write(product.getName() + "," + product.getPrice());
                bw.newLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //===================Preco======================
        String pathOrg2 = "C:\\Users\\Zeturiell\\Desktop\\Nova pasta\\inPreco.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathOrg2))) {//escreve em um txt separado a lista ja organizado por valor

            list.sort((p1,p2)->p2.getPrice().compareTo(p1.getPrice()));//lambda que organiza por valor
            
            for (Product product : list) {
                bw.write(product.getName() + "," + product.getPrice());
                bw.newLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}