package streamApi.employee;

public class MinimalDto {
    private int id;
    private String name;
    private String address;
    private String email;

    public MinimalDto() {
    }

    public MinimalDto(int id, String name, String address, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
    }
}
