package org.campus02;

public class GenderAnalyzer extends PersonAnalyzer {

    private int avgM = 0;
    private int avgW = 0;

    public int getAvgM() {
        return avgM;
    }

    public int getAvgW() {
        return avgW;
    }

    @Override
    public void analyze() {
        int countM = 0;
        int countW = 0;
        int heightM = 0;
        int heightW = 0;

        for (Person person : super.getPersons()) {
            if (person.getGender() == 'M') {
                countM ++;
                heightM += person.getSize();
            }

            if (person.getGender() == 'F') {
                countW ++;
                heightW = heightW + person.getSize();
            }
        }

        avgM = heightM / countM;
        avgW = heightW / countW;
    }
}
