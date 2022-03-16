import java.util.HashMap;

    public class Map {
        public static void main(String[] args) {
            java.util.Map<String, Meja> meja = new HashMap();
            meja.put("index-1", new Meja("Pulpen", 100));
            meja.put("index-2", new Meja("Penggaris", 50));
            meja.put("index-3", new Meja("Penghapus", 50));
            meja.put("index-1", new Meja("Pensil", 42));
            meja.put("index-4", new Meja("Buku", 300));

            System.out.println("Barang Sebelum : (ukuran= "+meja.size()+")");
            for (String index : meja.keySet()){
                System.out.println("\t " +index+" "+meja.get(index));
            }

            meja.remove("index-2");

            System.out.println("\nBarang Sesudah : (ukuran= "+meja.size()+")");
            for (String index : meja.keySet()){
                System.out.println("\t " +index+" "+meja.get(index));
            }
        }
    }

