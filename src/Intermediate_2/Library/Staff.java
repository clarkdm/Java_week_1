package Intermediate_2.Library;

/**
 * Created by dmclark on 21/07/17.
 */
public class Staff {
    String name = "";


    public Staff(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        Library_I l = new Library();

        l.add_Books("bobs", "String1");
        l.add_Books("bob", "String1");
        l.add_Books("bo", "String1");
        l.add_Books("b", "123456789");
        l.add_Books("~", "String1");
        l.add_Books("b~", "String1");
        l.add_Books("bo~", "String1");

        l.add_Maps("Mbobs", "String1");
        l.add_Maps("Mbob", "String1");
        l.add_Maps("Mbo", "String1");

        l.add_Newspapers("Mbobs2", "String1");
        l.add_Newspapers("Mbob2", "String1");
        l.add_Newspapers("Mbo2", "String1");
        System.out.println("test " + l);
        System.out.println(l.Update_Books("bob", "qwertyu", "test_2"));


        l.Register_person("q");
        l.Register_person("qw");
        l.Register_person("qe");
        l.Register_person("qr");

        l.Check_out_item(l.get_ID("Mbobs"), "qw");
        l.Check_out_item(l.get_ID("Mbo2"), "qe");
        l.Check_out_item(l.get_ID("bo"), "q");


        System.out.println(l);


//        System.out.println(w_W_F.to_File("person"));
//        System.out.println(w_W_F.from_File("person"));
//        System.out.println(w_W_F.bobs);


    }

}
