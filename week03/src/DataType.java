public class DataType {
    public static void main(String[] args) {
        // Data Type and Casting (데이터 타입과 형변환)
        int score = 87;
        float gpa = 4.13F;
        System.out.println(score);
        //score = 99.9;
        score = (int)99.9;
        System.out.println(score);
        System.out.println(gpa);
        //score = gpa;
        score = (int)gpa; // 명시적 형변환
        System.out.println(score);
        System.out.println(gpa);
        //gap = score //묵시적 형변횐
        gpa=(float)score; // 묵시적 형변환
        System.out.println(gpa);
    }
}
