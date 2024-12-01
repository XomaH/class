public class Main {
    public static void main(String[] args) {
        Author Tolstoy = new Author("Лев", "Толстой");
        Author Bulgakov = new Author("Михаил", "Булгаков");

        Book VoinaIMir = new Book(2000, Tolstoy, "Война и Мир");
        Book MasterIMargorita = new Book(2015, Bulgakov, "Мастер и Маргорита");

        System.out.println("MasterIMargorita = " + MasterIMargorita.getBookName() + " " + MasterIMargorita.getPublicData());
        System.out.println("MasterIMargorita = " + VoinaIMir.getBookName() + " " + VoinaIMir.getPublicData());

        VoinaIMir.setPublicData(2025);
        System.out.println("MasterIMargorita = " + VoinaIMir.getBookName() + " " + VoinaIMir.getPublicData());


    }


}