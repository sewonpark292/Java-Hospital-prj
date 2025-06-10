package record;

import jdk.jshell.Diag;
import person.Patient;

import javax.xml.crypto.dsig.DigestMethod;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecordsManagement {

    private Map<Integer, List<Record>> patientRec = new HashMap<>();

    public void putRecord(Integer key, Record rec) {
        if (patientRec.get(key) == null) {
            patientRec.put(key, new ArrayList<>());
        }
        patientRec.get(key).add(rec);
    }
    public void setRecordByIdx(Integer key, int idx, Record rec){
        List<Record> records = patientRec.get(key);
        if(idx<records.size()){
            records.set(idx,rec);
        }
    }
    public void removeAllRecord(Integer key){
        patientRec.remove(key);
    }
    public void removeRecordByIdx(Integer key, int idx){
        List<Record> rec=patientRec.get(key);
        if(idx<rec.size()){
            rec.remove(idx);
        }
    }
    public void recordInfo(int key){
        List<Record> records = patientRec.get(key); //get하면 value가 나옴
        for (Record record : records) { //diagnosis, prescription, treatment 출력
            record.getInfo();
        }
    }
}
