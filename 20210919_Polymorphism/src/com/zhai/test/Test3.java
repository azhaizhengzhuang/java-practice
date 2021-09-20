package com.zhai.test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @Author: 江桂煌
 * @Description: 接口的示范
 * @DateTime: 2021/9/20 15:37
 **/

interface PlayMusic {
    void playMusic();

}

interface PlayVedio {
    void playVedio();
}

interface PlayGame {
    void playGame();
}

interface Call {
    void call();
}

class MP3 implements PlayMusic{

    @Override
    public void playMusic() {
        System.out.println("MP3 放音乐");
    }
}

class IPhone implements PlayMusic,PlayGame,PlayVedio,Call{


    @Override
    public void playMusic() {
        System.out.println("手机放音乐");
    }

    @Override
    public void playVedio() {
        System.out.println("手机放视频");
    }

    @Override
    public void playGame() {
        System.out.println("手机玩游戏");
    }

    @Override
    public void call() {
        System.out.println("手机打电话");
    }
}

class Computer implements PlayVedio, PlayGame,PlayMusic{

    @Override
    public void playMusic() {
        System.out.println("电脑放音乐");
    }

    @Override
    public void playVedio() {
        System.out.println("电脑放视频");
    }

    @Override
    public void playGame() {
        System.out.println("电脑玩游戏");
    }
}

//接口的继承
interface Media extends  PlayMusic,PlayVedio{

}
public class Test3 {

    public static void music(PlayMusic p) {
        p.playMusic();
    }

    public static void main2(String[] args) {
        //接口的向上转型
        PlayMusic p1 = new MP3();
        PlayMusic p2 = new Computer();
        PlayMusic p3 = new IPhone();
        music(p1);
        music(p2);
        music(p3);

    }
    public static void main1(String[] args) {
//        IPhone i = new IPhone();
//        i.playGame();
//        i.playMusic();
//        i.playVedio();
//        i.call();
//        MP3 m = new MP3();
//        m.playMusic();
    }

}
