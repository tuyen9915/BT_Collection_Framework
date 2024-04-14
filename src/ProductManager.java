import java.util.*;

public class ProductManager extends Product {

    public ArrayList<Product> products;
    private java.util.ArrayList ArrayList;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ProductManager(){
        ArrayList<Product> products1 = new ArrayList<>();
        this.products = products1;

    }
    public boolean isIDInProductList(int id){
        if(!products.isEmpty()){
            for (Product product: products){
                if(product.getId() == id)
                    return true;
            }
        }
        return false;
    }
    public Product  inputProductData(){
        int id;
        String name;
        double gia;
        Scanner sc = new Scanner(System.in);

        System.out.print("Thêm tên: ");
        name = sc.nextLine();
        do {
            System.out.print("Thêm id: ");
            id = sc.nextInt();
            if (isIDInProductList(id)){
                System.out.println("ID đã trùng");
            }
        }while (isIDInProductList(id));

        System.out.print("Thêm giá: ");
        gia = sc.nextDouble();
        Product product = new Product(id,name,gia);
        return product;

    }
    public void addProduc(Product product){
        products.add(product);
    }
    public void menu(){
          int n;
        do {
            // Hiển thị menu lựa chọn
            Scanner sc = new Scanner(System.in);
            System.out.println("\t\tCHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM");
            System.out.println("1: Thêm sản phẩm");
            System.out.println("2: Sửa thông tin sản phẩm theo id");
            System.out.println("3: Xóa sản phẩm theo id");
            System.out.println("4: Hiển thị danh sách sản phẩm");
            System.out.println("5: Tìm kiếm sản phẩm theo tên");
            System.out.println("6: Sắp xếp sản phẩm tăng dần");
            System.out.println("7: Sắp xếp sản phẩm giảm dần");
            System.out.println("8: Thoát");
            // nhập lựa chọn
            System.out.print("Xin mời bạn nhập lựa chọn: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    Product product = inputProductData();
                    addProduc(product);
                    break;
                case 2:
                    System.out.print("Nhập id sản phẩm cần sửa: ");
                    int sua = sc.nextInt();
                    suaProduct(sua);
                    break;
                case 3:
                    System.out.print("Nhập id sản phẩm cần xóa: ");
                    int xoa = sc.nextInt();
                    xoaProduct(xoa);
                    break;
                case 4:
                    showProduct();
                    break;
                case 5:
                    System.out.print("Nhập id cần tìm: ");
                    int id;
                    id = sc.nextInt();
                     Product product3 = timProduc(id);
                    showProduct2(product3);
                    break;
                case 6:
                    xepGiaTang();
                    showProduct();
                    break;
                case 7:
                    System.out.println("7: Sắp xếp sản phẩm giảm dần");
                    xepGiaGiam();
                    showProduct();
                    break;
            }

        } while (n != 8);
            System.out.println("\t Xin cảm ơn");
    }
    public void showProduct(){
        for (Product product: products){
            System.out.println("ProducID: " + product.getId() + ", ProductName: " +product.getName() + ", ProductGia: "  + product.getPrice());
        }
    }
    public void showProduct2(Product product){
            System.out.println("ProducID: " + product.getId() + ", ProductName: " +product.getName() + ", ProductGia: "  + product.getPrice());
    }
    public Product timProduc(int id){
        if (products.isEmpty()){
            System.out.println("Không có sản phẩm nào");
        }else {
            for (Product product: products){
                if (product.getId() == id){
                    return product;
                }
            }
        }
        return null;
    }
    public Product xoaProduct(int id){
        Product product3 = null;
        int size = products.size();
        for (int i = 0; i < size; i++) {
            if (products.get(i).getId() == id) {
                product3 = products.get(i);
                break;
            }
        }
        if (product3 != null) {
            products.remove(product3);
            showProduct();
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
        return product3;
    }
    public Product suaProduct(int id){
        boolean isExisted = false;
        int size = products.size();
        for (int i = 0; i < size; i++) {
            if (products.get(i).getId() == id) {
                isExisted = true;
                System.out.print("Nhập tên cần sửa: ");
                Scanner scan = new Scanner(System.in);
                String name = scan.nextLine();
                products.get(i).setName(name);
                System.out.print("Nhập giá cần sửa: ");
                double price = scan.nextDouble();
                products.get(i).setPrice(price);
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            showProduct();
        }
        return null;
    }
    public Product xepGiaTang() {
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(products,priceComparator);
        return null;
    }
    public Product xepGiaGiam() {
        Giam giam = new Giam();
        Collections.sort(products,giam);
        return null;
    }


}
