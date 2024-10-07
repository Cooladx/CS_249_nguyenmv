package edu.nguyenmv.oregon;

public class Party {
    private Person [] people;

    public Party(String [] names)
    {
        int cnt = names.length;
        people = new Person [cnt];
        for(int i = 0; i < cnt; i++)
        {
            people[i] = new Person(names[i])
        }

        public int getPartyCnt()
        {
            int aliveCnt = 0;
            for (int i = 0; i < people.length; i++)
            {
                if
            }
        }
    }











    private int partyCnt = 5;
    // TODO
    public int getPartyCnt() {
        // TODO
        return partyCnt;
    }

    public void killEveryone() {
        for(int i = 0; i < people.length; i++)
        {
            people[i].kill();
        }
    }

    public String toString() {
        String s = "PARTY:\n";
        s += partyCnt + " souls alive.\n";
        for(int i = 0; i < people.length; i++)
        {
            s += "* " + people[i] + "\n";
        }
        return s;
    }
}
