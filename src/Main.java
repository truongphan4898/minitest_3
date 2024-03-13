import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Function function=new Function(scanner);
        do{
            System.out.println("menu");
            System.out.println("1.Nhập ProgrammingBook");
            System.out.println("2.Nhập FictionBook");
            System.out.println("3.Tính tổng tiền của các cuốn sách ");
            System.out.println("4.Đếm số ProgrammingBook có ngôn ngữ là java");
            System.out.println("5.Đếm số FictionBook có thể loại là viễn tưởng 1: ");
            System.out.println("6.Đếm số sách có giá trên 100");
            System.out.println("7.Thoát");
            System.out.println("Tính năng muốn thực hiện: ");
            int num=Integer.parseInt(scanner.nextLine());
            switch (num){
                case 1:
                    function.addProgrammingBook();
                    break;
                case 2:
                    function.addFictionBook();
                    break;
                case 3:
                    function.sumPrice();
                    break;
                case 4:
                    function.countProgrammingBook();
                    break;
                case 5:
                    function.countFictionBook();
                    break;
                case 6:function.countBook();
                    break;
                case 7:
                    System.exit(7);
            }
        }
        while (true);
    }
}
