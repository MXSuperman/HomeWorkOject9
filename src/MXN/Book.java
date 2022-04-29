package MXN;

import java.util.Objects;

public class Book {
    String nameBook;
    private int yearPublication;

    public Book(String nameBook, String yearPublication) {
        this.nameBook = nameBook;
        this.yearPublication = Integer.parseInt(yearPublication);
    }

    public String toString() {
        return nameBook + " " + yearPublication;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(nameBook, book.nameBook);
    }

    public int hashCode() {
        return Objects.hash(nameBook, yearPublication);
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public void setYearPublication(int yearPublication) {
        if (yearPublication < 1874 || yearPublication > 2030) {
            System.out.println("Invalid publishing year parameter: " + yearPublication);
            return;
        } else {
            this.yearPublication = yearPublication;
        }
    }

    public int getYearPublication() {
        return yearPublication;
    }
    public static void main(String[] args) {
        Book book = new Book("Great", "1800");
        System.out.println(book);
        System.out.println(book.toString());

        Book book1 = new Book("Great" , "1800");
        Book book2 = new Book("Great" ,"1800");

        System.out.println(book1.equals(book2));
    }
}


//  public String getNameBook() {
  //      return this.nameBook;

// public class Person {
//   private String name;
//   private int age;

//   public Person(String name, int age) {
//      this.name = name;
//      this.age = age;
//   }
//  public String getName(){
//       return this.name;
//  }
//   public int getAge() {
//      return this.age;
// }
//   public void setAge(int age) {
//      this.age = age;
//   }
//   }

