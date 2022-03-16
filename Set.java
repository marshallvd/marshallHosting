import java.util.HashSet;
import java.util.Iterator;

public class Set {
    public static void main(String[] args) {

        java.util.Set<String> meja = new HashSet<>();

        meja.add("Pulpen");
        meja.add("Buku");
        meja.add("Penggaris");
        meja.add("Pensil");
        meja.add("Pulpen");

        System.out.println("Barang sebelum (ukuran = " +meja.size()+ ")");
        //menampilkan urutan type dengan iterator
        for (Iterator iterator = meja.iterator(); iterator.hasNext();){
            System.out.println("\t "+iterator.next());
        }
        meja.remove("Buku");

        System.out.println("Barang sesudah (ukuran = " +meja.size()+ ")");

        for (Iterator iterator = meja.iterator(); iterator.hasNext();){
            System.out.println("\t "+iterator.next());
        }
    }
}
