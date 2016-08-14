package com.buch.getorganized;

/**
 * Created by sergiy.buchkovskyy on 14.08.2016.
 *
 *  object to reverse String
 */
public class ObjectWithString {

    private String str;

    public ObjectWithString(){   }

    public ObjectWithString(String str){   this.str = str;   }



    public void reverceString(){
        str = reverceString(str);
    }

    public String reverceString(String str){
        String outStr = "";

        for (int i = 0; i < str.length(); i++) {
            outStr += str.charAt(str.length() - 1 -i);
        }
        return outStr;
    }




    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
