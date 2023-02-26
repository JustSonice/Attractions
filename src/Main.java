import java.util.*;

public class Main {
    static List<Person> generateClients() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Иван ", "Васильев", 1));
        personList.add(new Person("Владимир ", "Казаков", 3));
        personList.add(new Person("Анастасия ", "Михайлова", 2));
        personList.add(new Person("Ирина ", "Петрова", 1));
        personList.add(new Person("Григорий ", "Серов", 3));
        return (personList);
    }

    public static void main(String[] args) {
        Deque<Person> clients = new ArrayDeque<>(generateClients());

        while (!clients.isEmpty()) {
            Person s = clients.poll();
            if (s.tickets > 0) {
                s.tickets--;
                System.out.println(s.name + s.surname + " прокатился на аттракционе ");
                clients.addLast(s);
            }
        }
    }
}