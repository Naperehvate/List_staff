import java.util.HashSet;
import java.util.Set;

public class Persons_collect
{
    private Set<Persons> persons;

    public Persons_collect()
    {
        persons = new HashSet<>();
    }

    public boolean addPerson(Persons person)
    {
        return persons.add(person);
    }
    public boolean removePerson(Persons person)
    {
        return persons.remove(person);
    }
    public void PrintAllPersons()
    {
        for (Persons person : persons)
        {
            System.out.println(person);
        }
    }
    public Persons SearchPersonsByIdNumber(String idNumber)
    {
        for (Persons person : persons)
        {
            if (person.getIdNumber().equals(idNumber))
            {
                return person;
            }
        }
        return null;
    }
}
