package Bean;

public class Teacher extends Account{
    private String name;
    private String sdt;
    private String diachi;
    private String email;

    public Teacher(){

    }
    public Teacher(String name, String sdt, String diachi, String email) {
        this.name = name;
        this.sdt = sdt;
        this.diachi = diachi;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
