import java.util.*;
import java.util.stream.Collectors;

class Book implements Comparable<Book> {
    int id;
    String name;
    String author;
    String publisher;
    int quantity;

    public int compareTo(Book other) {
        return this.id-other.id;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Book [author=" + author + ", id=" + id + ", name=" + name + ", publisher=" + publisher + ", quantity="
                + quantity + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Book other = (Book) obj;
        if (author == null) {
            if (other.author != null) return false;
        } else if (!author.equals(other.author)) return false;
        if (id != other.id) return false;
        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;
        return true;
    }

}


public class BookDriver {
    public static void main(String[] args) {
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);//16
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);//8
        Book b4 = new Book(123, "Let us C", "Yashwant Kanetkar", "Mc Graw Hill", 11);

        List<Book> books = Arrays.asList(b1,b2,b3,b4);
        books.stream().forEach(System.out::println);


        Set<Book> bookSet = books.stream().collect(Collectors.toSet());
        bookSet.stream().forEach(System.out::println);

        List<Book> newList = books.stream().sorted()
        .map(n->{n.setQuantity(2*n.getQuantity());return n;})
        .filter(n-> n.getQuantity()>10).toList();
        newList.forEach(System.out::println);

        int booksSold = books.stream().filter(n-> n.id<200).map(e->e.quantity).reduce(0,(ans,i)->ans+i);
        System.out.println(booksSold);
        


        
        

    }
}
