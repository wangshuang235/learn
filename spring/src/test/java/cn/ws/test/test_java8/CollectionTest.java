package cn.ws.test.test_java8;

import com.sun.corba.se.spi.ior.ObjectId;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class CollectionTest{



    @Test
    public void b() {
        //AddressBook addressBook = addressBookService.findById(UUIDUtils.generateObjectId("598d26a30cf2cc98c98725d9"));
        AddressBook addressBook = new AddressBook(); //假装是查出来的数据

        Contact contact3 = new Contact();
        contact3.setName("小红");
        contact3.setPhone("13610838069");

        Contact contact4 = new Contact();
        contact4.setName("小李");
        contact4.setPhone("13510838069");

        Contact contact5 = new Contact();
        contact5.setName("小小明");
        contact5.setPhone("13810838069");

        Set<Contact> contactSet = new HashSet<>();

        contactSet.add(contact3);
        contactSet.add(contact4);
        contactSet.add(contact5);

        Set<Contact> collect = addressBook.getContactSet().stream()
                .filter(contact -> !contactSet.stream().map(Contact::getPhone).collect(toList()).contains(contact.getPhone()))
                .collect(toSet());

        System.out.print(addressBook);
    }

    private class AddressBook {
        private ObjectId id;
        private Set<Contact> contactSet;

        public ObjectId getId() {
            return id;
        }

        public void setId(ObjectId id) {
            this.id = id;
        }

        public Set<Contact> getContactSet() {
            return contactSet;
        }

        public void setContactSet(Set<Contact> contactSet) {
            this.contactSet = contactSet;
        }
    }

    private class Contact {
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Contact contact = (Contact) o;

            if (name != null ? !name.equals(contact.name) : contact.name != null) return false;
            return phone != null ? phone.equals(contact.phone) : contact.phone == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (phone != null ? phone.hashCode() : 0);
            return result;
        }
    }

    @Test
    public void test(){

        /*Set<Contact> collect1 = contactRepository.stream()
                .filter(contact -> !addressBook.getContactSet().stream().map(Contact::getPhone).collect(toList()).contains(contact.getPhone()))
                .collect(toSet());

        boolean all = collect1.addAll(addressBook.getContactSet());*/
        /*List<Long> list = contactRepository.stream().map(contact2 -> {
            return Long.parseLong(contact2.getPhone());
        }).collect(toList());

        List<Contact> collect = addressBook.getContactList().stream().filter(contact -> {
            boolean b = list.contains(Long.parseLong(contact.getPhone()));
            return !b;
        }).collect(toList());*/
        System.out.print("");

    }
    @Test
    public void test2(){
        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("122");
        boolean contains = list.contains("122");
        System.out.println(contains);

    }

}
