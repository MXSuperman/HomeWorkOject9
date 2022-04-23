package MXN;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        String nameBook = "Mysterious island";
        int yearPublication = 1874;

        String nameBook2 = "Jack London";
        int yearPublication2 = 1909;

        String[] names = {"Mysterious island", "Jack London"};
        int[] yearPublications = {1874, 1909};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name book " + names[i] + " year publication - " + yearPublications[i]);

            String name = "Jules";
            String family = "Verne";

            String name2 = "Martin";
            String family2 = "Eden";
        }
        // First Exercise

        Author author = new Author("Jules", "Verne");
        System.out.println(author.getName() + " " + author.getFamily());
        Book book = new Book("Mysterious island", 1874);
        Author author2 = new Author("Martin", "Eden");
        System.out.println(author2.getName() + " " + author2.getFamily());
        Book book2 = new Book("Jack London", 1909);

        System.out.println(book.getNameBook() + " " + book.setYearPublication() + " " + author.getName() + " " + author.getFamily());
        System.out.println(book2.getNameBook() + " " + book2.getYearPublication() + " " + author2.getName() + " " + author2.getFamily());
    }
}

// for example

//     String nameJohn = "John";
//   int ageJohn = 13;

//    String nameSarah = "Sarah";
//    int ageSarah = 30;

//   String[] names = {"John", "Sarah"};
//  int[] ages = {13,30};

//   for (int i = 0; i < names.length; i++) {
//      System.out.println("Name - " + names[i] + " age - " + ages[i]);
//   }
//  Person sarah = new Person("Sarah", 30);
//  System.out.println("sarah.name = " + sarah.getName());
//  System.out.println("sarah.age = " + sarah.getAge());
//  sarah.setAge(31);
//  System.out.println("sarah.getAge() = " + sarah.getAge());
//  Person john = new Person("John", 13 );