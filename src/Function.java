import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Function {
private List<ProgrammingBook>ProgrammingBooks;
private List<FictionBook>FictionBooks;
private Scanner scanner;
public Function(Scanner scanner){
    ProgrammingBooks=new ArrayList<>();
    FictionBooks=new ArrayList<>();
    this.scanner=scanner;
}
public void addProgrammingBook() {
    System.out.println("số sách cần nhập:");
    int numBook=Integer.parseInt(scanner.nextLine());
    for (int i = 0; i < numBook; i++) {
        System.out.println("Nhập mã sách: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sách: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sách: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập tên tác giả sách: ");
        String author = scanner.nextLine();
        System.out.println("Nhập ngôn ngữ sách: ");
        String language = scanner.nextLine();
        System.out.println("Nhập số trang sách: ");
        int framework = Integer.parseInt(scanner.nextLine());
        ProgrammingBook p = new ProgrammingBook(id, name, price, author, language, framework);
        ProgrammingBooks.add(p);
    }
}
    public void addFictionBook() {
        System.out.println("số sách cần nhập:");
        int numBook=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numBook; i++) {
            System.out.println("Nhập mã sách: ");
            String id = scanner.nextLine();
            System.out.println("Nhập tên sách: ");
            String name = scanner.nextLine();
            System.out.println("Nhập giá sách: ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập tên tác giả sách: ");
            String author = scanner.nextLine();
            System.out.println("Nhập phân loại sách: ");
            String category = scanner.nextLine();
            FictionBook f = new FictionBook(id, name, price, author, category);
            FictionBooks.add(f);
        }
    }
    public void sumPrice(){
        double sumP=0;
        double sumF=0;
        double sumPrice;
        for(ProgrammingBook p:ProgrammingBooks){
            sumP+=p.getAmount();
        }
        for (FictionBook f:FictionBooks){
            sumF+=f.getAmount();
        }
        sumPrice=sumP+sumF;
        System.out.println("Tổng giá của "+(ProgrammingBooks.size()+FictionBooks.size())+ " sách là: "+ sumPrice);
    }
    public void countProgrammingBook(){
        System.out.println("nhập loại ngôn ngữ sách cần đếm: ");
        String language=scanner.nextLine();
        int count=0;
        boolean check=true;
        for (ProgrammingBook p:ProgrammingBooks){
        if(p.getLanguage().equals(language)) {
            count++;
            check = false;

        }
        }

        if(!check){
            System.out.println("Số sách có ngôn ngữ java là: "+ count);}
        else{
            System.out.println("loại ngôn ngữ bạn nhập không đúng! ");
        }
    }
    public void countFictionBook(){
        System.out.println("nhập thể loại sách cần đếm: ");
        String category=scanner.nextLine();
        int count=0;
        boolean check=true;
        for (FictionBook p:FictionBooks){
            if(p.getCategory().equals(category)) {
                count++;
                check = false;

            }


        }
        if(!check){
            System.out.println("Số sách có thể loại viễn tưởng 1 là: "+ count);
        }
        else{
            System.out.println("Thể loại sách bạn nhập không đúng! ");
        }
    }
    public void countBook(){
      int P1=0;
      int F1=0;

        for(ProgrammingBook p:ProgrammingBooks){
            if(p.getPrice()>100){
                P1++;
            }
        }
        for (FictionBook f:FictionBooks){
            if(f.getPrice()>100){
                F1++;
            }
        }
        int countBook=P1+F1;
        System.out.println("Tổng số ProgrammingBook có giá trên 100 là: "+ P1);
        System.out.println("Tổng số FictionBook có giá trên 100 là: "+ F1);
        System.out.println("Tổng số sách có giá trên 100 là: "+ countBook);
    }
    }

