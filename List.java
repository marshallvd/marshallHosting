import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        java.util.List<String> meja = new ArrayList<>();

        meja.add("Buku");
        meja.add("Pulpen");
        meja.add("Penggaris");

        System.out.println("Isi sebelum : ");
        for (int i = 0; meja.size() > i; i++){
            System.out.println("isi ke- "+(i+1) + " : "+meja.get(i));
        }

        meja.remove("Buku");

        System.out.println("Isi sesudah : ");
        for (int i = 0; meja.size() > i; i++){
            System.out.println("isi ke- "+(i+1) + " : "+meja.get(i));
        }

    }
}
