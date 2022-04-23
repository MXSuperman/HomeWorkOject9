package MXN;

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


public class Book {
    String nameBook;
    private int yearPublication;

    String nameBook2;
    private String yearPublication2;

    public Book(String nameBook, int yearPublication) {
        this.nameBook = nameBook;
        this.yearPublication = yearPublication;
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

    public String getYearPublication2() {
        return yearPublication2;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public String setYearPublication() {
        if (yearPublication < 1874 || yearPublication > 2030) {
            System.out.println("Invalid publishing year parameter: " + yearPublication);
        }
        this.yearPublication = yearPublication;
        return null;
    }
}

//  public String getNameBook() {
  //      return this.nameBook;
