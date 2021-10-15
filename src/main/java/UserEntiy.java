/**
 * @author: Star
 * @create: 2021-10-11 10:11
 */
public class UserEntiy {
    private  int id;
    private  String name;

    public UserEntiy(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}