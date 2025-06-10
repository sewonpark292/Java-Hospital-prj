package record;

import java.lang.reflect.Array;
import java.util.*;

import enums.DeptName;
import enums.Gender;
import person.*;

public abstract class Record {
    protected Patient p;
    public Record(Patient p){this.p=p;}

    public abstract void getInfo();
}
