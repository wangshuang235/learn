package collection.test;

import org.bson.types.ObjectId;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest2{


    AddressBook addressBook = new AddressBook(ObjectId.get());


    @Before
    public void b() {
        Contact contact = new Contact();
        contact.setName("王爽");
        contact.setPhone("18810838069");
        List<Contact> contactList = new ArrayList<Contact>();
        contactList.add(contact);

        addressBook.setContactList(contactList);
    }

    @Test
    public void test(){
    }
}


class AddressBook {
    private ObjectId id;
    private List<Contact> contactList;

    public AddressBook(ObjectId id) {
        this.id = id;
    }

    public ObjectId getId() {
        return id;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
}

class Contact {
    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}