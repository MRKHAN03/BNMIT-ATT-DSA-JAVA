package Collections;

public class BufferBuilderPerformance{
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer();
        for(int i = 0;i<1000000;i++){
            buffer.append("College");
        }
        System.out.println("Buffer time : " + (System.currentTimeMillis()-startTime) +"ms");

        startTime = System.currentTimeMillis();
        StringBuffer builder = new StringBuffer();
        for(int i = 0;i<1000000;i++){
            builder.append("College");
        }
        System.out.println("Builder time : " + (System.currentTimeMillis()-startTime)+"ms");
    }

}
