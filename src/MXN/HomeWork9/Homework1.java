package MXN.HomeWork9;

import MXN.Author;
import MXN.Book;

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

    public boolean equals(Homework1 homework1) {
        if (this == homework1) {
            return true;
        }
        if (homework1 == null || getClass() != homework1.getClass()) {
            return false;
        }
        Homework1 h = (Homework1) homework1;
        return name == h.name && family == h.family && nameBook == h.nameBook && yearPublication == h.yearPublication;

    }

    public int hashCode() {
        int hash = yearPublication;
        hash = 10 * hash + yearPublication;
        return hash;
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


