package DSA_Projects;

class WhatAppv1{
    public void call(){
        System.out.println("Calling feature .......");
    }
    public void msg(){
        System.out.println("Message feature ........");
    }
}

class WhatAppvv2 extends WhatAppv1{
    public void status(){
        System.out.println("\nStatus is live .......");
    }
}

class WhatAppv3 extends WhatAppvv2{
    public void groupVideoCall(){
        System.out.println("\nGroup video call is live.......");
    }
}

public class InheertanceBasic {
    public static void main(String[] args) {
        WhatAppv1  w1= new WhatAppv1();

        w1.call();
        w1.msg();
//        w1.status();

        WhatAppvv2 w2 = new WhatAppvv2();
        w2.status();
        w2.call();
        w2.msg();

        WhatAppv3 w3 = new WhatAppv3();
        w3.groupVideoCall();
        w3.call();
    }
}
