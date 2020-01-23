package DAO;

/**
 *
 */
public class DAO_Tutorial {
static Data data = new FileSysten();
    public static void main(String[] args) {
        System.out.println(data.getData());
    }
}
interface Data{
    String getData();
}
class DB implements Data{
    String getFromTable(){
        return "data from table";
    }

    @Override
    public String getData() {
        return getFromTable();

    }
}
class FileSysten implements Data{
    String getFromFS(){
        return "data from FS";
    }

    @Override
    public String getData() {
        return getFromFS();

    }
}