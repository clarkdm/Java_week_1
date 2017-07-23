package Intermediate_2.Library;

/**
 * Created by dmclark on 21/07/17.
 */
public interface Library_I {

    public boolean add_Books(String name, String ather);

    public boolean add_Maps(String name, String loc);

    public boolean add_Newspapers(String name, String date);

    public boolean Check_out_item(int id, String U_name);

    public boolean Check_in_item(int id);

    public void Remove_item(int id);

    public void Remove_item(String name);

    public boolean Update_Books(String name, String new_name, String ather);

    public boolean Update_Maps(String name, String new_name, String loc);

    public boolean Update_Newspapers(String name, String new_name, String date);

    public int get_ID(String name_);

    public String all_Item_toString();

    public String all_U_toString();

    public boolean Register_person(String name);

    public boolean Delete_person(String name);

    public boolean Update_person(String name, String ather);









}
