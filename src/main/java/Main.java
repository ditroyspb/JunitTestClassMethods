public class Main {
    public static void main(String[] args) {

        Contact contact1 = new Contact("Anton", "89112222222");
        Contact contact2 = new Contact("Andrey", "89113333333");
        Contact contact3 = new Contact("Masha", "89114444444");
        Contact contact4 = new Contact("Tanya", "89115555555");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.createGroup("Friends");
        phoneBook.createGroup("Work");
        phoneBook.createGroup("Sport");

        phoneBook.addContactsToGroups("Friends", contact1);
        phoneBook.addContactsToGroups("Work", contact1);
        phoneBook.addContactsToGroups("Sport", contact2);
        phoneBook.addContactsToGroups("Work", contact3);
        phoneBook.addContactsToGroups("Friends", contact4);

        phoneBook.searchForNumber("89115555555");
        phoneBook.searchForContactsInGroup("Friends");

        phoneBook.printGroups();


    }
}
