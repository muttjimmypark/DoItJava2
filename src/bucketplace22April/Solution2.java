package bucketplace22April;

import java.util.*;

class MyQueue {
    private List<Character> arrayQueue = new ArrayList<>();
    private int whenEvent = 0;
    private String whereTurn;

    public void enQueue(Character data) {
        /* 막판 null 넣고 종료할때 불필요
        int len = arrayQueue.size();
        if (len == 6) {
            this.deQueue();
        }*/
        arrayQueue.add(data);
    }

    public Character deQueue() {
        int len = arrayQueue.size();

        if (len == 0) {
            return null;
        }

        return arrayQueue.remove(0);
    }

    public void setDefaultQueue(String path) {
        for (int i = 0; i < 6; i++) {
            this.enQueue(path.charAt(i));
        }
    }

    public boolean event() {
        for (int i = 0; i < 5; i++) {
            char[] tmp = new char[2];
            tmp[0] = arrayQueue.get(i);
            tmp[1] = arrayQueue.get(i + 1);

            if ((arrayQueue.get(i + 1) != null) && (tmp[0] != tmp[1])) {
                whenEvent = i + 1;
                whereTurn = justiceTurn(tmp[0], tmp[1]);
                return true;
            }
        }

        return false;
    }

    public String getWhereTurn() {
        return whereTurn;
    }

    private String justiceTurn(char c1, char c2) {
        if (c1 == 'E') {
            if (c2 == 'N') {
                return "left";
            }
            if (c2 == 'S') {
                return "right";
            }
        }

        if (c1 == 'S') {
            if (c2 == 'E') {
                return "left";
            }
            if (c2 == 'W') {
                return "right";
            }
        }

        if (c1 == 'W') {
            if (c2 == 'S') {
                return "left";
            }
            if (c2 == 'N') {
                return "right";
            }
        }

        if (c1 == 'N') {
            if (c2 == 'W') {
                return "left";
            }
            if (c2 == 'E') {
                return "right";
            }
        }

        return "Straight";
    }


    public int getWhenEvent() {
        return whenEvent;
    }

}

class Solution2 {
    public String[] solution2(String path) {
        //틱0 탐색
        //메시지발생시 해당틱으로 넘어가
        //없으면 틱1 탐색

        ArrayList<String> resultTmp = new ArrayList<>();
        int msgCount = 0;
        int tic = 0;
        MyQueue myQueue = new MyQueue();
        myQueue.setDefaultQueue(path);

        while (tic < path.length()) {
            int nextTic = 1;

            if (myQueue.event()) {
                msgCount++;
                resultTmp.add(mkmsg(tic, myQueue.getWhenEvent(), myQueue.getWhereTurn()));
                nextTic = myQueue.getWhenEvent();
            }

            for (int i = 0; i < nextTic; i++) {
                myQueue.deQueue();
                myQueue.enQueue(path.charAt(tic + 6 + i));
            }

        }

        String[] result = new String[msgCount];
        for (int i=0; i<msgCount; i++){
            result[i] = resultTmp.remove(i);
        }
        return result;
    }

    private static String mkmsg(int tic, int getWhenEvent, String whereTurn) {
        return "Time " + tic + ": Go Straight " + (getWhenEvent * 100) + "m and turn" + whereTurn;
    }

}
