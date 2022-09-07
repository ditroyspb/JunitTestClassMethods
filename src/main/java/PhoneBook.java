import java.util.*;

public class PhoneBook {
    Map<String, List<Contact>> map = new HashMap<>();

    public void createGroup(String newGroup) {
        if (!map.containsKey(newGroup)) {
            map.put(newGroup, new ArrayList<>());
        }
    }

    public void addContactsToGroups(String group, Contact contact) {
        if (!map.containsKey(group)) {
            System.out.println("Такая группа отсутствует.");
        }
        if (!map.get(group).contains(contact)) {
            map.get(group).add(contact);
        }
    }

    public Contact searchForNumber(String number) {
        System.out.println("Поиск контакта по номеру телефона " + number);
        for (List<Contact> contactList : map.values()) {
            for (Contact contact : contactList) {
                if (contact.getNumber().equals(number)) {
                    System.out.println(contact);
                    return contact;
                }
            }
        }
        System.out.println("Данный номер отсутствует в телефонной книге.");
        return null;
    }

    public List<Contact> searchForContactsInGroup(String group) {
        System.out.println("Поиск контактов по группе " + group);
        System.out.println(map.get(group));
        return map.get(group);

    }

    public void printGroups() {
        System.out.println("Сортировка контактов по группам:");
        for (Map.Entry<String, List<Contact>> kv : map.entrySet()) {
            System.out.println("Группа " + kv.getKey() + " содержит следующие контакты: " + kv.getValue());

        }
    }
}
