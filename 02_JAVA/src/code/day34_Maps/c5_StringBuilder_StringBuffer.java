package code.day34_Maps;

public class c5_StringBuilder_StringBuffer {

    //String vs StringBuilder vs StringBuffer:
    //
    //		String: Immutable version char sequences
    //
    //		StringBuilder: mutable version char sequences, not synchronized
    //
    //		StringBuffer: mutable version char sequences, synchronized , thread-safe, slow
    public static void main(String[] args) {
        String str="Hello";
        str.concat("world");
        System.out.println("str = " + str);////hello
        //string is immutable and we didnt print str.concat(world) or we didnt reassing str=str.concat("world");
        //that is why string object wont be modifieded it will stay as hello

        String str2=str.concat("world");
        System.out.println("str2 = " + str2);


        StringBuilder builder =new StringBuilder("Hello");
        builder.append(" world");//mutable   //append means  concat
        System.out.println(builder);//hello world

        StringBuffer buffer=new StringBuffer("Hello");
        buffer.append("world");
        System.out.println("buffer = " + buffer);


        //another way of to reverse string
        String word = " JAVA";
        StringBuilder builder2=new StringBuilder(word);
        System.out.println("builder2.reverse() = " + builder2.reverse());

    }
}
