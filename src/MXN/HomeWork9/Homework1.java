package MXN.HomeWork9;

import MXN.Author;
import MXN.Book;

import java.util.Objects;

public class Homework1 {
    private String name;
    private String family;
    private String nameBook;
    private int yearPublication;

    public Homework1(String name, String family, String nameBook, int yearPublication) {
        this.family = family;
        this.nameBook = nameBook;
    }

    public Homework1(String name, String family, String nameBook, String yearPublication) {
    }

    public String toString() {
        return nameBook + " " + family + " " + nameBook + " " + yearPublication;

    }

    public boolean equals(Object total) {
        if (this == total) return true;
        if (total == null || getClass() != total.getClass()) return false;
        Homework1 homework1 = (Homework1) total;
        return yearPublication == homework1.yearPublication && Objects.equals(name, homework1.name) && Objects.equals(family, homework1.family) && Objects.equals(nameBook, homework1.nameBook);
    }

    public int hashCode() {
        return Objects.hash(name, family, nameBook, yearPublication);
    }

    public class Method {
        String A = name;
        String B = family;
        String C = nameBook;
        int D = yearPublication;
    }
    public static void main(String[] args) {

        Homework1 homework1 = new Homework1("Aleksei", "Konobeevskikh", "Future", "2001");
        System.out.println(homework1);
        System.out.println(homework1.toString());

        Homework1 homework11 = new Homework1("Alex" , "Konobeevskih" , "Great", 1800);
        Homework1 homework12 = new Homework1("Alex" ,"Konobeevskih" , "Great" , 1800);

        System.out.println(homework11.equals(homework12));

    }
    }


