package MXN;


import java.util.Objects;

public class Author {

    String name;
    String family;

    public Author(String name, String family) {
        this.name = name;
        this.family = family;

    }
    public String toString() {
        return name + " " + family;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(family, author.family);
    }

    public int hashCode() {
        return Objects.hash(name, family);
    }

    public String getName() {
        return this.name;
    }

    public String getFamily() {
        return this.family;
    }

    public static void main(String[] args) {
        Author author = new Author("Alex", "Konobeevskikh");
        System.out.println(author);
        System.out.println(author.toString());

        Author author1 = new Author("Alex" , "Konobeevskih");
        Author author2 = new Author("Alex" ,"Konobeevskih");

        System.out.println(author1.equals(author2));
    }
}