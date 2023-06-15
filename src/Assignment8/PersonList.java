package Assignment8;

public class PersonList {
    //private Person[] persons;
    private final int INITIAL_LENGTH = 2;
    private Person[] currentArray;

    private int size;


    public PersonList() {
        currentArray = new Person[INITIAL_LENGTH];
        this.size = 0;

    }

    public void add(Person P) {
        if (P == null) return;
        if (size == currentArray.length) resize();
        currentArray[size++] = P;
    }

    private void resize() {
        System.out.println("resizing");
        int len = currentArray.length;
        int newlen = 2 * len;
        Person[] newArray = new Person[newlen];
        System.arraycopy(currentArray, 0, newArray, 0, len);
        currentArray = newArray;

    }

    public void insert(Person P, int pos) {
        if (pos > size || pos < 0) return;
        if (pos == currentArray.length || size + 1 > currentArray.length) {
            resize();
        }
        Person[] temp = new Person[currentArray.length + 1];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        temp[pos] = P;
        System.arraycopy(currentArray, pos, temp, pos + 1, currentArray.length - pos);
        currentArray = temp;
        ++size;   //size=size+1
    }

    public boolean remove(Person P) {
        if (size == 0) return false;//list is empty
        if (P == null) return false;
        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (currentArray[i].equals(P)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index + 1, temp, index, currentArray.length - (index + 1));
        currentArray = temp;
        --size;
        return true;
    }

    public boolean find(Person P) {
        if (P == null) return false;
        for (Person test : currentArray) {
            if (test.getLast().equals(P.getLast())) return true;
        }
        return false;//The element is not in the list
    }
    public String toString()
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<size-1;++i)
        {
            sb.append(currentArray[i]+", ");
        }
        sb.append(currentArray[size-1]+"]");
        return sb.toString();
    }


    public static void main(String[] args)
    {
        Person person1 = new Person("Doe", "John", 25);
        Person person2 = new Person("Smith", "Alice", 30);
        Person person3= new Person("Honey", "Bee", 18);

        PersonList personList = new PersonList();
        personList.add(person1);
        personList.add(person2);
        personList .add(person3);
        personList.insert(new Person("Moon", "Maria", 40), 1);
        System.out.println("Person List: " + personList);
        personList.remove(person1);
        System.out.println("Person List: " + personList);
        if(personList.find(person2))
        System.out.println("Person found");
        else  System.out.println("No person found");

    }


    }

