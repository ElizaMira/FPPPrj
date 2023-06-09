package Assignment6;

public class MyTable {
    private Entry[] entries=new Entry[26];

    public void add(char c,String s)
    {
        int c1=(int)c;
        int address = c1-97;
        entries[address]=new Entry(c,s);
    }

    public String toString ()
    {
        String str = "";
        for (Entry e : entries) {
            if(e != null){
                str += e.toString();
                str += "\n";
            }

        }
        return  str;

    }
    private class Entry {
        char ch;
        String str;

        Entry(char ch, String str) {
            this.ch = ch;
            this.str = str;
        }
        public String toString() {
          return ch+"->"+str;
        }
    }
    public static void main(String[] args)
    {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b',"Billy");
        t.add('c',"Charlie");

        System.out.println(t);

    }
}
