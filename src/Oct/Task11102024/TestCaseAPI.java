package Oct.Task11102024;

public class TestCaseAPI extends BaseTestAPI {

    public TestCaseAPI() {

        super();

        super.performGET();
        super.performPUT();
        super.performPatch();
        super.performPOST();
        super.performDelete();
        this.performDelete();
        System.out.println(" DC of child constructor");
    }
        //Method overriding
        @Override
        public void setName(String name, boolean auth) {
            super.setName(name,auth);
        }
        @Override
        public void setId(int id) {
            super.setId(id);

        }
        // Method Overloading
        public void performDelete(String name)
        {
            System.out.println(" DElete-Delete the data of user " +name);
        }




}
