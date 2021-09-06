package main.dto;

public class TestDTO {
    int ms_id;
    String join_date;
    String f_name;

    public TestDTO(int ms_id) {
    }

    public TestDTO(int ms_id, String join_date, String f_name) {
        this.ms_id = ms_id;
        this.join_date = join_date;
        this.f_name = f_name;
    }

    public int getMs_id() {
        return ms_id;
    }

    public void setMs_id(int ms_id) {
        this.ms_id = ms_id;
    }

    public String getJoin_date() {
        return join_date;
    }

    public void setJoin_date(String join_date) {
        this.join_date = join_date;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    @Override
    public String toString() {
        return "TestDTO{" +
                "ms_id=" + ms_id +
                ", join_date='" + join_date + '\'' +
                ", f_name='" + f_name + '\'' +
                '}';
    }
}
