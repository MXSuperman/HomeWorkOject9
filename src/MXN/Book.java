package MXN;

public class Book {
    String nameBook;
    private int yearPublication;

    String nameBook2;
    private String yearPublication2;

    private Author author;

    public Book(String nameBook, int yearPublication, Author author) {
        this.nameBook = nameBook;
        this.yearPublication = yearPublication;
        this.author = author;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public void Book2(String nameBook2, int yearPublication2) {
        this.nameBook = nameBook2;
        this.yearPublication = yearPublication2;
    }

    public String getNameBook2() {
        return this.nameBook2;
    }

    public int getYearPublication() {
        return yearPublication;
    }
    public String getYearPublication2() {
        return yearPublication2;
    }

    public void setYearPublication() {
        if (yearPublication < 1874 || yearPublication > 2030) {
            System.out.println("Invalid publishing year parameter: " + yearPublication);
            return;
        } else
            this.yearPublication = yearPublication;
    }
    public void setYearPublication2() {
        if (yearPublication < 1909 || yearPublication > 2030) {
            System.out.println("Invalid publishing year parameter: " + yearPublication2);
            return;
        } else
            this.yearPublication2 = yearPublication2;
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

