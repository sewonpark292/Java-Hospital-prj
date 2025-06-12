package record;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecordsManagement {

    private Map<Integer, List<Record>> patientRec = new HashMap<>();

    public Map<Integer, List<Record>> getMap() {
        return this.patientRec;
    }
    public void savePatientRecordToFile(Integer key) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("records.txt"));
            for(List<Record> rlist : patientRec.values()) {
                for(Record r : rlist) {
                    oos.writeObject(r);
                }
            }
        } catch(IOException e){
            System.out.println(e);
        }
    }
    public void putRecord(Integer key, Record rec) {
        if (patientRec.get(key) == null) {
            patientRec.put(key, new ArrayList<>());
        }
        patientRec.get(key).add(rec);
        savePatientRecordToFile(key);
    }
    public void setRecordByIdx(Integer key, int idx, Record rec){
        List<Record> records = patientRec.get(key);
        if(idx<records.size()){
            records.set(idx,rec);
            savePatientRecordToFile(key);
        }
    }
    public void removeAllRecord(Integer key){
        patientRec.remove(key);
    }
    public void removeRecordByIdx(Integer key, int idx){
        List<Record> rec=patientRec.get(key);
        if(idx<rec.size()){
            rec.remove(idx);
            savePatientRecordToFile(key);
        }
    }
    public void recordInfo(int key){
        int i=0;
        List<Record> records = patientRec.get(key); //get하면 value가 나옴
        for (Record record : records) { //diagnosis, prescription, treatment 출력
            System.out.print("["+i+"]");
            record.getInfo();
            i++;
        }
    }
}
