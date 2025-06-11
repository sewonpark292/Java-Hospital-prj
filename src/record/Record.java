package record;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.*;

import enums.DeptName;
import enums.Gender;
import person.*;

public abstract class Record implements Serializable {
    protected Patient p;
    public Record(Patient p){this.p=p;}

    public abstract void getInfo();
    @Override
    public abstract String toString();
}
