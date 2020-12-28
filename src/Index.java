import java.io.File;
import java.util.Scanner;


// https://github.com/ddk123456/ConsoleShop/tree/first
public class Index {

    public static void main(String[] args) {



        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你的用户名：");
            String username = scanner.next();
            System.out.println("请输入你的密码：");
            String password = scanner.next();


            File file = new File("C:\\Users\\lenovo\\IdeaProjects\\CmdShop\\src\\user.xlsx");
            ReadUserExcel readUserExcel = new ReadUserExcel();
            User[] users = readUserExcel.readUserExcel(file);
            for(User user:users){
                if(username.equals(user.getUsername()) && password.equals(user.getPassword())){
                    System.out.println("您登陆成功！");

                    File f1 = new File("C:\\Users\\lenovo\\IdeaProjects\\CmdShop\\src\\product.xlsx");
                    ReadProductExcel readProductExcel = new ReadProductExcel();
                    Product[] products = readProductExcel.readAllProductExcel(f1);
                    for (Product product:products){
                        System.out.print(product.getId());
                        System.out.print("\t\t" + product.getProductName());
                        System.out.print("\t" + product.getPrice());
                        System.out.println("\t\t" + product.getDes());
                    }
                    System.out.println("请输入你想要的商品id");
                    scanner.next();



                    flag = false;
                }else{
                    System.out.println("您登陆失败！");
                }
            }
        }


    }


}
