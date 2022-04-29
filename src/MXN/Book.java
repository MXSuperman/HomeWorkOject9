package MXN;

public class Book {
    String nameBook;
    private int yearPublication;

    public Book(String nameBook, String yearPublication) {
        this.nameBook = nameBook;
        this.yearPublication = Integer.parseInt(yearPublication);
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

