package Oct.Task11102024;

public class BaseTestAPI {

    private  String name;

    private int id;

    public BaseTestAPI() {

        System.out.println("DC of base Class");
    }


   public void performGET(){

       System.out.println("get the data");



   }

    public void performPOST(){

        System.out.println("upload the data");



    }
    public void performPatch(){

        System.out.println("patch edit existing the data");



    }
    public void performPUT(){

        System.out.println("patch update the existing the data");



    }

    public void performDelete(){

        System.out.println("Delete  the existing the data");

    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean auth) {

        if(auth){
            this.name = name;
        }
        else{

            System.out.println("not allowed");
        }



    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
