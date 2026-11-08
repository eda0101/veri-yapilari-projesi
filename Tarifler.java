public class Tarifler {
  private String tarifAdi;
  private Kategori kategori;

  public Tarifler(String tarifAdi,Kategori kategori) {
    this.tarifAdi=tarifAdi;
    this.kategori=kategori;
  }

  public String getTarifAdi() {
    return tarifAdi;
  }

  public Kategori getKategori() {
    return kategori;
  }
}
