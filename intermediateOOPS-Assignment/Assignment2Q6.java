abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
        return "data is saved in file";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
        return "data is saved in database";
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) {
        Persistence persistence;
        boolean isSavedToFile=false;  // if true the data will be saved in file otherwise in database.
        if(isSavedToFile){
            persistence= new FilePersistence();
        }
        else{
            persistence=new DatabasePersistence();
        }
        System.out.println(persistence.persist());
    }
}
