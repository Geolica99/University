package task_pck;

import java.time.LocalDateTime;

public class Test {

    public static void testMessageTask(){
        Task[] arr = new Task[5];
        LocalDateTime time_ = LocalDateTime.now();
        MessageTask m1 = new MessageTask("1", "abcx", "MESAJ", "Ana", "Robert", time_);
        MessageTask m2 = new MessageTask("1", "abcx", "MESAJ", "asdas", "Robert", time_);
        MessageTask m3 = new MessageTask("1", "abcx", "MESAJ", "Ana", "Robert", time_);
        MessageTask m4 = new MessageTask("1", "abcx", "MESAJ", "Ana", "Robert", time_);
        MessageTask m5 = new MessageTask("1", "abcx", "MESAJ", "Ana", "Robert", time_);
        arr[0] = m1;
        arr[1] = m2;
        arr[2] = m3;
        arr[3] = m4;
        arr[4] = m5;

        for (Task elem:
                arr) {
            elem.execute();

        }
    }
}
