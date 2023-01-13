public class Main {
    public static void main(String[] args) {
        ProgrammingBook pb1 = new ProgrammingBook("bookcode", "doan", 120, "huyhoang", "Java");
        ProgrammingBook pb2 = new ProgrammingBook("bookcode", "doan", 130, "huyhoang", "C++");
        ProgrammingBook pb3 = new ProgrammingBook("bookcode", "doan", 140, "huyhoang", "Java");
        ProgrammingBook pb4 = new ProgrammingBook("bookcode", "doan", 150, "huyhoang", "Pytthon");
        ProgrammingBook pb5 = new ProgrammingBook("bookcode", "doan", 160, "huyhoang", "Java");
        ProgrammingBook[] arr1 = new ProgrammingBook[5];
        arr1[0] = pb1;
        arr1[1] = pb2;
        arr1[2] = pb3;
        arr1[3] = pb4;
        arr1[4] = pb5;
        FictionBook fb1 = new FictionBook("doancode", "huyqh", 90, "tung", "Viễn tưởng 1");
        FictionBook fb2 = new FictionBook("doancode", "huyqh", 120, "tung", "Viễn tưởng 1");
        FictionBook fb3 = new FictionBook("doancode", "huyqh", 150, "tung", "Viễn tưởng 1");
        FictionBook fb4 = new FictionBook("doancode", "huyqh", 160, "tung", "Viễn tưởng 1");
        FictionBook fb5 = new FictionBook("doancode", "huyqh", 170, "tung", "Viễn tưởng 1");
        FictionBook[] arr2 = new FictionBook[5];
        arr2[0] = fb1;
        arr2[1] = fb2;
        arr2[2] = fb3;
        arr2[3] = fb4;
        arr2[4] = fb5;
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i].getPrice();
        }
        int sum1 = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum1 += arr2[i].getPrice();

        }
        System.out.println(" giá của 10 cuấn sachs là" + (sum1 + sum));
        System.out.println("số sách ProgrammingBook có language là "+" " +demJAva(arr1) );
        System.out.println("số sách Fiction có category là Viễn tưởng 1:"+" " + demVt(arr2));
        System.out.println(" số sách có giá < 100:"  + " "+ demGia(arr2));

    }

    public static int demJAva(ProgrammingBook[] arr) {
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getLanguage().equals("Java")) {
                count1++;
            }
        }return count1;
    }
    public static int demVt(  FictionBook[] arr2){
        int count2=0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i].getCategory().equals("Viễn tưởng 1")){
                count2++;
            }
        }return count2;
    }
    public static int demGia( FictionBook[] arr2){
        int count3=0;
        for (int i = 0; i < arr2.length; i++) {
            if ((arr2[i].getPrice())<100){
                count3++;
            }
        }return count3;
    }

}