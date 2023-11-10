package work02Person;

import work01Utilitor.Utilitor;
import work01Utilitor.Utilitor.*;

public class Person {
    private static int nextId = 1;
    private final int id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = Utilitor.testString(firstName);
        this.lastName = Utilitor.testString(lastName);
        this.id = nextId;
        nextId += 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person(")
                .append(id)
                .append(",")
                .append(firstName)
                .append(",")
                .append(lastName)
                .append(")");
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
}
