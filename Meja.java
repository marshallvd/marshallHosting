class Meja {
    private String nama;
    private double berat;

    public Meja(String nama, double berat){
        this.nama = nama;
        this.berat = berat;
    }

    @Override
    public String toString(){
        return "Barang : " +nama+ ", berat : "+berat;
    }
}
