import java.io.*;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String FILE_NAME = "Produc.txt";
    public static String COMMA= ", ";
    public static void main(String[] args) {
/*
        ProductManager productManager = new ProductManager();
        Product product = productManager.inputProductData();
        productManager.addProduc(product);

        System.out.println(productManager.getProducts());
*/

        ProductManager productManager = new ProductManager();
        productManager.menu();

/*  // cách ghi file
        try {

            OutputStream outputStream = new FileOutputStream(FILE_NAME, true);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            outputStreamWriter.write("Hello");
            outputStreamWriter.write("\n");
            outputStreamWriter.write("Xin chào các bạn!");
            outputStreamWriter.write("\n");
            outputStreamWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } */

/* // các đọc file
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(FILE_NAME);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);

            String line = "";
            while(true){
                try {
                    if (!((line = reader.readLine()) != null)) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } */

   /*     // Cách đoc file
        List<String> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                list.add(line);
            }
            for (String doc:list){
                System.out.println(doc);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } */
/*
        Product product1  = new Product(1, "SamSung",200);
        Product product2  = new Product(2, "Oppo",300);
        Product product3  = new Product(3, "Iphone",400);
*/
 /*       List<Product> productList = new ArrayList<>();
       productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        String line = null;
        for (Product product: productList){
            line = product.getId() + COMMA + product.getName() + COMMA + product.getPrice();
            try {
                FileWriter fileWriter = new FileWriter(FILE_NAME,true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

  */
        //đọc
       /* FileReader fileReader = null;
        List<String> list = new ArrayList<>();
        try {
             fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line1 = "";
            while ((line1 = bufferedReader.readLine()) != null){
                list.add(line1);
            }
            for (String doc1:list){
                System.out.println(doc1);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String in : list){

        }
        
        String[] line2 ;
        line2 = list.get(0).split(COMMA);
        Product  product = new Product(Integer.parseInt(line2[0]),line2[1],Double.parseDouble(line2[2]));

        */
    }

}