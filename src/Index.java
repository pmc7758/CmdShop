import java.io.File;
import java.util.Scanner;

public class Index {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的用户名：");
        String username = scanner.next();
        System.out.println("请输入你的密码：");
        String password = scanner.next();


        User[] users;
        File file = new File("C:\\Users\\lenovo\\IdeaProjects\\CmdShop\\src\\user.xlsx");
        ReadExcel readExcel = new ReadExcel();
        users = readExcel.readExcel(file);
        for(User user:users){
            if(username.equals(user.getUsername()) && password.equals(user.getPassword())){
                System.out.println("您登陆成功！");
            }else{
                System.out.println("您登陆失败！");
            }
        }


    }


}
