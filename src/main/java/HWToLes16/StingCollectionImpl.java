package HWToLes16;

public class StingCollectionImpl implements StringCollection{
    int size;
    int i;
    String[] array = new String[size];

    public int size() {
        return size;
    }
    @Override
    public boolean add(int index, String one) {
        if(index >= 0 && index < size) {
            size++;
            String[] array2 = new String[size];
            for (int j = 0; j < index; j++) {
                array2[j] = array[j];
            }
            array2[index] = one;
            for (int j = index+1; j < array2.length; j++) {
                array2[j] = array[j-1];
            }
            array = array2;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean add(String str) {
        size++;
        String[] array2 = new String[size];
        for (int j = 0; j < array.length; j++) {
            array2[j] = array[j];
        }
        array2[size-1] = str;
        array = array2;
        return true;
    }


    @Override
    public String get(int i) {
        this.i = i;
        return array[i];
    }

    public boolean contains(String one) {
        for (String s : array) {
           if(s.equals(one)) {
               return true;
           }
        }
        return false;
    }
    @Override
    public boolean equals(StringCollection collection) {
        for (int j = 0; j < this.array.length; j++) {
            if (j >= collection.size() || !collection.get(j).equals(this.array[j])) {
                return false;
            }
        }
        return true;
    }

    public boolean delete(String two) {
        int deleteNum = -1;
        for (int j = 0; j < array.length; j++) {
            if (array[j].equals(two)) {
                deleteNum = j;
            }
        }
        if(deleteNum == -1){
            return false;
        }else {
            size--;
            String[] array2 = new String[size];
            for (int j = 0; j < deleteNum; j++) {
                array2[j] = array[j];
            }
            if ((size - deleteNum) != 1) {
                for (int j = deleteNum + 1; j < array2.length+1; j++) {
                    array2[j-1] = array[j];
                }
            }
            array = array2;
            return true;
        }
    }

    public boolean clear() {
        size = 0;
        return true;
    }
}
